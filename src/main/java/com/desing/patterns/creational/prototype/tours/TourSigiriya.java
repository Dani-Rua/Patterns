package com.desing.patterns.creational.prototype.tours;

import com.desing.patterns.creational.prototype.abstracts.Tours;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@SuperBuilder
public class TourSigiriya extends Tours {
    private String destination;
    private boolean accommodation;

    @Override
    public String toString() {
        return super.toString() + " TourSigiriya{" +
                "destination='" + destination + '\'' +
                ", accommodation=" + accommodation +
                '}';
    }
}
