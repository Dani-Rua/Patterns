package com.desing.patterns.creational.factoryMethod.foodItems;

import com.desing.patterns.creational.factoryMethod.abstracts.RegularOrders;

public class Desserts extends RegularOrders {

    public static final String name = "Desserts";
    public static final int price = 300;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}
