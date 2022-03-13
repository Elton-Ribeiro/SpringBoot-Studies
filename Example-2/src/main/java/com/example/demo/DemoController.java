package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	private static String SENTENCE = "This server is running with two potatoes!";

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloWorld() {
		return SENTENCE;
	}

	@RequestMapping(value = "/update/sentence", method = RequestMethod.POST) 
	public void updateSentence(@RequestBody String updatedSentence) { 
		SENTENCE = updatedSentence;
	}
}
