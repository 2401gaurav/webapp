package com.retro.service;

import java.util.List;

import com.retro.dto.UserDto;


public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}
