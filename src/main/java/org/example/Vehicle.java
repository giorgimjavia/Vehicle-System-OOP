package org.example;

import java.lang.classfile.attribute.StackMapFrameInfo;

public abstract class Vehicle {
    private String brand;
    private String model;
    private double price;

    public Vehicle (String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public abstract void getRentalPrice();

    public abstract void displayInfo();
}
