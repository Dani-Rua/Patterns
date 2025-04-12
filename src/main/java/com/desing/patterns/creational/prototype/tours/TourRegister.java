package com.desing.patterns.creational.prototype.tours;

import com.desing.patterns.creational.prototype.abstracts.Tours;
import java.util.Map;

public class TourRegister {
    private final Map<TourType, Tours> tour = Map.of(
            TourType.HONEYMOON, HoneyMoon.builder()
                    .hotel("Haj")
                    .meals(true)
                    .nights(5)
                    .priceRange(200000)
                    .vehicle("Ferrari")
                    .build(),

            TourType.TOUR_SIGIRIYA, TourSigiriya.builder()
                    .accommodation(true)
                    .destination("Sigiriya")
                    .nights(2)
                    .priceRange(100000)
                    .vehicle("Bugatti")
                    .build()
    );

    public Tours getTour(TourType tourType) throws CloneNotSupportedException {
        return tour.containsKey(tourType) ? tour.get(tourType).clone() : null;
    }
}