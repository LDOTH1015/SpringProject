package com.spring.teamproject.mapper;

import com.spring.teamproject.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface TestMapper {
        List<TestDto> selectTest();
}
