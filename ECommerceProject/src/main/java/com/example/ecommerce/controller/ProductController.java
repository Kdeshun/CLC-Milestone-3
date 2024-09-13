package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    
    @GetMapping("/product/create")
    public String showProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "productCreate"; // returns productCreate.html
    }

    @PostMapping("/product/create")
    public String createProduct(Product product, Model model) {
        model.addAttribute("message", "Product created successfully!");
        return "redirect:/"; // Go back to the main page
    }
}