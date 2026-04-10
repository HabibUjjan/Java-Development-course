package com.student.ecommercebackend.service;

import com.student.ecommercebackend.model.User;
import com.student.ecommercebackend.repository.UserRepository;
import com.student.ecommercebackend.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    @Autowired
    public UserService(UserRepository userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public String loginUser(String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if(optionalUser.isPresent() && optionalUser.get().getPassword().equals(password)) {
            return jwtUtil.generateToken(email);
        }
        throw new RuntimeException("Invalid email or password");
    }
}