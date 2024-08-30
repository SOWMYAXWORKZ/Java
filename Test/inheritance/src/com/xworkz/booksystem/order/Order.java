package com.xworkz.booksystem.order;

import com.xworkz.booksystem.customer.Customer;

public class Order {

    Customer customer;

    public void getCustomer(Customer customer){
        this.customer = customer;
        this.customer.customerDetails();

    }
}
