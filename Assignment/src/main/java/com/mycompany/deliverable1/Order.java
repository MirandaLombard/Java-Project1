/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverable1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miran
 */
public class Order 
{
    private Customer customer;
    private List<Book> books;
    private static final Logger LOGGER = Logger.getLogger (Order.class.getName());
    
    public Order(Customer customer)
    {
        this.customer = customer;
        this.books = new ArrayList<>();
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public List<Book> getBooks()
    {
        return books;
    }
    public void addBookToOrder (Book book) throws InvalidOrderException
    {
        if (book == null)
        {
            LOGGER.log(Level.WARNING, "Attempted to add null book to order");
            throw new InvalidOrderException ("Cannot add null book to order.");
        }
        books.add(book);
    }
    
    @Override
    public String toString()
    {
        String orderString = "Order for customer: " + customer.getName() + "\n";
        orderString += "Books Ordered: \n";
        for (Book book: books)
        {
            orderString += book.toString() + "\n";
        }
        return orderString;
    }
}
