package com.ramiblog.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomUser {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String infix;
    private String lastName;
    private String email;
    private String password;
    @Column(name = "role")
    private String role;


    public CustomUser(String name, String infix, String lastName, String email, String password, String role) {
        this.name = name;
        this.infix = infix;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

}

