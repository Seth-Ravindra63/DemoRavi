package org.ravi.demo.app.repository;

import org.ravi.demo.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String productName);
}
