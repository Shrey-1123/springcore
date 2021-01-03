package com.spring.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.model.Product;
import com.spring.app.model.ProductDAO;

public class Driver {

	public static void main(String[] args) {
		
		try
		{
			@SuppressWarnings("resource")
			ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
			ProductDAO productdao=(ProductDAO)context.getBean("productDAO");
			Product product=new Product();
			product.setId(1);
			product.setName("Apple");
			product.setDesc("Mobile");
			product.setPrice(700);
			productdao.createProduct(product);
		}
		catch(Exception e)
		{
			System.out.println("Insertion not successfull "+e);
		}
		
	}

}
