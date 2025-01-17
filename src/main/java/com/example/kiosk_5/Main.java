package com.example.kiosk_5;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}


