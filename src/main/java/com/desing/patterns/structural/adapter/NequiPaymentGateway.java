package com.desing.patterns.structural.adapter;

public class NequiPaymentGateway {
    public void charge(double amount) {
        System.out.println("Se cobro $" + amount + " usando Nequi");
    }
}
