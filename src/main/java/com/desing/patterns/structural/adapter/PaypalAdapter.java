package com.desing.patterns.structural.adapter;



public class PaypalAdapter implements PaymentGateway{

    private Paypal paymentGateway;

    public PaypalAdapter (Paypal paymentGateway){
        this.paymentGateway = paymentGateway;
    }


    @Override
    public void processPayment(double amount) {
        paymentGateway.makePayment(amount);
    }
}
