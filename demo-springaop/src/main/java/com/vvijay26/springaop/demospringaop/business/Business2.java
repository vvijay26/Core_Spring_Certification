package com.vvijay26.springaop.demospringaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
	@Autowired
	private Dao2 dao2;

	public String calculateSomething() {
		// Add Business Logic
		return dao2.retrieveSomething();
	}

}
