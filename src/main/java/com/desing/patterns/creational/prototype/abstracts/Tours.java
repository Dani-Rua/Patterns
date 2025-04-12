package com.desing.patterns.creational.prototype.abstracts;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public abstract class Tours implements Cloneable {

    private int nights;
    private int priceRange;
    private String vehicle;

    @Override
    public Tours clone() throws CloneNotSupportedException {
        return (Tours) super.clone();
    }

    @Override
    public String toString() {
        return String.format("Tours{nights=%d, priceRange=%d, vehicle='%s'",
                nights, priceRange, vehicle);
    }
}
