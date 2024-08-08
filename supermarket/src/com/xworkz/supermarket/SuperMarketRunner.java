package com.xworkz.supermarket;

import com.xworkz.supermarket.supermarket.SuperMarket;
import com.xworkz.supermarket.workers.WorkersDetails;

public class SuperMarketRunner {

    public static void main(String[] args) {

        SuperMarket superMarket = new SuperMarket();


        WorkersDetails worker = new WorkersDetails();
        worker.workerId = 29;
        worker.name = "Sharada";
        worker.role = "manager";
        worker.department = "account";

        superMarket.info(worker);

    }
}
