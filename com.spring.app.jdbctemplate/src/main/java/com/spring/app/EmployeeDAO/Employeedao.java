package com.spring.app.EmployeeDAO;

import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.spring.app.Employeedb.Employee;


public interface Employeedao
{
	public int createEmp();
	
	public int updateEmp();
	
	public int deleteEmp();
	
	public Employee searchEmp(int id)throws SQLException;

}
