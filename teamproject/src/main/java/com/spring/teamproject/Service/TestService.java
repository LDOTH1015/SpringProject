package com.spring.teamproject.Service;

import com.spring.teamproject.dto.TestDto;
import com.spring.teamproject.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    public TestMapper mapper;

    public List<TestDto> selectTest(){
        return mapper.selectTest();
    }
}
