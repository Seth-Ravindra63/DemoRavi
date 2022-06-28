package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.DemoBook;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoBookRepository extends JpaRepository<DemoBook, Long> {

}
