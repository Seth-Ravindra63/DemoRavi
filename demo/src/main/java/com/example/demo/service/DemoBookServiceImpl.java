package com.example.demo.service;

import com.example.demo.model.DemoBook;
import com.example.demo.model.DemoBookResponse;
import com.example.demo.repository.DemoBookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DemoBookServiceImpl implements DemoService {

    private final DemoBookRepository demoBookRepository;

    @Override
    public List<DemoBook> getBookDetailsService() {
        return demoBookRepository.findAll();
    }

    @Override
    public DemoBookResponse saveBookService(DemoBook demobook) {
        demoBookRepository.save(demobook);
        return new DemoBookResponse("Book is Saved");

    }

}
