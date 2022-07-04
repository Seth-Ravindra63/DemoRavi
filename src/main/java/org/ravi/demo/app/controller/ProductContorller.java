package org.ravi.demo.app.controller;

import org.ravi.demo.app.model.Product;
import org.ravi.demo.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductContorller {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public  Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public  List<Product> addProducts(@RequestBody List<Product> products){
        return productService.saveProducts(products);
    }

    @GetMapping("/product/{productId}")
    public Product findProductById(@PathVariable  int productId){
        return productService.getProductById(productId);
    }

    @GetMapping("/product/{productName}")
    public Product findProductByName(@PathVariable String productName){
        return productService.getProductByName(productName);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return productService.getAllProducts();
    }

    @PutMapping("/updateProduct")
    public  Product updateProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @DeleteMapping("/delete/{productId)")
    public String deleteProduct(@PathVariable int productId){

        productService.deleteProduct(productId);
        return "Product deleted successfully";
    }

}
