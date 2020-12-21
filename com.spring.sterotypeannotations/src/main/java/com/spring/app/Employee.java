package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//this annotation will tell container to scan the package and search the respective class for which object has to be made
@Component
public class Employee {
	//this annotation will inject values inside object without XML file
	@Value("Shrey")
	private String name;
	
	@Value("8898")
	private int id;
	
	//this annotation will tell container to create object without XML configuartion
	@Autowired
	private Profile profile;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", profile=" + profile + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}
