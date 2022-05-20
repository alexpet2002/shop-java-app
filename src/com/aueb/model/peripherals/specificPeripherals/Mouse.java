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
        super();
        mouseTech = "";
        mouseConnect = "";
        numOfMice++;
    }

    public Mouse(String modelName, int modelYear, String modelManufacturer, double modelPrice, String mouseTech, String mouseConnect) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (mouseTech.equals("Laser"))
            setMouseTech(LASER);
        else
            setMouseTech(OPTICAL);
        if (mouseConnect.equals("Wired"))
            setMouseConnect(WIRED);
        else
            setMouseTech(WIRELESS);
        numOfMice++;
    }

    static void setMouseTech(String Type) {
        if (Type.equals(LASER))
            mouseTech = LASER;
        else
            mouseTech = OPTICAL;
    }

    static void setMouseConnect(String Type) {
        if (Type.equals(WIRED))
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

    public String getModelName() {
        return getMouseTech() + "_" + getMouseConnect();
    }

    public int getModelYear() {
        return 2022;
    }

    public String getModelManufacturer() {
        return "MOUSE_COMPUTERS";
    }

    public double getModelPrice() {
        String str1 = getModelName();

        char[] c = str1.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += Integer.valueOf(c[i]);
        }
        return 20.0 + sum % 100;
    }

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nMouse features:"
                + "\nMouse Technology:\t\t" + getMouseTech()
                + "\nMouse Connection:\t\t" + getMouseConnect()
                + "\n----------------------------------------------------------------\n";
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
                setMouseTech(LASER);
            else
                setMouseTech(OPTICAL);

            System.out.println("Mouse connection:");
            System.out.println("1. Wired");
            System.out.println("2. Wireless");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setMouseConnect(WIRED);
            else
                setMouseConnect(WIRELESS);

            System.out.println(mouse);
        }
    }
} //class Mouse
