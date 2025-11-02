package com.Fitness.UserServicefitness.Dto;

import com.Fitness.UserServicefitness.Entity.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
public class UserResponse {

    private String id;



    private String firstname;
    private String lastname;
    private String email;

    private String password;




    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
