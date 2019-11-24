package main;

import javafx.scene.paint.Color;

import java.util.Date;

public class Transporter extends Vehicle {
    private int height;
    private int loadingWeight;

    public Transporter(String model){ super(model); }

    public Transporter(String identificationNumber, String model, String brand, int capacitiy, String fuelType, Color outsideColor, int currentKmState, String licenseNumber, int amountOfSeats
            , String category, Date buyingDate, double buyingPrice, Date availableFrom, Date availableUntil, boolean notAvailable, int height, int loadingWeight){
        super(identificationNumber, model, brand, capacitiy, fuelType, outsideColor, currentKmState, licenseNumber, amountOfSeats, category, buyingDate, buyingPrice, availableFrom, availableUntil, notAvailable);
        this.height = height;
        this.loadingWeight = loadingWeight;
    }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public int getLoadingWeight() { return loadingWeight; }
    public void setLoadingWeight(int loadingWeight) { this.loadingWeight = loadingWeight; }
}
