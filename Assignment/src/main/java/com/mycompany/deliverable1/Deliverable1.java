/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deliverable1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miran
 */
public class Deliverable1 
{
    public static final Logger LOGGER = Logger.getLogger (Deliverable1.class.getName());

    public static void main(String[] args) 
    {
        Inventory inventory = new Inventory();
        inventory.addBook (new Book("Java basics", "Jamie Peterson", 875.00));
        inventory.addBook(new Book("Coding 101", "Peter Olivier", 490.00));
        inventory.addBook(new Book("Java for beginners", "James Sheppard", 365.00));
        
        System.out.println("Welcome to the Bookstore System!");
        System.out.println("\nAvailable Books");
        for (Book book : inventory.getBooks())
        {
            System.out.println(book);
        }
        System.out.println();
        
        //Scenario 1
        System.out.println("Processing Order for Miranda");
        Customer miranda = new Customer ("Miranda", "miranda@gmail,com");
        Order orderMiranda  = new Order(miranda);
        try
        {
            orderMiranda.addBookToOrder(inventory.findBookByTitle("Coding 101"));
            orderMiranda.addBookToOrder(inventory.findBookByTitle("Java Basics"));
            System.out.println(orderMiranda);
            System.out.println("Total= "+ calculateTotal(orderMiranda));
        }
        catch (BookNotFoundException | InvalidOrderException e)
        {
            LOGGER.log(Level.SEVERE, "Error processing order for Miranda" + e.getMessage(), e);
            System.err.println("Error processing order for Miranda" + e.getMessage());
        }
        
        System.out.println("\nProcessing Order for Donovan");
        Customer donovan = new Customer ("Donovan", "donovan@gmail,com");
        Order orderDonovan  = new Order(donovan);
        try
        {
            orderDonovan.addBookToOrder(inventory.findBookByTitle("Java for beginners"));
            System.out.println(orderDonovan);
            System.out.println("Total= "+ calculateTotal(orderDonovan));
        }
        catch (BookNotFoundException | InvalidOrderException e)
        {
            LOGGER.log(Level.SEVERE, "Error processing order for Donovan" + e.getMessage(), e);
            System.err.println("Error processing order for Donovan" + e.getMessage());
        }
        
        //Scenario 2
        System.out.println("\nWelcome to the Bookstore System!");
        try
        {
            inventory.findBookByTitle("Salems lot");
        }
        catch(BookNotFoundException e)
        {
            LOGGER.log(Level.SEVERE, "Error: " + e.getMessage(), e);
            System.err.println("Error: " + e.getMessage());
        }
        
        //Scenario 3
        System.out.println("\nProcessing Order for Leon");
        Customer leon = new Customer ("Leon", "Leon@gmail,com");
        Order orderLeon  = new Order(leon);
        try
        {
            if(orderLeon.getBooks().isEmpty())
            {
                throw new InvalidOrderException("Order must contain atleast one book.");
            }
        }
        catch (InvalidOrderException e)
        {
            LOGGER.log(Level.SEVERE, "Error processing order for Leon " + e.getMessage(), e);
            System.err.println("Error processing order: " + e.getMessage());
        }
    }
    private static double calculateTotal(Order order)
    {
        double total = 0;
        for(Book book : order.getBooks())
        {
            total += book.getPrice();
        }
        return total;
    }
}
