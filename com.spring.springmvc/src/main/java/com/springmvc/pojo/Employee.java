package com.springmvc.pojo;

public class Employee 
{
	private int Id;
	private String name;
	private String department;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", department=" + department + "]";
	}
	
	
}
