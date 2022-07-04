package org.ravi.demo.app.service;

import org.ravi.demo.app.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public Product saveProduct(Product product);
    public List<Product> saveProducts(List<Product> productList);
    public List<Product> getAllProducts();
    public Product getProductById(int productId);
    public Product getProductByName(String productName);
    public String deleteProduct(int productId);
    public Product updateProduct(Product product);

}
