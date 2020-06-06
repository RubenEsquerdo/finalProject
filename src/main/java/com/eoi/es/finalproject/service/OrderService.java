package com.eoi.es.finalproject.service;

import com.eoi.es.finalproject.entity.Order;

import java.util.List;

public interface OrderService {

    public List<Order> getAll();

    public Order getOneOrder(int id);

    public Order createOrder(Order order);



    public void deleteOrder(int id);



}
