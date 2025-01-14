package com.example.kiost_2;

public class MenuItem {
    private int id;
    private String name;
    private double price;
    private String text;

    public MenuItem(int id, String name, double price, String text) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.text = text;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public double getPrice() {return price;}
    public String getText() {return text;}

    public void setId(int id){ this.id = id;}
    public void setName(String name){this.name = name;}
    public void setPrice(double price){this.price = price;}
    public void setText(String text){this.text = text;}

    @Override
    public String toString() {
        return id + ". " + name + " | W "  + price + " | " + text;
    }

}
