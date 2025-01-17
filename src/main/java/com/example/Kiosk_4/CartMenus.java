package com.example.Kiosk_4;

import java.util.ArrayList;
import java.util.List;

public class CartMenus {
    private List<MenuItem> menuItems = new ArrayList<>();

    public void addCartItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void displayCart() {
        System.out.println("[ Orders ]");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }

    public int getCount() {
        return menuItems.size();
    }

    public double getTotalPrice(){
        double totalPrice = 0.0;
        for (MenuItem item : menuItems) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
