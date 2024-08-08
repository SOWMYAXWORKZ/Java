package com.xworkz.laptop.motherboard;

public class MotherBoard {
    public String model;
    public String inches;
    public String processor;
    public String ram;
    public int warranty;

    public void motherBoardDetails(){
        System.out.println("Model Name  : " + this.model);
        System.out.println("Form Factor : " + this.inches);
        System.out.println("Processor   : " + this.processor);
        System.out.println("RAM         : " + this.ram);
        System.out.println("Warranty    : " + this.warranty);

    }


}
