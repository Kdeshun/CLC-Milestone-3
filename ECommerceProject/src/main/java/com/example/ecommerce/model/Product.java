package com.example.ecommerce.model;

import javax.validation.constraints.NotEmpty;

public class Product {
    @NotEmpty(message = "Product Name is required")
    private String name;

    @NotEmpty(message = "Description is required")
    private String description;

    private double price;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}