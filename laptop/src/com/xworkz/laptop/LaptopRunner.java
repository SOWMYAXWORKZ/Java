package com.xworkz.laptop;

import com.xworkz.laptop.laptops.Laptops;
import com.xworkz.laptop.motherboard.MotherBoard;

public class LaptopRunner {

    public static void main(String[] args) {

        Laptops laptops = new Laptops();


        MotherBoard motherBoard = new MotherBoard();

        motherBoard.model = "Dell XPS 15 ";
        motherBoard.processor = "Intel Core i7";
        motherBoard.inches = "15.6-inch laptop";
        motherBoard.warranty = 2;
        motherBoard.ram = "16 GB";

        laptops.boardInfo(motherBoard);


    }



}
