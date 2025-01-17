package com.example.kiosk_5;

import java.util.Scanner;

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
        int customerType;
        String cartDel;

        while (true) {
            System.out.println("장바구니 : " + cartMenus.getCount());
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
                                System.out.println("할인 정보를 입력해주세요.");
                                System.out.println("1. 국가유공자 : 10%");
                                System.out.println("2. 군인 : 5%");
                                System.out.println("3. 학생 : 3%");
                                System.out.println("4. 일반 : 0%");
                                Costomer costomer = Costomer.GENERAL;
                                customerType = sc.nextInt();
                                switch (customerType) {
                                    case 1:
                                        costomer = Costomer.NATIONALMERIT;
                                        System.out.println("주문이 완료되었습니다. 금액은 W " + cartMenus.getTotalPrice() * costomer.getDiscount());
                                        break;
                                    case 2:
                                        costomer = Costomer.SOLDIER;
                                        System.out.println("주문이 완료되었습니다. 금액은 W " + cartMenus.getTotalPrice() * costomer.getDiscount());
                                        break;
                                    case 3:
                                        costomer = Costomer.STUDENT;
                                        System.out.println("주문이 완료되었습니다. 금액은 W " + cartMenus.getTotalPrice() * costomer.getDiscount());
                                        break;
                                    case 4:
                                        System.out.println("주문이 완료되었습니다. 금액은 W " + cartMenus.getTotalPrice());
                                        break;
                                }
                                return;
                            }
                        } else if (orderChoice == 5) {
                            System.out.println("취소할 메뉴의 이름을 입력해 주세요.");
                            cartMenus.displayCart();
                            sc.nextLine();
                            cartDel = sc.nextLine();
                            cartMenus.removeItem(cartDel);
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

