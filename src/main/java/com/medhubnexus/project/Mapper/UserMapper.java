package com.medhubnexus.project.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.medhubnexus.project.Dto.SignUpDto;
import com.medhubnexus.project.Dto.UserDto;
import com.medhubnexus.project.Model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);
    
    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}