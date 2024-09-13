package com.example.ecommerce.controller;

import com.example.ecommerce.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register"; // returns register.html
    }

    @PostMapping("/register")
    public String registerUser(User user, Model model) {
        model.addAttribute("message", "User registered successfully!");
        return "redirect:/"; // Go back to the main page
    }
}