package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BookService {

	public String findAuthor(final String bookName) {
		if (bookName.equals("Pedra do Reino")) {
			return "Ariano Suassuna";
		}
		
		if (bookName.equals("Pedagogia do Oprimido")) {
			return "Paulo Freire";
		}
		return "Não encontrado";
	}
	
}
