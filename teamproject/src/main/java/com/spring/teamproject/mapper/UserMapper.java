package com.spring.teamproject.mapper;

import com.spring.teamproject.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDto> getUserList();
    void insertUser(UserDto userDto);
    UserDto getUserByEmail(String email);
    UserDto getUserById(Long id);
    void updateUser(UserDto userDto);
    void deleteUser(Long id);
}
