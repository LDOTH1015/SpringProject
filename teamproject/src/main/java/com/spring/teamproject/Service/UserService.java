package com.spring.teamproject.Service;

import com.spring.teamproject.dto.UserDto;
import com.spring.teamproject.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.authentication.PasswordEncoderParser;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public List<UserDto> getUserList() {
        return userMapper.getUserList();
    }

    public UserDto getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    public UserDto getUserByEmail(String email){
        return userMapper.getUserByEmail(email);
    }

    public void singup(UserDto userDto) {
        if (!userDto.getUsername().equals("") && !userDto.getEmail().equals("")) {
            userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        }
    }
}
