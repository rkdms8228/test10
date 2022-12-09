package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	//test
	@GetMapping("/test")
	public String test() {
		
		return "/test";
		
	}
	
	//main 화면
	@GetMapping("/main")
	public String main() {
		
		return "/main/main";
		
	}

}
