package com.desing.patterns.factoryMethod.combos;

import com.desing.patterns.factoryMethod.abstracts.Combos;
import com.desing.patterns.factoryMethod.foodItems.Beverages;
import com.desing.patterns.factoryMethod.foodItems.Meals;
import com.desing.patterns.factoryMethod.foodItems.Salads;

public class FamilyCombo extends Combos {
    @Override
    public void comboDetails() {
        regularOrders.add(new Meals());
        regularOrders.add(new Beverages());
        regularOrders.add(new Salads());
    }
}
