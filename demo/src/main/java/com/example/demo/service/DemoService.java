package com.example.demo.service;

import com.example.demo.model.DemoBook;
import com.example.demo.model.DemoBookResponse;

import java.util.List;

public interface DemoService {

    DemoBookResponse saveBookService(DemoBook demobook);
    List<DemoBook> getBookDetailsService();
}
