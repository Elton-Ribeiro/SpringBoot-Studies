package com.example.demo;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class BookRepository {

	public List<String> findBookTitles() {
		return List.of("Pedra do Reino", "Pedagogia do Oprimido");
	}
	
}
