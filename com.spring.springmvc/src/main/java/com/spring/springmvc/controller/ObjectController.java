package com.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.springmvc.pojo.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/UserRegistration")
	public ModelAndView displayReigrationPage()
	{
		ModelAndView view = new ModelAndView();
		view.setViewName("RegistrationPage");
		return view;
		
	}
	
	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public ModelAndView userRegistration(@ModelAttribute("employee") Employee employee)
	{
		ModelAndView newview =new ModelAndView();
		System.out.println(employee);
		newview.addObject("employee",employee);
		newview.setViewName("userResponse");
		return newview;
		
	}
}
