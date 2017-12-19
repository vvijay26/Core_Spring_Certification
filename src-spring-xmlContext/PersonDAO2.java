package com.springboot.web.vvijay26demo.xmlcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO2 {

	@Autowired
	JdbcConnection2 jdbcConnection2;

	public JdbcConnection2 getJdbcConnection2() {
		return jdbcConnection2;
	}

	public void setJdbcConnection2(JdbcConnection2 jdbcConnection2) {
		this.jdbcConnection2 = jdbcConnection2;
	}

}
