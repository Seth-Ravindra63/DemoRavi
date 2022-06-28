package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.DemoBook;

public interface DemoBookRepository extends CrudRepository<DemoBook, Integer> {


}
