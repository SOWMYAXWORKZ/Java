package com.xworkz.exam.hallticket;

import com.xworkz.exam.examfees.Exam;

public class HallTicket {


  public  String studentName ;
  public String usn;
  public String subjectName;
  public int fees;

  public void displayDetails(){
      System.out.println("the student name is: " +this.studentName);
      System.out.println("the USN: " + this.usn);
      System.out.println("the subjectname: " + subjectName);
  }
}
