package com.yq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yq.entity.CityInfo;
import com.yq.mapper.CityMapper;
import com.yq.service.CityService;
@Service("cityService")
public class CityServiceImpl implements CityService {
	@Autowired
	private CityMapper cityMapper;
	public CityInfo getCity(Integer cid) {
		// TODO Auto-generated method stub
		return cityMapper.getCity(cid);
	}
	public void addCity(CityInfo city) {
		// TODO Auto-generated method stub
		cityMapper.addCity(city);
	}
	public void updateCity(CityInfo city) {
		// TODO Auto-generated method stub
		cityMapper.updateCity(city);
	}
	public void delCity(Integer cid) {
		// TODO Auto-generated method stub
		cityMapper.delCity(cid);
	}

}
