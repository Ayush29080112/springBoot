package com.ayush.springboot.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ayush.springboot.Bean.Books;

@RestController
public class BooksController {
	@RequestMapping(path="/books",method=RequestMethod.GET)
	public Books getAllBooks(){
		Books book=new Books();
		book.setId(1);
		book.setName("Spring boot Book");
		
		return book;
		
	}
}
