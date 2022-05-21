package com.aueb.model.peripherals.specificPeripherals;

import com.aueb.model.peripherals.ComputerPeripheral;

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

    public static void setMouseTech(String Type) {
        if (Type.equals(LASER))
            mouseTech = LASER;
        else
            mouseTech = OPTICAL;
    }

    public static void setMouseConnect(String Type) {
        if (Type.equals(WIRED))
            mouseConnect = WIRED;
        else
            mouseConnect = WIRELESS;
    }

    public String getMouseTech() {
        return mouseTech;
    }

    public String getMouseConnect() {
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
} //class Mouse
