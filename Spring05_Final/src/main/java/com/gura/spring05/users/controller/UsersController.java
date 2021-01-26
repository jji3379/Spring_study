package com.gura.spring05.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.users.dto.UsersDto;
import com.gura.spring05.users.service.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	private UsersService service;
	
	@RequestMapping("/users/signup_form")
	public String signupForm(@ModelAttribute UsersDto dto) {
		
		return "users/signup_form";
	}
	
}
