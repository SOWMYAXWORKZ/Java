package com.xworkz.booksystem;

import com.xworkz.booksystem.book.Book;
import com.xworkz.booksystem.customer.Customer;
import com.xworkz.booksystem.order.Order;

public class BookRunner {
    public static void main(String[] args) {

        Order order = new Order();

        Customer customer = new Customer();
        customer.customerId = 1;
        customer.customerName = "sowmya";
        order.getCustomer(customer);

        Book book = new Book();
        book.bookId = 1;
        book.bookName = "ikakgi";
        customer.getBook(book);




    }



}
