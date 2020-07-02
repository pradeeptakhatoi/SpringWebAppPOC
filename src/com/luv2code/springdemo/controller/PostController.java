package com.luv2code.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post")
public class PostController {
	
	@RequestMapping("/list")
	public String list() {
		return "list";
	}

}
