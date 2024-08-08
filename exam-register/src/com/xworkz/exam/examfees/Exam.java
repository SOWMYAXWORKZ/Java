package com.xworkz.exam.examfees;

import com.xworkz.exam.hallticket.HallTicket;

public class Exam {

    public int fees;
    public  HallTicket hallTicket;

    public boolean allow(HallTicket hallTicket) {
        boolean isAllowed = false;


        if (fees == 1800) {
            System.out.println("fees is paid");


            if (hallTicket != null) {
                this.hallTicket = hallTicket;
                this.hallTicket.displayDetails();
                isAllowed = true;
                System.out.println("allow hallticket");

            } else System.out.println("no hallticket is found");

        }  else System.out.println("pay the fees");
return isAllowed;

        }
    }





