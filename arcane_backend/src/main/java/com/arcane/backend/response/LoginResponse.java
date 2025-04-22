package com.arcane.backend.response;


public class LoginResponse {
    private String token;

    private long expiresIn;


    public long getExpiresIn() {
        return expiresIn;
    }

    public String getToken() {
        return token;
    }
    public LoginResponse setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    public LoginResponse setToken(String token) {
        this.token = token;
        return this;
    }

    // Getters and setters...
}