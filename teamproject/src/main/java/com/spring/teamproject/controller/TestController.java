package com.spring.teamproject.controller;

import com.spring.teamproject.Service.TestService;
import com.spring.teamproject.dto.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping(value = "/test")
    public ModelAndView test() throws  Exception{
        ModelAndView mav = new ModelAndView("test");

        List<TestDto> testList = testService.selectTest();
        mav.addObject("list", testList);

        return mav;
    }
}
