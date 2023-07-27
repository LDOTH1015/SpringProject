package com.spring.teamproject.mapper;

import com.spring.teamproject.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDto> getUserList();
    void insertUser(UserDto userDto);
    UserDto getUserById(String id);

    UserDto getUserByCountId(Long countid);


}
