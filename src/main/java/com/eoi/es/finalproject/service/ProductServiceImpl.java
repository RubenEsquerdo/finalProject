package com.eoi.es.finalproject.service;

import com.eoi.es.finalproject.entity.Product;
import com.eoi.es.finalproject.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired(required = true)
    ProductRepository repository;

    @Override
    public List<Product> getAllProducts() {
        return this.repository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return this.repository.findById(id).get();
    }

    @Override
    public void createProduct(Product product) {
        this.repository.save(product);
    }

    @Override
    public void deleteProduct(int id) {
        this.repository.deleteById(id);
    }

    @Override
    public void updateProduct(Product product) {

        this.repository.save(product);
    }

    @Override
    public void updateProduct2(Product product) {
        this.repository.save(product);
    }

}
