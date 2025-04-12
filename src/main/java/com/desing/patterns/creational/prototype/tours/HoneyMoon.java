package com.desing.patterns.creational.prototype.tours;

import com.desing.patterns.creational.prototype.abstracts.Tours;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class HoneyMoon extends Tours {

    private String hotel;
    private boolean meals;

    @Override
    public String toString() {
        return super.toString() + " HoneyMoon{" +
                "hotel='" + hotel + '\'' +
                ", meals=" + meals +
                '}';
    }
}
