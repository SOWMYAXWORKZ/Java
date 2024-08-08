package com.xworkz.exam.supplementary;

import com.xworkz.exam.examfees.Exam;
import com.xworkz.exam.hallticket.HallTicket;

//Inheritance
public class Supplementary extends Exam {

  int noOfAttempts = 1;

  //override
  public boolean allow(HallTicket hallTicket) {
    boolean isAllows = false;
    if (noOfAttempts > 1) {
      System.out.println("paid the fess");
      if (fees == 300) {


        super.hallTicket = hallTicket;
        super.hallTicket.displayDetails();
        isAllows = true;
        System.out.println("hallticket is issued");
      } else {
        System.out.println("pay the fees");

      }
    }
    return isAllows;
  }
}