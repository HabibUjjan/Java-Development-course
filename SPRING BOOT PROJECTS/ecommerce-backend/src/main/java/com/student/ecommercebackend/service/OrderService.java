package com.student.ecommercebackend.service;

import com.student.ecommercebackend.model.CartItem;
import com.student.ecommercebackend.model.Order;
import com.student.ecommercebackend.model.User;
import com.student.ecommercebackend.repository.CartRepository;
import com.student.ecommercebackend.repository.OrderRepository;
import com.student.ecommercebackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService{
    private final OrderRepository orderRepo;
    private final CartRepository cartRepo;
    private final UserRepository userRepo;

    public OrderService(OrderRepository orderRepo, CartRepository cartRepo, UserRepository userRepo){
        this.orderRepo=orderRepo; this.cartRepo=cartRepo; this.userRepo=userRepo;
    }

    public Order placeOrder(Long userId){
        User u=userRepo.findById(userId).orElseThrow();
        List<CartItem> items=cartRepo.findByUser(u);
        double total=items.stream().mapToDouble(i->i.getQuantity()*i.getProduct().getPrice()).sum();
        Order o=new Order(); o.setUser(u); o.setTotalAmount(total); o.setStatus("PLACED");
        orderRepo.save(o);
        cartRepo.deleteAll(items);
        return o;
    }
}