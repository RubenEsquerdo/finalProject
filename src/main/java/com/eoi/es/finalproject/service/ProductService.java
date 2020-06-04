package com.eoi.es.finalproject.service;

import com.eoi.es.finalproject.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();

    public Product getProductById(int id);

    public Product createProduct(Product product);

    public void deleteProduct(int id);



}
