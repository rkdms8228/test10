package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.mapper.UserMapper;
import com.web.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public UserVo login(String id, int password) {

		return userMapper.login(id, password);
		
	}

}
