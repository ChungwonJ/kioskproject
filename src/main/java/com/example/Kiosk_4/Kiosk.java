package com.example.Kiosk_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.*;

public class Kiosk {
    private Menu menu;
    private CartMenus cartMenus = new CartMenus();


    public Kiosk(Menu menu) {
        this.menu = menu;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int selectNumber;
        int choice;
        int cartChoice;
        int orderChoice;
        int priceChoice;

        while (true) {
            System.out.println("test123123 : " + cartMenus.getCount());
            System.out.println("[ MAIN MENU ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.println("0. 종료 | 종료");
            System.out.print("번호를 입력하세요: ");

            selectNumber = sc.nextInt();

            if (selectNumber > 3) {
                System.out.println("잘못된 입력입니다.");
            }

            switch (selectNumber) {
                case 1:
                    if (cartMenus.getCount() != 0) {
                        System.out.println("[ ORDER MENU ]");
                        System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
                        System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
                        orderChoice = sc.nextInt();

                        if (orderChoice == 4) {
                            System.out.println("아래와 같이 주문 하시겠습니까?");
                            cartMenus.displayCart();
                            System.out.println("[ Total ]");
                            System.out.println(" W " + cartMenus.getTotalPrice());

                            System.out.println("1. 주문       2. 메뉴판");
                            priceChoice = sc.nextInt();
                            if (priceChoice == 1) {
                                System.out.println("주문이 완료되었습니다. 금액은 W " + cartMenus.getTotalPrice());
                                return;
                            }
                        } else if (orderChoice == 5) {
                            System.out.println("취소 되었습니다.");
                            continue;
                        } else {
                            continue;
                        }
                    }

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
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인");
                            System.out.println("2. 취소");
                            cartChoice = sc.nextInt();
                            if (cartChoice == 1) {
                                cartMenus.addCartItem(item);
                                System.out.println(item.getName() + " 이 장바구니에 추가되었습니다.");
                                cartMenus.displayCart();
                            } else if (cartChoice == 2) {
                                System.out.println("선택 안되었습니다.");
                            } else {
                                System.out.println("잘못 입력되었습니다.");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("준비중입니다.");
                    break;
                case 3:
                    System.out.println("준비중입니다.");
                    break;
                case 0:
                    System.out.println("뒤로갑니다.");
                    break;
            }
        }
    }
}

