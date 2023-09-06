package com.example;

import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements IProductDao {
	
	public ProductDaoImpl() {
		System.out.println("Dao object created.");
	}
	
	public void save() {
		System.out.println("From Product Dao");
	}

}
