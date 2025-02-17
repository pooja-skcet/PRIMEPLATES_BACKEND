package com.example.demo.dto;

public class MealDTO {
	 private String name;
	    private String type; // e.g., "breakfast", "lunch", "dinner"
	    private String category; // e.g., "veg", "nonVeg"
	    private double price;

	    // Getters and Setters

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

}
