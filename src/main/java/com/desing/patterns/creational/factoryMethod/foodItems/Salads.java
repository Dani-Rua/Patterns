package com.desing.patterns.creational.factoryMethod.foodItems;

import com.desing.patterns.creational.factoryMethod.abstracts.RegularOrders;

public class Salads extends RegularOrders {

    public static final String name = "Salads";
    public static final int price = 150;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}
