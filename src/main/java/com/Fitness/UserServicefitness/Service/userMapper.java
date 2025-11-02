package com.Fitness.UserServicefitness.Service;


import com.Fitness.UserServicefitness.Dto.UserResponse;
import com.Fitness.UserServicefitness.Entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface userMapper {

     UserResponse mapUserToUsertRsponse(User user);
}
