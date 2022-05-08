package com.aueb.models;

public class Products {

    String modelName;
    int modelYear;
    String modelManufacturer;
    double modelPrice;

    public double discount;



    double finalPrice() {
        return modelPrice - ( modelPrice * discount);

    }

}
