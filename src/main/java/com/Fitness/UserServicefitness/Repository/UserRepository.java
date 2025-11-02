package com.Fitness.UserServicefitness.Repository;

import com.Fitness.UserServicefitness.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

    Boolean existsByEmail(String email);
}
