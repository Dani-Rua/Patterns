package com.desing.patterns.factoryMethod.foodItems;

import com.desing.patterns.factoryMethod.abstracts.RegularOrders;

public class Meals extends RegularOrders {

    public static final String name = "Meals";
    public static final int price = 950;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}
