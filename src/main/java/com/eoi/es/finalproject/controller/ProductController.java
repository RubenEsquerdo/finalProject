package com.eoi.es.finalproject.controller;

import com.eoi.es.finalproject.entity.Product;
import com.eoi.es.finalproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin (origins = "http://localhost:4200")
@RestController
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping("/product/all")
    public List<Product> getAllProducts() {

        return service.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable String id) {
        return service.getProductById(Integer.parseInt(id));

    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {

        return service.createProduct(product);


    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable String id) {
        service.deleteProduct(Integer.parseInt(id));
    }

    @PutMapping("/product/{id}")
    public void updateProduct(@RequestBody Product product , @PathVariable String id) {
        Product product1 = service.getProductById(Integer.parseInt(id));
        product1.setCantidad(product.getCantidad());
        service.createProduct(product);
    }


}