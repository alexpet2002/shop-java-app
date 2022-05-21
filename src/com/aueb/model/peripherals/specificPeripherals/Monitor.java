package com.aueb.model.peripherals.specificPeripherals;

import com.aueb.model.peripherals.ComputerPeripheral;

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
        super();
        setMonitorType("");
        setMonitorDimensions("");
        setMonitorResolution("");
        setMonitorPort("");
        numOfMonitors++;
    }

    public Monitor(String modelName, int modelYear, String modelManufacturer, double modelPrice, String monitorType, String monitorDimensions, String monitorResolution, String monitorPort) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (monitorType.equals("Monitor"))
            setMonitorType(MONITOR);
        else if (monitorType.equals("Portable Monitor"))
            setMonitorType(PORTABLE_MONITOR);
        else
            setMonitorType(TV_MONITOR);
        if (monitorDimensions.equals("17"))
            setMonitorDimensions(DIMENSION17);
        else
            setMonitorDimensions(DIMENSION24);
        if (monitorResolution.equals("1920 x 1080"))
            setMonitorResolution(RESOLUTION1);
        else
            setMonitorResolution(RESOLUTION2);
        if (monitorPort.equals("Display Port"))
            setMonitorPort(PORT1);
        else if (monitorPort.equals("HDMI"))
            setMonitorPort(PORT2);
        else
            setMonitorPort(PORT3);
        numOfMonitors++;
    }

    public static void setMonitorType(String Type) {
        if (Type.equals(MONITOR))
            monitorType = MONITOR;
        else if (Type.equals(PORTABLE_MONITOR))
            monitorType = PORTABLE_MONITOR;
        else
            monitorType = TV_MONITOR;
    }

    public static void setMonitorDimensions(String Type) {
        if (Type.equals(DIMENSION17))
            monitorDimensions = DIMENSION17;
        else
            monitorDimensions = DIMENSION24;
    }

    public static void setMonitorResolution(String Type) {
        if (Type.equals(RESOLUTION1))
            monitorResolution = RESOLUTION1;
        else
            monitorResolution = RESOLUTION2;
    }

    public static void setMonitorPort(String Type) {
        if (Type.equals(PORT1))
            monitorPort = PORT1;
        else if (Type.equals(PORT2))
            monitorPort = PORT2;
        else
            monitorPort = PORT3;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public String getMonitorDimensions() {
        return monitorDimensions;
    }

    public String getMonitorResolution() {
        return monitorResolution;
    }

    public String getMonitorPort() {
        return monitorPort;
    }

    public String getModelName() {
        return getMonitorType() + "_" + getMonitorDimensions() + "_" + getMonitorResolution() + "_" + getMonitorPort();
    }

    public int getModelYear() {
        String str1 = getModelName();

        char[] c = str1.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        return sum + 2000;
    }

    public String getModelManufacturer() {
        return "MONITOR_COMPUTERS";
    }

    public double getModelPrice() {
        String str1 = getModelName();

        char[] c = str1.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        return sum + 460.0;
    }
    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nMonitor features:\n"
                + "Monitor Type:\t\t\t" + getMonitorType() + "\n"
                + "Monitor Dimensions:\t\t" + getMonitorDimensions() + " inches\n"
                + "Monitor Resolution:\t\t" + getMonitorResolution() + "\n"
                + "Monitor Port:\t\t\t" + getMonitorPort()
                + "\n----------------------------------------------------------------\n";
    }
}// class Monitor



