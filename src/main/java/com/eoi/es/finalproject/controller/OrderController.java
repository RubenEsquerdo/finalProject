package com.eoi.es.finalproject.controller;


import com.eoi.es.finalproject.entity.Order;
import com.eoi.es.finalproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {


    @Autowired
    private OrderService orderService;


    @GetMapping("/order")

    public List<Order> getAll() {
        return orderService.getAll();
    }

    @GetMapping("/order/{id}")

    public Order getOneOrder(@PathVariable String id) {
        return orderService.getOneOrder(Integer.parseInt(id));
    }

    @PostMapping("/order")

    public  Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @DeleteMapping("/order/{id}")

    public void deleteOrder(@PathVariable String id){
        orderService.deleteOrder(Integer.parseInt(id));
    }
}
