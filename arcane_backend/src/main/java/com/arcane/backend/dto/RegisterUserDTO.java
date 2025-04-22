package com.arcane.backend.dto;

import lombok.Getter;
import lombok.Setter;


public class RegisterUserDTO {

    private String username;
    private String password;
    private String email;

    public RegisterUserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public RegisterUserDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public RegisterUserDTO setUsername(String username) {
        this.username = username;
        return this;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
