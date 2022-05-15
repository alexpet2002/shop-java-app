package com.aueb.model.peripherals.specificPeripherals;

import com.aueb.model.peripherals.ComputerPeripheral;

import java.util.Scanner;

public class Monitor extends ComputerPeripheral {
    private static String monitorType;
    static final String MONITOR = "Monitor";
    static final String PORTABLE_MONITOR = "Portable Monitor";
    static final String TV_MONITOR = "TV Monitor";
    private static String monitorDimensions;
    static final String DIMENSION17 = "17";
    static final String DIMENSION24 = "24";
    private static String monitorResolution;
    static final String RESOLUTION1 = "1920 x 1080";
    static final String RESOLUTION2 = "2048 x 1152";
    private static String monitorPort;
    static final String PORT1 = "Display Port";
    static final String PORT2 = "HDMI";
    static final String PORT3 = "USB-C";
    static int numOfMonitors = 0;

    public Monitor() {
        setMonitorType("");
        setMonitorDimensions("");
        setMonitorResolution("");
        setMonitorPort("");
        numOfMonitors++;
    }

    static void setMonitorType(String Type) {
        if (Type.equals("1"))
            monitorType = MONITOR;
        else if (Type.equals("2"))
            monitorType = PORTABLE_MONITOR;
        else
            monitorType = TV_MONITOR;
    }

    String getMonitorType() {
        return monitorType;
    }

    static void setMonitorDimensions(String Type) {
        if (Type.equals("1"))
            monitorDimensions = DIMENSION17;
        else
            monitorDimensions = DIMENSION24;
    }

    String getMonitorDimensions() {
        return monitorDimensions;
    }

    static void setMonitorResolution(String Type) {
        if (Type.equals("1"))
            monitorResolution = RESOLUTION1;
        else
            monitorResolution = RESOLUTION2;
    }

    String getMonitorResolution() {
        return monitorResolution;
    }

    static void setMonitorPort(String Type) {
        if (Type.equals("1"))
            monitorPort = PORT1;
        else if (Type.equals("2"))
            monitorPort = PORT2;
        else
            monitorPort = PORT3;
    }

    String getMonitorPort() {
        return monitorPort;
    }

    public String toString() {
        return "\nMonitor features:\n"
                + "Monitor Type: " + getMonitorType() + "\n"
                + "Monitor Dimensions: " + getMonitorDimensions() + " inches\n"
                + "Monitor Resolution: " + getMonitorResolution() + "\n"
                + "Monitor Port: " + getMonitorPort() + "\n";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("6. Select Monitor: ");
        System.out.print("Choice? ");

        String select = in.nextLine();
        if (select.equals("6")) {
            Monitor monitor = new Monitor();
            System.out.println("Set the features of the Monitor");

            System.out.println("Monitor Type:");
            System.out.println("1. Monitor");
            System.out.println("2. Portable Monitor");
            System.out.println("3. TV Monitor");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setMonitorType("1");
            else if (select.equals("2"))
                setMonitorType("2");
            else
                setMonitorType("3");

            System.out.println("Monitor Dimensions:");
            System.out.println("1. 17 inches");
            System.out.println("2. 24 inches");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setMonitorDimensions("1");
            else
                setMonitorDimensions("2");

            System.out.println("Monitor Resolution:");
            System.out.println("1. 1920 X 1080");
            System.out.println("2. 2048 X 1152");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setMonitorResolution("1");
            else
                setMonitorResolution("2");

            System.out.println("Monitor Port:");
            System.out.println("1. Display Port");
            System.out.println("2. HDMI");
            System.out.println("3. USB-C");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setMonitorPort("1");
            else if (select.equals("2"))
                setMonitorPort("2");
            else
                setMonitorPort("3");

            System.out.println(monitor);
        }
    }
}// class Monitor



