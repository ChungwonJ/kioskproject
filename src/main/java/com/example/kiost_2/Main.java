package com.example.kiost_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();
        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(new MenuItem(1, "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(2, "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(3, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(4, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        // Scanner 선언
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("menuItems : " + menuItems);
        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }
        // 숫자를 입력 받기
        System.out.println("0. 종료 | 종료");
        System.out.print("번호를 입력하세요: ");
        choice = sc.nextInt();
        // 입력된 숫자에 따른 처리
        // 프로그램을 종료
        // 선택한 메뉴 : 이름, 가격, 설명
        for (int i = 0; i <= choice; i++) {
            MenuItem item = menuItems.get(i);
            if (choice == item.getId()) {
                System.out.print("선택한 메뉴는 : ");
                System.out.print(item);
                return;
            } else if (choice == 0) {
                System.out.println("종료합니다.");
                return;
            }
        }
    }
}


