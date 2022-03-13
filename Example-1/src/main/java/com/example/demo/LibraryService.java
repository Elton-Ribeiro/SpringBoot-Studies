package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryService {

	private BookService bookService; //private final sem setter 
	private BookRepository bookRepository; //private final sem setter

	// CONTRUCTOR
//	@Autowired
//	public LibraryService(final BookService bookService,final BookRepository bookRepository) {
//		System.out.println("objeto libraryService criado");
//		this.bookService = bookService;
//		this.bookRepository = bookRepository;
//	}

	public LibraryService() {
		System.out.println("objeto libraryService criado");
	}

	@Autowired
	public void setBookService(BookService bookService) {
		System.out.println("dependência bookService injetada pelo Spring");
		this.bookService = bookService;
	}

	@Autowired
	public void setBookRepository(BookRepository bookRepository) {
		System.out.println("dependência bookRepository injetada pelo Spring");
		this.bookRepository = bookRepository;
	}

}
