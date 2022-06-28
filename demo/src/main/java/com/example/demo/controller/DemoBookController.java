package com.example.demo.controller;

import com.example.demo.model.DemoBook;
import com.example.demo.model.DemoBookResponse;
import com.example.demo.service.DemoBookServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Slf4j
public class DemoBookController {

    private final DemoBookServiceImpl demoBookService;


    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<DemoBook> getBookDetails() {
        return demoBookService.getBookDetailsService();
    }


    @PostMapping("/save/book")
    @ResponseStatus(HttpStatus.CREATED)
    public DemoBookResponse saveBookDetails(@RequestBody DemoBook demobook) {
        log.info("Book title is: {}, author is: {}, price is: {}", demobook.getTitle(), demobook.getAuthor(), demobook.getPrice());
        return demoBookService.saveBookService(demobook);
    }

}
