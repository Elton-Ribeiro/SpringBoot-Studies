package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	private static String SENTENCE = "This server is running with two potatoes!";
	private final String propertySentence;
	
	@Autowired
	public DemoController(@Value("${demo.sentence}") String propertySentence) {
		this.propertySentence = propertySentence; 
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloWorld() {
		return SENTENCE;
	}

	@RequestMapping(value = "/property/sentence", method = RequestMethod.GET)
	public String propertySentence() {
		return propertySentence;
	}
	
	@RequestMapping(value = "/update/sentence", method = RequestMethod.POST) 
	public void updateSentence(@RequestBody String updatedSentence) { 
		SENTENCE = updatedSentence;
	}
}
