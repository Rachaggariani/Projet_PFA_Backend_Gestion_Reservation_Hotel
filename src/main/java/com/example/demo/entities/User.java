package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor // Génère le constructeur avec tous les arguments
@NoArgsConstructor  // Génère le constructeur sans argument (nécessaire pour Hibernate)
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;

    @Enumerated(EnumType.STRING)
    private Role role;


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
