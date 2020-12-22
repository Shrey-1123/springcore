package com.spring.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.OrderBO;
import com.spring.app.OrderBOImpl;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		OrderBO bo=(OrderBO)context.getBean("bo");
		bo.orderBO();
	}

}
