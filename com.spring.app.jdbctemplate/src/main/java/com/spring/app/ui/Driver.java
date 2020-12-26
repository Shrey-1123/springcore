package com.spring.app.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.app.EmployeeDAO.Employeedao;
import com.spring.app.Employeedb.Employee;

public class Driver {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employeedao employee=(Employeedao)context.getBean("employeedao");
		
		try
		{

			//invode searchEmp method
			Employee emp=employee.searchEmp(2);// lets search for id 2
			System.out.println("Employee exist!");
			System.out.println("Employee details:");
			System.out.println(emp);
		}
		catch(Exception e)
		{
			System.out.println("Employee don't exist!");
		}
		

	}

}
