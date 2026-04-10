package com.student.ecommercebackend.controller;

import com.student.ecommercebackend.model.Order;
import com.student.ecommercebackend.service.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController{
    private final OrderService service;
    public OrderController(OrderService service){ this.service=service; }

    @PostMapping("/place/{userId}") public Order placeOrder(@PathVariable Long userId){ return service.placeOrder(userId); }
}
