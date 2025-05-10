package com.desing.patterns.structural.adapter;

public class NequiAdapter implements PaymentGateway{

    private Nequi paymentGateway;

    public NequiAdapter (Nequi paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        paymentGateway.charge(amount);
    }
}
