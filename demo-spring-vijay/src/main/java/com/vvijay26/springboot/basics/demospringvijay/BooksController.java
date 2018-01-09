package com.vvijay26.springboot.basics.demospringvijay;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		// automatically returned as json because of spring-boot-starter-json dependency
		// on pom.xml
		return Arrays.asList(new Book(1l, "Example", "Vijay"));
	}
}
