package com.spring.app.EmployeeRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.app.Employeedb.Employee;

public class EmployeerrowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employee employee = new Employee();
		employee.setId(rs.getInt(1)); // we used rs.getInt(1) bcz id is the first coulmn in the employee table
		employee.setFirstname(rs.getString(2)); // second column is firstname with datatype String
		employee.setLastname(rs.getString(3));// third column is lastname with dataype String in employee table
		
		
		return employee;
	}

}
