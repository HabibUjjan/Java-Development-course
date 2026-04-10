package com.student.ecommercebackend.controller;

import com.student.ecommercebackend.model.CartItem;
import com.student.ecommercebackend.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController{
    private final CartService service;
    public CartController(CartService service){ this.service=service; }

    @PostMapping("/add") public CartItem add(@RequestParam Long userId, @RequestParam Long productId, @RequestParam int qty){
        return service.addToCart(userId,productId,qty);
    }

    @GetMapping("/{userId}") public List<CartItem> getCart(@PathVariable Long userId){ return service.getCart(userId);}
}