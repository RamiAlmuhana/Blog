package com.ramiblog.backend.dto;

public class LoginResponse {
    public String email;
    public String token;

    public LoginResponse(String email, String token) {
        this.email = email;
        this.token = token;
    }
}
