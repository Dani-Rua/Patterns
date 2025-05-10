package com.desing.patterns.structural.adapter;

public class PaymentApp {
    public static void main (String[] args){
        PaymentGateway paypalGateway = new PaypalAdapter(new Paypal());
        PaymentGateway nequiGateway = new NequiAdapter(new Nequi());

        double amount = 100;

        paypalGateway.processPayment(amount);
        nequiGateway.processPayment(amount);
    }
}
