package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/*
 * 	@RequestMapping
 * 	type 단독 매핑
 * 
 * 
 * */
@Controller
@RequestMapping("/guestbook/*")
public class GuestBookController {
	
	@ResponseBody
	@RequestMapping("/list")
	public String list() {
		
		return "Guestbook:list";
	}
	
	
}
