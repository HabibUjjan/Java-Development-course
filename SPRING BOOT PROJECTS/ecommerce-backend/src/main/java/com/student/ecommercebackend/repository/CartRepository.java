package com.student.ecommercebackend.repository;

import com.student.ecommercebackend.model.CartItem;
import com.student.ecommercebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// -----------------------------
// Cart Repository
// -----------------------------
@Repository
public interface CartRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByUser(User user);
}
