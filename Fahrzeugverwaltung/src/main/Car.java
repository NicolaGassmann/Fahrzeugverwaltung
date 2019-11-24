package main;

import javafx.scene.paint.Color;

import java.util.Date;

public class Car extends Vehicle {
    private int luggageSpaceInLuggages;
    //private enum type{Kleinwagen, Limousine, Kombi, SUV, Cabriolet}
    private String type;
    private boolean hasNavigationSystem;

    public Car(String model){
        super(model);
    }

    public Car(String identificationNumber, String model, String brand, int capacitiy, String fuelType, Color outsideColor, int currentKmState, String licenseNumber, int amountOfSeats
            , String category, Date buyingDate, double buyingPrice, Date availableFrom, Date availableUntil, boolean notAvailable, int luggageSpaceInLanguages, String type, boolean hasNavigationSystem){
        super(identificationNumber, model, brand, capacitiy, fuelType, outsideColor, currentKmState, licenseNumber, amountOfSeats, category, buyingDate, buyingPrice, availableFrom, availableUntil, notAvailable);
        this.luggageSpaceInLuggages = luggageSpaceInLanguages;
        this.type = type;
        this.hasNavigationSystem = hasNavigationSystem;
    }

    public int getLuggageSpaceInLuggages() { return luggageSpaceInLuggages; }
    public void setLuggageSpaceInLuggages(int luggageSpaceInLuggages) { this.luggageSpaceInLuggages = luggageSpaceInLuggages; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public boolean isHasNavigationSystem() { return hasNavigationSystem; }
    public void setHasNavigationSystem(boolean hasNavigationSystem) { this.hasNavigationSystem = hasNavigationSystem; }
}
