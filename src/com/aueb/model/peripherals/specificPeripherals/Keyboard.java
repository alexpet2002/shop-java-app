package com.aueb.model.peripherals.specificPeripherals;


import com.aueb.model.peripherals.ComputerPeripheral;

public class Keyboard extends ComputerPeripheral {
    enum Connection {
        WIRELESS, WIRED;

        public String getMemory() {

            switch (this) {
                case WIRELESS:
                    return "Wireless";

                case WIRED:
                    return "Wired";

                default:
                    return null;
            }
        }
    }
}
