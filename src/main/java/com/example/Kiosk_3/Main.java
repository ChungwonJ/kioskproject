package com.example.Kiosk_3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}


