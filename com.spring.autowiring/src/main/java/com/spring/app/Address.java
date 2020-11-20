package com.spring.app;

import org.springframework.beans.factory.annotation.Required;

public class Address 
{
	private int houseno;
	private String street;
	private String city;
	private String country;
	public int getHouseno() {
		return houseno;
	}
	
	@Required
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", street=" + street + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
