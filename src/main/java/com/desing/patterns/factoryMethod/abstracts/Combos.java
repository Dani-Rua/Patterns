package com.desing.patterns.factoryMethod.abstracts;

import java.util.ArrayList;
import java.util.List;

public abstract class Combos {

    protected List<RegularOrders> regularOrders = new ArrayList<>();

    public Combos(){
        comboDetails();
    }

    public abstract void comboDetails();

    public void printOrder(){
        System.out.printf("%-15s %10s %n", "Type", "Price");

        regularOrders.stream()
                .forEach(RegularOrders::printOrder);

        System.out.println("__________________________\n");
    }
}
