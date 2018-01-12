package com.vvijay26.springaop.demospringaop.business;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	public String retrieveSomething() {
		return "Data retrieved in dao1";
	}
}
