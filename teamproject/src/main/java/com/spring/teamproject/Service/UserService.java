package com.spring.teamproject.Service;

import com.spring.teamproject.dto.UserDto;
import com.spring.teamproject.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Long login(String id, String password) {
        UserDto userDto = userMapper.getUserById(id);
        if (userDto.getPassword().equals(password)){
            return userDto.getCountid();
        }
        return null;
    }

    public void signup(UserDto userDto) {
        userMapper.insertUser(userDto);
    }

    public UserDto getUserByCountid(Long countid) {
        return userMapper.getUserByCountId(countid);
    }
}
