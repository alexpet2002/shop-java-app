package com.aueb.model.peripherals.specificPeripherals;

import com.aueb.model.peripherals.ComputerPeripheral;

import java.util.Scanner;

public class Mouse extends ComputerPeripheral {
    private static String mouseTech;
    static final String LASER = "Laser";
    static final String OPTICAL = "Optical";
    private static String mouseConnect;
    static final String WIRED = "Wired";
    static final String WIRELESS = "Wireless";
    private static int numOfMice = 0;

    public Mouse() {
        mouseTech = "";
        mouseConnect = "";
        numOfMice++;
    }

    static void setMouseTech(String Type) {
        if (Type.equals("1"))
            mouseTech = LASER;
        else
            mouseTech = OPTICAL;
    }

    static void setMouseConnect(String Type) {
        if (Type.equals("1"))
            mouseConnect = WIRED;
        else
            mouseConnect = WIRELESS;
    }

    String getMouseTech() {
        return mouseTech;
    }

    String getMouseConnect() {
        return mouseConnect;
    }

    public String toString() {
        return "\nMouse Technology: " + getMouseTech() + "\n"
                + "Mouse connection: " + getMouseConnect() + "\n";
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("8. Select Mouse: ");
        System.out.print("Choice? ");

        String select = in.nextLine();
        if (select.equals("8")) {
            Mouse mouse = new Mouse();
            System.out.println("Set the features of the mouse");

            System.out.println("Mouse technology:");
            System.out.println("1. Laser");
            System.out.println("2. Optical");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setMouseTech("1");
            else
                setMouseTech("2");

            System.out.println("Mouse connection:");
            System.out.println("1. Wired");
            System.out.println("2. Wireless");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setMouseConnect("1");
            else
                setMouseConnect("2");

            System.out.println(mouse);
        }
    }
}
