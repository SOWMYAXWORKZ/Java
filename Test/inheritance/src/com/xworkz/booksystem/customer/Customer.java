package com.xworkz.booksystem.customer;

import com.xworkz.booksystem.book.Book;
import com.xworkz.booksystem.order.Order;

public class Customer extends Order {

    public int customerId;
    public String customerName;

    Book book;

    public void getBook( Book book){
        this.book = book;
        this.book.bookDetails();
    }

    public void customerDetails(){
        System.out.println("CustomerId :  " + this.customerId);
        System.out.println("Customer Name : " +this.customerName);
    }
}
