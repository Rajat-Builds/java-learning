package com.rajat.libraryapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String title;
    private String author;
    private double price;

public Book() {}

    public Book( String title, String author, double price){
    this.title = title;
    this.author = author;
    this.price = price;   
    }

    public int getId() {return id; }
    public String getTitle() {return title; }
    public String getAuthor() {return author; }
    public double getPrice() {return price; }
    public void setPrice( double price) {this.price = price;} 
    
   
}
