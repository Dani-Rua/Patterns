package com.desing.patterns.creational.prototype.factoryMethod;

import com.desing.patterns.creational.prototype.factoryMethod.abstracts.Combos;
import com.desing.patterns.creational.prototype.factoryMethod.combos.ComboCode;
import com.desing.patterns.creational.prototype.factoryMethod.combos.ComboCreator;

public class HotMealApplication {

    public static void main(String[] args) {

        Combos combos1 = ComboCreator.createCombos(ComboCode.LITE);
        combos1.printOrder();

        Combos combos2 = ComboCreator.createCombos(ComboCode.FAMILY);
        combos2.printOrder();

        Combos combos3 = ComboCreator.createCombos(ComboCode.MEGA);
        combos3.printOrder();
    }
}
