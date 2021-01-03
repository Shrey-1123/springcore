package com.spring.app.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("productDAO")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;
	@Override
	@Transactional
	public int createProduct(Product product){
		
		Integer result = (Integer)hibernateTemplate.save(product);
		return result;
	}

}
