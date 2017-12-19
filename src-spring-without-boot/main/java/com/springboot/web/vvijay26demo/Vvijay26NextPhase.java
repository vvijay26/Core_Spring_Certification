package com.springboot.web.vvijay26demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springboot.web.vvijay26demo.scope.PersonDAO;

@Configuration
@ComponentScan
public class Vvijay26NextPhase {

	private static Logger LOGGER = LoggerFactory.getLogger(Vvijay26NextPhase.class);

	public static void main(String[] args) {
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());

		// Application Context - because of the below bean management by spring,
		// the manual instantiation of BubbleSort() is not required.
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Vvijay26NextPhase.class);
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		System.out.println("Test");

		LOGGER.info("-----Logged output-------");

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());

	}
}
