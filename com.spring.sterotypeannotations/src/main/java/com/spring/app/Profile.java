package com.spring.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

	@Value("PAT")
	private String designation;
	
	@Value("Delhi")
	private String location;
	
	
	
	@Override
	public String toString() {
		return "Profile [designation=" + designation + ", location=" + location + "]";
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
