package com.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloContoller 
{
	@RequestMapping("/hello")
	public ModelAndView hello()
	{
		ModelAndView view = new ModelAndView();
		view.setViewName("hello");
		return null;
		
	}
}
