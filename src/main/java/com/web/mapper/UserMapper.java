package com.web.mapper;

import org.springframework.stereotype.Repository;

import com.web.vo.UserVo;

@Repository("UserMapper")
public interface UserMapper {

	public UserVo login(String id, int password);

}
