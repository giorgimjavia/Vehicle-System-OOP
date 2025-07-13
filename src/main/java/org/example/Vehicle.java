package org.example;

import java.lang.classfile.attribute.StackMapFrameInfo;

public abstract class Vehicle {
    private String brand;
    private String model;

    public Vehicle (String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract void getRentalPrice();

    public abstract void displayInfo();
}
