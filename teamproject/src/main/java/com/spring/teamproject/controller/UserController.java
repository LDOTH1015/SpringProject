package com.spring.teamproject.controller;

import com.spring.teamproject.Service.UserService;
import com.spring.teamproject.dto.UserDto;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String toLoginPage(HttpSession session) {
        Long id = (Long) session.getAttribute("userId");
        if (id !=null){
            return "redirect:/";
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(String id, String password, HttpSession session) {
        Long masterid = userService.login(id, password);
        if (masterid == null) {
            return "redirect:/login";
        }
        session.setAttribute("userId", masterid);
        return "redirect:/";
    }

    @GetMapping("/signup")
    public String toSingupPage() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(UserDto userDto) {
        try {
            userService.signup(userDto);
        } catch (DuplicateKeyException e) {
            return "redirect:/signup?error_code=-1";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/signup?error_code=-99";
        }
        return "redirect:/login";
    }

    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
