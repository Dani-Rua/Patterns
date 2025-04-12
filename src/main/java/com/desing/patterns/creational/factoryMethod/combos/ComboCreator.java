package com.desing.patterns.creational.factoryMethod.combos;

import com.desing.patterns.creational.factoryMethod.abstracts.Combos;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class ComboCreator {

    private static final Map<ComboCode, Supplier<Combos>> COMBO_FACTORIES = Map.of(
            ComboCode.LITE, () -> {
                System.out.println("Selected Combo: LiteCombo \n");
                return new LiteCombo();
            },

            ComboCode.FAMILY, () -> {
                System.out.println("Selected Combo: FamilyCombo \n");
                return new FamilyCombo();
            },

            ComboCode.MEGA, () -> {
                System.out.println("Selected Combo: MegaCombo \n");
                return new MegaCombo();
            }
    );

    public static Combos createCombos(ComboCode comboCode){
        return Optional.ofNullable(comboCode)
                .map(COMBO_FACTORIES::get)
                .map(Supplier::get)
                .orElse(null);
    }
}
