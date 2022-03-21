package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

		@Bean
		public BookRepository bookRepository() {
			return new BookRepository();
		}
		
		@Bean
		public BookService bookService()  {
			return new BookService();
		}
		
}
