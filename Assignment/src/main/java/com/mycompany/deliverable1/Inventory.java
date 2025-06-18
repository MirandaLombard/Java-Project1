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
public class Inventory 
{
    private List<Book> books;
    private static final Logger LOGGER = Logger.getLogger(Inventory.class.getName());
    
    public Inventory()
    {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public Book findBookByTitle (String title) throws BookNotFoundException
    {
        for (Book book : books)
        {
            if (book.getTitle().equalsIgnoreCase(title))
            {
                return book;
            }
        }
        LOGGER.log(Level.WARNING, "Book not found: " + title);
        throw new BookNotFoundException ("Book with title'" + title + "' not found.");
    }
    
    public List<Book> getBooks()
    {
        return books;
    }
}
