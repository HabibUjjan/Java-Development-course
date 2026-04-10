package com.student.ecommercebackend.repository;

import com.student.ecommercebackend.model.Order;
import com.student.ecommercebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// -----------------------------
// Order Repository
// -----------------------------
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
