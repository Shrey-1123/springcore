package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("bo")
public class OrderBOImpl implements OrderBO{

	@Autowired
	@Qualifier("dao2") // define a bean object uniquely
	private OrderDAO dao;
	
	
	public void orderBO() {
		// TODO Auto-generated method stub
		System.out.println("Inside orderBO");
		dao.order();
	}


	public OrderDAO getDao() {
		return dao;
	}


	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
