package com.desing.patterns.factoryMethod.combos;

import com.desing.patterns.factoryMethod.abstracts.Combos;
import com.desing.patterns.factoryMethod.foodItems.Beverages;
import com.desing.patterns.factoryMethod.foodItems.Desserts;
import com.desing.patterns.factoryMethod.foodItems.Meals;
import com.desing.patterns.factoryMethod.foodItems.Salads;

public class MegaCombo extends Combos {
    @Override
    public void comboDetails() {
        regularOrders.add(new Meals());
        regularOrders.add(new Beverages());
        regularOrders.add(new Salads());
        regularOrders.add(new Desserts());
    }
}
