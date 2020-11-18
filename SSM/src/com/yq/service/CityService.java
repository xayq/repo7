package com.yq.service;

import com.yq.entity.CityInfo;

public interface CityService {
	public CityInfo getCity(Integer cid);
	public void addCity(CityInfo city);
	public void updateCity(CityInfo city);
	public void delCity(Integer cid);
}
