package main;

import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.util.Date;

public class Vehicle {
    private String identificationNumber;
    private String model;
    private String brand;
    private int capacity;
    private String fuelType;
    private Color outsideColor;
    private int currentKmState;
    private String licenseNumber;
    private int amountOfSeats;
    private String category;
    private Date buyingDate;
    private double buyingPrice;
    private Date availableFrom;
    private Date availableUntil;
    private boolean notAvailable;
    private Image picture;

    public Vehicle(String model){
        this.model = model;
    }

    public Vehicle(String identificationNumber, String model, String brand, int capacitiy, String fuelType, Color outsideColor, int currentKmState, String licenseNumber, int amountOfSeats
    , String category, Date buyingDate, double buyingPrice, Date availableFrom, Date availableUntil, boolean notAvailable){
        this.identificationNumber = identificationNumber;
        this.model = model;
        this.brand = brand;
        this.capacity = capacitiy;
        this.fuelType = fuelType;
        this.outsideColor = outsideColor;
        this.currentKmState = currentKmState;
        this.licenseNumber = licenseNumber;
        this.amountOfSeats = amountOfSeats;
        this.category = category;
        this.buyingDate = buyingDate;
        this.buyingPrice = buyingPrice;
        this.availableFrom = availableFrom;
        this.availableUntil = availableUntil;
        this.notAvailable = notAvailable;
    }

    public String getIdentificationNumber() { return identificationNumber; }
    public void setIdentificationNumber(String identificationNumber) { this.identificationNumber = identificationNumber; }

    public void setModel(String model) { this.model = model; }
    public String getModel(){
        return model;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public Color getOutsideColor() { return outsideColor; }
    public void setOutsideColor(Color outsideColor) { this.outsideColor = outsideColor; }

    public int getCurrentKmState() { return currentKmState; }
    public void setCurrentKmState(int currentKmState) { this.currentKmState = currentKmState; }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }

    public int getAmountOfSeats() { return amountOfSeats; }
    public void setAmountOfSeats(int amountOfSeats) { this.amountOfSeats = amountOfSeats; }

    public Date getBuyingDate() { return buyingDate; }
    public void setBuyingDate(Date buyingDate) { this.buyingDate = buyingDate; }

    public double getBuyingPrice() { return buyingPrice; }
    public void setBuyingPrice(double buyingPrice) { this.buyingPrice = buyingPrice; }

    public Date getAvailableFrom() { return availableFrom; }
    public void setAvailableFrom(Date availableFrom) { this.availableFrom = availableFrom; }

    public Date getAvailableUntil() { return availableUntil; }
    public void setAvailableUntil(Date availableUntil) { this.availableUntil = availableUntil; }

    public boolean isNotAvailable() { return notAvailable; }
    public void setNotAvailable(boolean notAvailable) { this.notAvailable = notAvailable; }

    public Image getPicture() { return picture; }
    public void setPicture(Image picture) { this.picture = picture; }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
