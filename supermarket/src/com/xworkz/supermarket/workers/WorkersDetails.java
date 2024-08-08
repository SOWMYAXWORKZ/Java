package com.xworkz.supermarket.workers;

public class WorkersDetails {

    public int workerId;
    public String name;
    public String role;
    public String department;

    public void workerInfo(){
        System.out.println("The Name of worker       : " + this.name);
        System.out.println("The ID of worker         : " + this.workerId);
        System.out.println("The Role of worker       : " + this.role);
        System.out.println("The Department of worker : " + this.department);

    }
}
