package com.eoi.es.finalproject.service;


import com.eoi.es.finalproject.entity.Order;
import com.eoi.es.finalproject.repository.BuyerRepository;
import com.eoi.es.finalproject.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    BuyerRepository buyerRepository;


    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOneOrder(int id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }



    @Override
    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }
}
