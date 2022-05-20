package com.aueb.model.peripherals.specificPeripherals;


import com.aueb.model.peripherals.ComputerPeripheral;

import java.util.Scanner;

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

    static void setKeyboardConnect(String Type) {
        if (Type.equals(WIRED))
            keyboardConnect = WIRED;
        else
            keyboardConnect = WIRELESS;
    }

    String getKeyboardConnect() {
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("7. Select Keyboard: ");
        System.out.print("Choice? ");

        String select = in.nextLine();
        if (select.equals("7")) {
            Keyboard keyboard = new Keyboard();
            System.out.println("Set the features of the keyboard");

            System.out.println("Keyboard connection:");
            System.out.println("1. Wired");
            System.out.println("2. Wireless");
            select = in.nextLine();
            if (select.equals("1"))
                setKeyboardConnect(WIRED);
            else
                setKeyboardConnect(WIRELESS);

            System.out.println(keyboard);
        }
    }
}// class Keyboard
