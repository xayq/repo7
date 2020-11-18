package com.yq.entity;

import java.util.List;

public class CityInfo {
	private Integer cid;
	private String cname;
	private List<UserInfo> users;
	
	public CityInfo() {
		super();
	}
	public CityInfo(String cname) {
		super();
		this.cname = cname;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<UserInfo> getUsers() {
		return users;
	}
	public void setUsers(List<UserInfo> users) {
		this.users = users;
	}
	
}
