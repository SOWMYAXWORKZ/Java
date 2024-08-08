package com.xworkz.zomatosystem.food;

public class FoodDetails {
    public String foodName;
    public double foodPrice;
    public String description;
    public String cuisineType;
    public String hotelName;

    public void displayDetails(){
        System.out.println("The food name is          : "  + this.foodName);
        System.out.println("The cost of food          : " + this.foodPrice);
        System.out.println("Description               : " + this.description);
        System.out.println("The Cuisine type of food  : " + this.cuisineType);
        System.out.println("The Restaurant Name       : " + this.hotelName);

    }
}
