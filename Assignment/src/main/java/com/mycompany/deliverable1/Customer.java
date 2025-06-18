/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverable1;

/**
 *
 * @author miran
 */
public class Customer 
{
    private String name;
    private String email;
    
    public Customer(String name, String email)
    {
        this.name = name;
        this.email = email;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    
    @Override
    public String toString()
    {
        return "Customer{" + "name='" + name + '\'' + ", email='" + email + '\'' + '}';
    }
}
