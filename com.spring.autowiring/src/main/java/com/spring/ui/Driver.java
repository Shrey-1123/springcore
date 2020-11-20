package com.spring.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.Employee;

public class Driver {

	public static void main(String[] args) {
		//Test comment
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee emp=(Employee)context.getBean("employee");
		System.out.println(emp);
	}

}
