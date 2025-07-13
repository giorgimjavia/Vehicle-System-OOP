package org.example;

import org.example.exceptions.PriceException;
import org.example.exceptions.SeatException;

import java.text.DecimalFormat;

public class Bike extends Vehicle implements IRentable{
    private int seatCount;
    private boolean hasGear;
    private double price;
    private boolean available;

    public Bike(String brand, String model, int seatCount, boolean hasGear, double price, boolean available) {
        super(brand, model);
        if (seatCount < 0) {
            throw new SeatException("NOT ALLOWED!");
        }
        if (price < 0) {
            throw new PriceException("NOT ALLOWED!");
        }
        this.seatCount = seatCount;
        this.hasGear = hasGear;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new PriceException("NOT ALLOWED !");
        }
        this.price = price;
    }

    @Override
    public void getRentalPrice() {
        double price = getPrice() * 0.2;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Daily Rental Price Is: $" + df.format(price) + "\n");
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand : " + getBrand() + "\nModel: " + getModel() +"\nPrice: $" + price + "\nSeat: " + seatCount + "\nGear : " + hasGear + "\nRental Available: " + isAvailable());
    }
}
