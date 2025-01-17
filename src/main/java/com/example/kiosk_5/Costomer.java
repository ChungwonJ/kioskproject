package com.example.kiosk_5;

public enum Costomer {
    NATIONALMERIT (0.9),
    SOLDIER   (0.95),
    STUDENT   (0.97),
    GENERAL    (1);

    private final double discount;

    Costomer(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
