package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	
	public ProductService() {
		System.out.println("Service object created.");
	}
	
	@Autowired
	private IProductDao dao; //HAS-A relation
	
	public void test() {
		System.out.println("From Product Service");
		dao.save();
	}

}
