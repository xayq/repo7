package com.yq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yq.entity.CityInfo;
import com.yq.service.CityService;

@Controller
public class CityController {
	@Autowired
	private CityService cityService;
	@RequestMapping(value="/get")
	public String get(Integer cid,ModelMap model){
		CityInfo city=cityService.getCity(cid);
		model.put("city", city);
		return "index";
	}
	@RequestMapping(value="/add")
	public String add(){
		CityInfo city=new CityInfo("÷ÿ«Ï");
		cityService.addCity(city);
		return "index";
	}
	@RequestMapping(value="/update")
	public String update(){
		CityInfo city=cityService.getCity(2);
		city.setCname("±±∆Ω");
		cityService.updateCity(city);
		return "index";
	}
	@RequestMapping(value="/delete")
	public String delete(Integer cid){
		cityService.delCity(cid);
		return "index";
	}
}
