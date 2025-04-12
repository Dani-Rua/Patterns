package com.desing.patterns.structural.adapter;

import lombok.AllArgsConstructor;

public class NequiAdapter implements PaymentGateway{

    private NequiPaymentGateway paymentGateway;

    public NequiAdapter (NequiPaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        paymentGateway.charge(amount);
    }
}
