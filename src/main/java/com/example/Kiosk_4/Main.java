package com.example.Kiosk_4;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}


