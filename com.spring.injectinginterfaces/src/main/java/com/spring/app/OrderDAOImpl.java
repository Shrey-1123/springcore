package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO{
	
	
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("Inside order");
	}

	
}
