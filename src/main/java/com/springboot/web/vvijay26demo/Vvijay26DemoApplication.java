package com.springboot.web.vvijay26demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Vvijay26DemoApplication {

	public static void main(String[] args) {
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());

		// Application Context - because of the below bean management by spring,
		// the manual instantiation of BubbleSort() is not required.
		org.springframework.context.ApplicationContext applicationContext = SpringApplication
				.run(Vvijay26DemoApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] { 12, 3, 67 }, 3);
		System.out.println("Result is" + result);

	}
}
