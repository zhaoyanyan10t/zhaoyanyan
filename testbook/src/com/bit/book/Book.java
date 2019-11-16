package com.bit.book;

public class Book {
    public String name;
    public String auther;
    public int price;
    public String type;
    public boolean isBorrowed;

    public Book(String name, String auther, int price, String type) {
        this.name = name;
        this.auther = auther;
        this.price = price;
        this.type = type;
    }
}
