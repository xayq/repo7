package com.yq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yq.entity.UserInfo;
import com.yq.mapper.UserMapper;
import com.yq.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	public List<UserInfo> findAll() {
		// TODO Auto-generated method stub
		return userMapper.findAll();
	}

}
