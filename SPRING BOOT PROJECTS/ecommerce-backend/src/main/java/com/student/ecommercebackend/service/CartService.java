package com.student.ecommercebackend.service;

import com.student.ecommercebackend.model.CartItem;
import com.student.ecommercebackend.model.Product;
import com.student.ecommercebackend.model.User;
import com.student.ecommercebackend.repository.CartRepository;
import com.student.ecommercebackend.repository.ProductRepository;
import com.student.ecommercebackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService{
    private final CartRepository repo;
    private final ProductRepository prodRepo;
    private final UserRepository userRepo;

    public CartService(CartRepository repo, ProductRepository prodRepo, UserRepository userRepo){
        this.repo=repo; this.prodRepo=prodRepo; this.userRepo=userRepo;
    }

    public CartItem addToCart(Long userId, Long productId, int qty){
        User u=userRepo.findById(userId).orElseThrow();
        Product p=prodRepo.findById(productId).orElseThrow();
        CartItem c=new CartItem(); c.setUser(u); c.setProduct(p); c.setQuantity(qty);
        return repo.save(c);
    }

    public List<CartItem> getCart(Long userId){
        User u=userRepo.findById(userId).orElseThrow();
        return repo.findByUser(u);
    }
}
