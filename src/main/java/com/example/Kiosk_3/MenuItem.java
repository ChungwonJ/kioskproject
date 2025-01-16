package com.example.Kiosk_3;

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

    @Override
    public String toString() {
        return id + ". " + name + " | W "  + price + " | " + text;
    }

}
