package com.tnsif.assignment3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Products {
	List <String> ProductList=new LinkedList<>();	
	public Products() {
		
	}

	public Products(List<String> productList) {
		
		ProductList = productList;
	}
	
	public List<String> getProductList() {
		return ProductList;
	}

	public void setProductList(List<String> productList) {
		ProductList = productList;
	}

	public void addProductToList(String product)
	{
		ProductList.add(product);
	
	}
	public void sortProductList()
	{
		Collections.sort(ProductList);
	}
}
