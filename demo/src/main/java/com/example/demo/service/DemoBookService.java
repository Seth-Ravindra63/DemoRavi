package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DemoBook;
import com.example.demo.model.DemoBookResponse;
import com.example.demo.repository.DemoBookRepository;

@Service
public class DemoBookService {

	@Autowired
	DemoBookRepository demoBookRepository;

	public DemoBookResponse saveBookService(DemoBook demobook, DemoBookResponse demoBookResponse) {
		demoBookRepository.save(demobook);
		demoBookResponse.setDemobookstatusresponse("Book is Saved");
		return demoBookResponse;

	}

	public List<DemoBook> getBookDetailsService() {

		return (List<DemoBook>) demoBookRepository.findAll();
	}

}
