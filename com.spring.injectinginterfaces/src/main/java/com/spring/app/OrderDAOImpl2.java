/**
 * 
 */
package com.spring.app;

import org.springframework.stereotype.Component;

/**
 * @author shreykumar
 *
 */
@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("Inside order 2");

	}

}
