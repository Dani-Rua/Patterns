package com.desing.patterns.structural.adapter;

public class Paypal {
    public void makePayment(double amount) {
        System.out.println("Pago $" + amount + " a traves de Paypal.");
    }
}
