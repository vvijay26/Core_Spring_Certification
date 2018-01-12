package com.vvijay26.springaop.demospringaop.business;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
	public String retrieveSomething() {
		return "Data retrieved in dao2";
	}
}
