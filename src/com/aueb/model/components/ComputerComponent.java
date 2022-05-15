package com.aueb.model.components;

import com.aueb.model.Product;

public class ComputerComponent extends Product {
    protected ComputerComponent() {
        super("", 0, "", 0.0);
    }

    ComputerComponent(String modelName, int modelYear, String modelManufacturer, double modelPrice) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
    }

    public String toString() {
        return super.toString();
    }
}// class ComputerComponent