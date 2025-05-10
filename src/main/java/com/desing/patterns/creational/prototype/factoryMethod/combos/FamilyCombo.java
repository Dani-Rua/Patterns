package com.desing.patterns.creational.prototype.factoryMethod.combos;

import com.desing.patterns.creational.prototype.factoryMethod.abstracts.Combos;
import com.desing.patterns.creational.prototype.factoryMethod.foodItems.Beverages;
import com.desing.patterns.creational.prototype.factoryMethod.foodItems.Meals;
import com.desing.patterns.creational.prototype.factoryMethod.foodItems.Salads;

public class FamilyCombo extends Combos {
    @Override
    public void comboDetails() {
        regularOrders.add(new Meals());
        regularOrders.add(new Beverages());
        regularOrders.add(new Salads());
    }
}
