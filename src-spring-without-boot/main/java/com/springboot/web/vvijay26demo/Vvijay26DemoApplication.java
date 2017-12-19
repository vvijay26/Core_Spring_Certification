package com.springboot.web.vvijay26demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.web.vvijay26demo.basic.BinarySearchImpl;

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
		System.out.println("First Bean result is" + result);
		System.out.println("First Bean is" + binarySearch);

		// singleton examples
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println("Second Bean result is is" + result);
		System.out.println("Second Bean is" + binarySearch1);
		// What the above 3 lines mean is we get the same bean if called twice also.
		// These are singleton examples. By Default, spring beans are singleton.
		// If different beans (different instances of the class) are
		// required. Use @scope("Prototye") in the respective class.

	}
}
