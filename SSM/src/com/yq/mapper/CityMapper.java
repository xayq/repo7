package com.yq.mapper;

import com.yq.entity.CityInfo;

public interface CityMapper {
	public CityInfo getCity(Integer cid);
	public void addCity(CityInfo city);
	public void updateCity(CityInfo city);
	public void delCity(Integer cid);
}
