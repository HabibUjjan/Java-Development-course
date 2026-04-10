package com.student.ecommercebackend.dto;

import lombok.Data;

// -----------------------------
// Login Request DTO
// -----------------------------
@Data
public class LoginRequest {
    private String email;
    private String password;
}
