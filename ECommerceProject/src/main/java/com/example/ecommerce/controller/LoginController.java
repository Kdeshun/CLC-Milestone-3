package com.example.ecommerce.controller;

import com.example.ecommerce.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("login", new Login());
        return "login"; // returns login.html
    }

    @PostMapping("/login")
    public String loginUser(Login login, Model model) {
        if ("admin".equals(login.getUsername()) && "password".equals(login.getPassword())) {
            return "redirect:/product/create"; // Go to product creation page
        }
        model.addAttribute("error", "Invalid username or password");
        return "login"; // Show login page again
    }
}