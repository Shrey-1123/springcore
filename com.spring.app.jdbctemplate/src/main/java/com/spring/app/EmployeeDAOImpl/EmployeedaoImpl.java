package com.spring.app.EmployeeDAOImpl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.app.EmployeeDAO.Employeedao;
import com.spring.app.Employeedb.Employee;
import com.spring.app.EmployeeRowMapper.EmployeerrowMapper;

@Component
public class EmployeedaoImpl implements Employeedao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int createEmp() {

		String sql = "insert into employee values(?,?,?)";
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstname("Shrey");
		emp.setLastname("Kumar");
		int result = jdbcTemplate.update(sql, emp.getId(), emp.getFirstname(), emp.getLastname());

		return result;
	}

	@Override
	public int deleteEmp() {

		String sql = "delete from employee where id=?";
		Employee emp = new Employee();
		emp.setId(1);
		int result = jdbcTemplate.update(sql, emp.getId());
		if (result < 1) {
			return -1;
		}

		return result;
	}

	@Override
	public int updateEmp() {

		String sql = "update employee set firstname=?,lastname=? where id=?";
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstname("Amit");
		emp.setLastname("Kumar");
		int result = jdbcTemplate.update(sql, emp.getFirstname(), emp.getLastname(), emp.getId());
		if (result < 1) {
			return -1;
		}
		return result;
	}

	@Override
	public Employee searchEmp(int id) throws SQLException {// id we need to search for in the employee table

		String sql = "select * from employee where id=?";
		EmployeerrowMapper rowMapper = new EmployeerrowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, id);

		return employee;
	}

}
