package com.aueb.model.peripherals;

import com.aueb.model.Product;

public abstract class ComputerPeripheral extends Product {
    protected ComputerPeripheral() {
        super("", 0, "", 0.0);
    }

    protected ComputerPeripheral(String modelName, int modelYear, String modelManufacturer, double modelPrice) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
    }

    public String toString() {
        return super.toString();
    }
} // class ComputerPeripheral

