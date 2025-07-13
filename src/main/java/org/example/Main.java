package org.example;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A4", 4, true, 5500, true);
        Bike bmw = new Bike("BMW", "F900", 2, false, 2300, true);

        audi.displayInfo();
        audi.getRentalPrice();
        audi.isAvailable();

        bmw.displayInfo();
        bmw.getRentalPrice();
        bmw.isAvailable();
    }
}
