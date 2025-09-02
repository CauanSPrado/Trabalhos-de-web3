package com.example.todolist.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 100)
    private String name;

    @NotNull
    @Email
    @Size(max = 150)
    private String email;

    @NotNull
    @Size(max = 100)
    private String password;

    @Size(max = 20)
    private String phone;

    private boolean active = true;

    // Getters e Setters
}
