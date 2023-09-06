package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2AutowireExTwoApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(SpringBoot2AutowireExTwoApplication.class, args);
		ProductService ps=ac.getBean("productService",ProductService.class);
		ps.test();
	}

}
