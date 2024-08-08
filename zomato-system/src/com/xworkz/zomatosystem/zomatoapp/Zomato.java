package com.xworkz.zomatosystem.zomatoapp;

import com.xworkz.zomatosystem.food.FoodDetails;

public class Zomato {

    FoodDetails foodDetails;

    public void order(FoodDetails foodDetails){

        this.foodDetails = foodDetails;
        this.foodDetails.displayDetails();
    }
}
