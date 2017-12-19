package com.springboot.web.vvijay26demo.xmlcontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vvijay26XmlApplication {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			PersonDAO2 personDao2 = applicationContext.getBean(PersonDAO2.class);
			System.out.println("Wow");
			System.out.println("XmlTest");
		}
	}
}