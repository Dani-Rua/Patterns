package com.desing.patterns.creational.prototype.factoryMethod.combos;

import com.desing.patterns.creational.prototype.factoryMethod.abstracts.Combos;
import com.desing.patterns.creational.prototype.factoryMethod.foodItems.Beverages;
import com.desing.patterns.creational.prototype.factoryMethod.foodItems.Meals;

public class LiteCombo extends Combos {
    @Override
    public void comboDetails() {
        regularOrders.add(new Meals());
        regularOrders.add(new Beverages());
    }
}
