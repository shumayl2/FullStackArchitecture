package com.Fitness.UserServicefitness.Controller;


import com.Fitness.UserServicefitness.Dto.RegisterRequest;
import com.Fitness.UserServicefitness.Dto.UserResponse;
import com.Fitness.UserServicefitness.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
        public ResponseEntity<UserResponse> register(@RequestBody RegisterRequest request){
            UserResponse register1 = userService.register(request);
            return new ResponseEntity<>(register1, HttpStatus.CREATED);

        }
    }



