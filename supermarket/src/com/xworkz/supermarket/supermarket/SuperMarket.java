package com.xworkz.supermarket.supermarket;

import com.xworkz.supermarket.workers.WorkersDetails;

public class SuperMarket {

    WorkersDetails workersDetails ;

    public void info(WorkersDetails workersDetails){

        this.workersDetails=workersDetails;
        this.workersDetails.workerInfo();
    }
}
