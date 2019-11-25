package com.example.demo;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Book;

import com.example.demo.service.BookServiceImpl;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(HibernateApplication.class, args);
		BookServiceImpl pro1 = ctx.getBean(BookServiceImpl.class);
		pro1.addBook(book());
		
		pro1.getBooks().forEach(System.out::println);
	}
	
	@Bean
	public static Book book()
	{
		return new Book(102,"vdsi");
	}

}
