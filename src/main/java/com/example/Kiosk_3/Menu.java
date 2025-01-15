package com.example.Kiosk_3;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // MenuItem 클래스를 List로 관리
    private List<MenuItem> menuItems = new ArrayList<>();

    public Menu() {
        menuItems.add(new MenuItem(1, "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(2, "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(3, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(4, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    public void displayMenu() {
        System.out.println("==== 메뉴 ====");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }

    // List를 리턴하는 함수
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
