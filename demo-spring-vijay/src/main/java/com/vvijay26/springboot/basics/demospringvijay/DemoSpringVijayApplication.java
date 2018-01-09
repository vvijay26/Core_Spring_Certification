package com.vvijay26.springboot.basics.demospringvijay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringVijayApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoSpringVijayApplication.class, args);

		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}

// http://localhost:8080/books