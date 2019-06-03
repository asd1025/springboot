package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam("name") String name) {
		// String name
		// @RequestParam String name
		// 추천
		System.out.println("----"+name+"---");
		return "BoardController:update()";
	}
	
	
	@ResponseBody
	@RequestMapping("/write")
	public String write
	(@RequestParam(value="n" , required=true, defaultValue = "HYe") String name
 ,@RequestParam(value="age" , required=true, defaultValue = "0") int age) {
		System.out.println(name+" "+age+"살");
		return "BoardController:write()";
	}
	@ResponseBody
	@RequestMapping("/view/{no}")
	public String view(@PathVariable("no") Long no) {
		return "BoardController:view("+no+")";
	}
	 
	
}
