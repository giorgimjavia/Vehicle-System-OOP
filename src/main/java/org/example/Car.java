package org.example;

import org.example.exceptions.PriceException;
import org.example.exceptions.SeatException;

import java.text.DecimalFormat;

public class Car extends Vehicle implements IRentable{
    private int seatCount;
    private boolean hasGear;
    private  boolean available;

    public Car(String brand, String model, double price, int seatCount, boolean hasGear, boolean available) {
        super(brand, model, price);
        if (seatCount < 0) {
            throw new SeatException("NOT ALLOWED!");
        }
        if (price < 0) {
            throw new PriceException("NOT ALLOWED!");
        }
        this.seatCount = seatCount;
        this.hasGear = hasGear;
        this.available = available;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public boolean isHasGear() {
        return hasGear;
    }

    public void setSeatCount(int seatCount) {
        if (seatCount < 0) {
            throw new SeatException("NOT ALLOWED !");
        }
        this.seatCount = seatCount;
    }

    public void setHasGear(boolean hasGear) {
        this.hasGear = hasGear;
    }

    @Override
    public void getRentalPrice() {
        double price = getPrice() * 0.1;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Daily Rental Price Is: $" + df.format(price) + "\n");
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand : " + getBrand() + "\nModel: " + getModel() +"\nPrice: $" + getPrice() + "\nSeat: " + seatCount + "\nGear : " + hasGear + "\nRental Available: " + isAvailable());
    }
}
