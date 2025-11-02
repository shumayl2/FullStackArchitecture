package com.Fitness.UserServicefitness.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name ="users")
@Data
public class User {

    @Id
    private String id;


    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private UserRole user = UserRole.USER;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;






}
