package com.aueb.model.peripherals.specificPeripherals;

public class Keyboard {
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
