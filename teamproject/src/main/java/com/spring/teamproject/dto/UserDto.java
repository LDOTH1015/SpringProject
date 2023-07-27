package com.spring.teamproject.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long countid;
    private String id;
    private String name;
    private String password;
    private String phone;
}
