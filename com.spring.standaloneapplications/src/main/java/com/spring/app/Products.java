package com.spring.app;

import java.util.List;

public class Products {
	
	private List<String> productNames;

	@Override
	public String toString() {
		return "Products [productNames=" + productNames + "]";
	}

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}
	

}
