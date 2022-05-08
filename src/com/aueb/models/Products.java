package com.aueb.models;

public class Products {

    String modelName;
    int modelYear;
    String modelManufacturer;
    double modelPrice;
    public double discount;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getModelManufacturer() {
        return modelManufacturer;
    }

    public void setModelManufacturer(String modelManufacturer) {
        this.modelManufacturer = modelManufacturer;
    }

    public double getModelPrice() {
        return modelPrice;
    }

    public void setModelPrice(double modelPrice) {
        this.modelPrice = modelPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double finalPrice() {
        return modelPrice - ( modelPrice * discount);

    }

}
