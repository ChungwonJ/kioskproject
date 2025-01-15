package com.example.Kiosk_3;

import java.util.Scanner;

public class Kiosk {
    private Menu menu = new Menu();

    public void start() {
        Scanner sc = new Scanner(System.in);
        int choice;
        // 메뉴 출력
        menu.displayMenu();

        System.out.println("0. 종료 | 종료");
        System.out.print("번호를 입력하세요: ");

        choice = sc.nextInt();

        if (choice == 0) {
            System.out.println("종료합니다.");
            return;
        } else if (choice > 4) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        for (int i = 0; i < menu.getMenuItems().size(); i++) {
            MenuItem item = menu.getMenuItems().get(i);
            if (choice == item.getId()) {
                System.out.print("선택한 메뉴는 : ");
                System.out.println(item);
            }
        }
    }
}
