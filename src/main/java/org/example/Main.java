package org.example;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A4", 5500, 4, true, true);
        Bike bmw = new Bike("BMW", "F900", 1500, 2, false, true);

        audi.displayInfo();
        audi.getRentalPrice();
        audi.isAvailable();

        bmw.displayInfo();
        bmw.getRentalPrice();
        bmw.isAvailable();

    }
}
