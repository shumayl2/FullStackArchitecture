package com.Fitness.UserServicefitness.Service;


import com.Fitness.UserServicefitness.Dto.RegisterRequest;
import com.Fitness.UserServicefitness.Dto.UserResponse;
import com.Fitness.UserServicefitness.Entity.User;
import com.Fitness.UserServicefitness.Repository.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userrepo;

    public UserResponse register(RegisterRequest register) {

        userMapper mapper = Mappers.getMapper(userMapper.class);

        if(userrepo.existsByEmail(register.getEmail())){
            throw new RuntimeException("Email alrady exist ");
        }

        User user = new User();
        user.setFirstname(register.getFirstname());
        user.setLastname(register.getLastname());
        user.setEmail(register.getEmail());
        user.setPassword(register.getPassword());


        User save = userrepo.save(user);
        UserResponse userResponse = mapper.mapUserToUsertRsponse(save);


        return userResponse;
    }
}

