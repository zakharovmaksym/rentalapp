package com.example.rentalapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public String encodePassword(String rawPassword) {
        // Encode the raw password using BCryptPasswordEncoder
        return passwordEncoder.encode(rawPassword);
    }

    public boolean matchPasswords(String rawPassword, String encodedPassword) {
        // Check if the raw password matches the encoded password
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}