/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.deliverable1;

/**
 *
 * @author miran
 */

public class Book 
{
    private String title;
    private String author;
    private double price;
    
    public Book (String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public double getPrice()
    {
        return price;
    }
    @Override
    public String toString()
    {
        return "Book{" + "title='" + title + '\'' + ", price=" + price + '}';
    }
}
