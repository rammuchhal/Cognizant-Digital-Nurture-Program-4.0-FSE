package com.example.jwt_auth.controller;

import com.example.jwt_auth.util.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String header = request.getHeader("Authorization");

        if (header == null || !header.startsWith("Basic ")) {
            return ResponseEntity.status(401).body("Missing or invalid Authorization header.");
        }

        String base64Credentials = header.substring("Basic ".length());
        byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(credDecoded);
        String[] values = credentials.split(":", 2);

        String username = values[0];
        String password = values[1];

        // Hardcoded user validation
        if (username.equals("user") && password.equals("pwd")) {
            String token = jwtUtil.generateToken(username);
            return ResponseEntity.ok().body("{\"token\": \"" + token + "\"}");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
