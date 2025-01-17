package com.example.kiosk_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CartMenus {
    private List<MenuItem> menuItems = new ArrayList<>();

    public void addCartItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void removeItem(String itemName) {
        List<MenuItem> removedItems = menuItems.stream()
                .filter(item -> item.getName().equalsIgnoreCase(itemName))
                .collect(Collectors.toList());

        menuItems.removeAll(removedItems);
        System.out.println(itemName + " 이 장바구니에 삭제되었습니다.");
    }

    public void displayCart() {
        System.out.println("[ Orders ]");
        menuItems.forEach(menuItems -> System.out.println(menuItems));
    }

    public int getCount() {
        return menuItems.size();
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (MenuItem item : menuItems) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
