package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.service.UserService;
import com.web.vo.UserVo;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//로그인폼
	@GetMapping("/loginForm")
	public String loginForm() {
		
		return "/user/loginForm";
		
	}
	
	//로그인
	@GetMapping("/login")
	public String login(@RequestParam("id")String id, @RequestParam("password")int password, HttpSession session) {
		
		UserVo authUser = userService.login(id, password);
		
		/* 세션에 로그인 회원 정보 저장 */
		if(authUser != null) {
			session.setAttribute("authUser", authUser);
			return "/main/main";
		}else {return "/user/loginForm";}

		}

}
