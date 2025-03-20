package com.desing.patterns.Prototype;

import com.desing.patterns.Prototype.abstracts.Tours;
import com.desing.patterns.Prototype.tours.*;

public class ToursApplication {
    public static void main(String[] args) throws CloneNotSupportedException {

        TourRegister register = new TourRegister();

        Tours honeymoonTour = register.getTour(TourType.HONEYMOON);
        Tours sigiriyaTour = register.getTour(TourType.TOUR_SIGIRIYA);

        System.out.println(honeymoonTour);
        System.out.println(sigiriyaTour);
    }
}