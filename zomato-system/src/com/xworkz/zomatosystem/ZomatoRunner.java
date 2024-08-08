package com.xworkz.zomatosystem;

import com.xworkz.zomatosystem.food.FoodDetails;
import com.xworkz.zomatosystem.zomatoapp.Zomato;

public class ZomatoRunner {

    public static void main(String[] args) {

        Zomato zomato = new Zomato();


        FoodDetails food = new FoodDetails();

        food.foodName ="Paneer Tikka";
        food.foodPrice= 300.0;
        food.cuisineType= "North Indian";
        food.description = "Soft cubes of paneer marinated in yogurt and spices";
        food.hotelName = "Tandoori Treats";

        zomato.order(food);
    }
}
