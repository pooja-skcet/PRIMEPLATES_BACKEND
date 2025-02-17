package com.example.demo.dto;

public class MenuDTO {
    private Long id;
    private String dayOfWeek;
    private String type;
    private String price;
    private String description;
    private String cuisine;
    private String session;
    private boolean veg;
    private String image;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDayOfWeek() { return dayOfWeek; }
    public void setDayOfWeek(String dayOfWeek) { this.dayOfWeek = dayOfWeek; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getCuisine() { return cuisine; }
    public void setCuisine(String cuisine) { this.cuisine = cuisine; }
    public String getSession() { return session; }
    public void setSession(String session) { this.session = session; }
    public boolean isVeg() { return veg; }
    public void setVeg(boolean veg) { this.veg = veg; }
    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}
