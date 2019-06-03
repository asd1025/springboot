package com.cafe24.springex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	// request.getServletContextPath 이건 Java EE 기술
	// Spring에서는 이 기술을 모르더라도 사용 가능
	@RequestMapping("/hello")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	
	@RequestMapping("/hello2")
	public ModelAndView hello2() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("email","kiscar@gmail.com");
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}
	@RequestMapping("/hello3")
	public String hello3(Model model) {
		model.addAttribute("email", "dooly@gmail.com");
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello4")
	//
	public String hello4(Model model
			,@RequestParam String name/*어노테이션에 value 생략시 변수 이름으로 
			request parameter 로 찾는다*/
			,@RequestParam(value="email") String email) {
		model.addAttribute("email", email);
		System.out.println(name);
		return "/WEB-INF/views/hello.jsp";
	}
	@RequestMapping("/hello5")
	public String hello5(Model model, HttpServletRequest request ) {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		model.addAttribute("email", email);
		model.addAttribute("name", name);
		return "/WEB-INF/views/hello.jsp";
	}
	
}
