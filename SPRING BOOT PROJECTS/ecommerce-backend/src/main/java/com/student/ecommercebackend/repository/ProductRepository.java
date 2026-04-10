package com.student.ecommercebackend.repository;

import com.student.ecommercebackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// -----------------------------
// Product Repository
// -----------------------------
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}
