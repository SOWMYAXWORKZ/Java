package com.xworkz.booksystem.book;

import com.xworkz.booksystem.customer.Customer;

public class Book extends Customer {

    public int bookId;
    public String bookName;

    public void bookDetails(){
        System.out.println("the bood id: " + this.bookId);
        System.out.println("the book name: " + this.bookName);
    }
}
