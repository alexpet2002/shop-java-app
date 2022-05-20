package com.aueb.model;

public abstract class Product implements Model {

    private String modelName = "";
    private int modelYear = 0;
    private String modelManufacturer = "";
    private double modelPrice = 0.0;
    public double discount;

    protected Product() {

    }

    protected Product(String modelName, int modelYear, String modelManufacturer, double modelPrice) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.modelManufacturer = modelManufacturer;
        this.modelPrice = modelPrice;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getModelYear() {
        return this.modelYear;
    }

    public void setModelManufacturer(String modelManufacturer) {
        this.modelManufacturer = modelManufacturer;
    }

    public String getModelManufacturer() {
        return this.modelManufacturer;
    }

    public void setModelPrice(double modelPrice) {
        this.modelPrice = modelPrice;
    }

    public double getModelPrice() {
        return this.modelPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double finalPrice() {
        return modelPrice - (modelPrice * discount);

    }

    public String toString() {
        return "Model Name:\t\t\t" + getModelName() + " "
                + "\nModel Year:\t\t\t" + getModelYear() + " "
                + "\nModel Manufacturer:\t\t" + getModelManufacturer() + " "
                + "\nModel Price:\t\t\t" + getModelPrice();
    }
}// class Product