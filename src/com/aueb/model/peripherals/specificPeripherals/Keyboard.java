package com.aueb.model.peripherals.specificPeripherals;


import com.aueb.model.peripherals.ComputerPeripheral;

import java.util.Scanner;

public class Keyboard extends ComputerPeripheral {
    private static String keyboardConnect;
    static final String WIRED = "Wired";
    static final String WIRELESS = "Wireless";
    private static int numOfKeyboards = 0;

    public Keyboard() {
        keyboardConnect = "";
        numOfKeyboards++;
    }

    static void setKeyboardConnect(String Type) {
        if (Type.equals("1"))
            keyboardConnect = WIRED;
        else
            keyboardConnect = WIRELESS;
    }

    String getKeyboardConnect() {
        return keyboardConnect;
    }

    public String toString() {
        return "\nKeyboard connection: " + getKeyboardConnect() + "\n";
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
                setKeyboardConnect("1");
            else
                setKeyboardConnect("2");

            System.out.println(keyboard);
        }

    }

}// class Keyboard
