package com.xworkz.laptop.laptops;

import com.xworkz.laptop.motherboard.MotherBoard;

public class Laptops {

    MotherBoard motherBoard;

   public void boardInfo(MotherBoard motherBoard){

       this.motherBoard = motherBoard;
       this.motherBoard.motherBoardDetails();
   }
}
