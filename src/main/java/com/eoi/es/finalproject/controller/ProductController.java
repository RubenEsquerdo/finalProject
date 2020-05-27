package com.eoi.es.finalproject.controller;

import com.eoi.es.finalproject.entity.Product;
import com.eoi.es.finalproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/product/all")
    public List<Product> getAllProducts() {
        // return service.getAllProducts().stream().map((Product product) ->
        // modelMapper.map(product, ProductDto.class))
        // .collect(Collectors.toList());
        // return ResponseEntity.ok().body(service.getAllProducts());
        return service.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable String id) {
        return service.getProductById(Integer.parseInt(id));

    }

    @PostMapping("/product")
    public void createProduct(@RequestBody Product product) {
        Product entity = new Product();
        // BeanUtils.copyProperties(product, entity);

        service.createProduct(entity);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable String id) {
        service.deleteProduct(Integer.parseInt(id));
    }

    @PutMapping("product/{id}")
    public void updateProduct(@PathVariable String id) {
        Product product = service.getProductById(Integer.parseInt(id));
        service.createProduct(product);

    }

    @PutMapping("product/update{id}")
    public void updateProduct2(@RequestBody Product product) {
        Product myProduct = new Product();
        // BeanUtils.copyProperties(product, myProduct);

        service.createProduct(myProduct);
    }
    // GET ONE
    // CREATE 1(POST)
    // UPDATE 1(PUT)
    // DELETE 1
    // DELETE ALL

}