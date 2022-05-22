package com.aueb.model.components;

import com.aueb.model.Product;

public abstract class ComputerComponent extends Product {

    public static final double COMPONENT_DISCOUNT = 0.25;

    protected ComputerComponent() {
    }

    protected ComputerComponent(String modelName) {
        super(modelName);
    }

    protected ComputerComponent(String modelName, int modelYear, String modelManufacturer, double modelPrice) {
        super(modelName, modelYear, modelManufacturer, modelPrice, COMPONENT_DISCOUNT);
    }

    public String toString() {
        return super.toString();
    }
}// class ComputerComponent