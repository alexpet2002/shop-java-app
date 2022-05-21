package com.aueb.model.peripherals.specificPeripherals;


import com.aueb.model.peripherals.ComputerPeripheral;

public class Keyboard extends ComputerPeripheral {
    private static String keyboardConnect;
    static final String WIRED = "Wired";
    static final String WIRELESS = "Wireless";

    private static int numOfKeyboards = 0;

    public Keyboard() {
        super();
        keyboardConnect = "";
        numOfKeyboards++;
    }

    public Keyboard(String modelName, int modelYear, String modelManufacturer, double modelPrice, String keyboardConnect) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (keyboardConnect.equals("Wired"))
            setKeyboardConnect(WIRED);
        else
            setKeyboardConnect(WIRELESS);
        numOfKeyboards++;
    }

    public static void setKeyboardConnect(String Type) {
        if (Type.equals(WIRED))
            keyboardConnect = WIRED;
        else
            keyboardConnect = WIRELESS;
    }

    public String getKeyboardConnect() {
        return keyboardConnect;
    }

    public String getModelName() {
        return "Keyboard_" + getKeyboardConnect();
    }

    public int getModelYear() {

        return 2022;
    }

    public String getModelManufacturer() {
        return "KEYBOARD_COMPUTERS";
    }

    public double getModelPrice() {
        return 20 + getModelName().length();
    }

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nKeyboard features:"
                + "\nKeyboard connection:\t\t" + getKeyboardConnect()
                + "\n----------------------------------------------------------------\n";
    }
}// class Keyboard
