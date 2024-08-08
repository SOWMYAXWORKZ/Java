package com.xworkz.exam;

import com.xworkz.exam.examfees.Exam;
import com.xworkz.exam.hallticket.HallTicket;

public class ExamRunner {

    public static void main(String[] args){

        Exam exam= new Exam();
        exam.fees=1800;

        HallTicket hallTicket = new HallTicket();

        hallTicket.studentName = "sowmya";
        hallTicket.usn = "4GM20EC056";
        hallTicket.subjectName="signals and system";

        exam.allow(hallTicket);
    }

}
