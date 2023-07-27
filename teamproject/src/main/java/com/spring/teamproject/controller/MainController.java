package com.spring.teamproject.controller;

import com.spring.teamproject.Service.UserService;
import com.spring.teamproject.dto.UserDto;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String main(HttpSession session, Model model) {
        Long id = (Long) session.getAttribute("userId");
        if (id != null) {
            UserDto userDto = userService.getUserByCountid(id);
            model.addAttribute("user", userDto);
            return "main";
        }
        return "redirect:/login";
    }
}
