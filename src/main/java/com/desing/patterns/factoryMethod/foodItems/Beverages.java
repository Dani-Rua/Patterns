package com.desing.patterns.factoryMethod.foodItems;

import com.desing.patterns.factoryMethod.abstracts.RegularOrders;

public class Beverages extends RegularOrders {

    public static final String name = "Beverages";
    public static final int price = 300;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}
