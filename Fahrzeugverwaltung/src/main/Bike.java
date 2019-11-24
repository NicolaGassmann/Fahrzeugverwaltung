package main;

import javafx.scene.paint.Color;

import java.util.Date;

public class Bike extends Vehicle {
    private int fuelVolume;
    private boolean hasSaddlebags;

    public Bike(String model){
        super(model);
    }

    public Bike(String identificationNumber, String model, String brand, int capacitiy, String fuelType, Color outsideColor, int currentKmState, String licenseNumber, int amountOfSeats
            , String category, Date buyingDate, double buyingPrice, Date availableFrom, Date availableUntil, boolean notAvailable, int fuelVolume, boolean hasSaddlebags){
        super(identificationNumber, model, brand, capacitiy, fuelType, outsideColor, currentKmState, licenseNumber, amountOfSeats, category, buyingDate, buyingPrice, availableFrom, availableUntil, notAvailable);
        this.fuelVolume = fuelVolume;
        this.hasSaddlebags = hasSaddlebags;
    }

    public int getFuelVolume() { return fuelVolume; }
    public void setFuelVolume(int fuelVolume) { this.fuelVolume = fuelVolume; }

    public boolean isHasSaddlebags() { return hasSaddlebags; }
    public void setHasSaddlebags(boolean hasSaddlebags) { this.hasSaddlebags = hasSaddlebags; }
}
