package com.example.demo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.example.demo.DemoApplication;

@Service
public class DemoService {
	private static final Logger logger = LogManager.getLogger(DemoApplication.class);

	public void testString() {
		String inputstring="f r#u i t^ ap&p le";
		//remove special char in string using space
		inputstring = inputstring.replaceAll("[^a-zA-Z0-9]", " ");  
		System.out.println(inputstring);
		for(int i=0; i<inputstring.length();i++) {
		char c=inputstring.charAt(i);
		//checking spaces in string by char and logging error
		if(c==' ') {
			logger.error("space is there in string at " +(i) +" index of "+inputstring);
		String s2=Character.toString(c);
		s2.replaceAll("\\s+"," ");
		System.out.println(s2);
		}
		
		}
	}

}
