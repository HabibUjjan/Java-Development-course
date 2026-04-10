package com.student.ecommercebackend.dto;


import lombok.Data;

// -----------------------------
// Auth Response DTO
// -----------------------------
@Data
public class AuthResponse {
    private String token;
    public AuthResponse(String token){
        this.token = token;
    }
}
