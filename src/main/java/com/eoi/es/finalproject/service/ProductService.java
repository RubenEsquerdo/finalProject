package com.eoi.es.finalproject.service;

import com.eoi.es.finalproject.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();

    public Product getProductById(int id);

    public void createProduct(Product product);

    public void deleteProduct(int id);

    public void updateProduct2(Product product);

    public void updateProduct(Product product);

}
