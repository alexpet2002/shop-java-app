package com.aueb.model.peripherals.specificPeripherals;

import com.aueb.model.peripherals.ComputerPeripheral;

public class Printer extends ComputerPeripheral {
    private static String printerTech;
    static final String LASER = "Laser";
    static final String INKJET = "Inkjet";

    private static String printType;
    static final String COLORED = "Colored";
    static final String BLACK_WHITE = "Black_and_White";

    private static int numOfPrinters = 0;

    public Printer() {
        super();
        printerTech = "";
        printType = "";
        numOfPrinters++;
    }

    public Printer(String modelName, int modelYear, String modelManufacturer, double modelPrice, String printerTech, String printType) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (printerTech.equals("Laser"))
            setPrinterTech(LASER);
        else
            setPrinterTech(INKJET);
        if (printType.equals("Colored"))
            setPrintType(COLORED);
        else
            setPrintType(BLACK_WHITE);
        numOfPrinters++;
    }

    public static void setPrinterTech(String Type) {
        if (Type.equals(LASER))
            printerTech = LASER;
        else
            printerTech = INKJET;
    }

    public static void setPrintType(String Type) {
        if (Type.equals(COLORED))
            printType = COLORED;
        else
            printType = BLACK_WHITE;
    }

    public String getPrinterTech() {
        return printerTech;
    }

    public String getPrintType() {
        return printType;
    }

    public String getModelName() {
        return getPrinterTech() + "_" + getPrintType();
    }

    public int getModelYear() {
        return 2022;
    }

    public String getModelManufacturer() {
        return "PRINTER_COMPUTERS";
    }

    public double getModelPrice() {
        String str1 = getModelName();

        char[] c = str1.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += Integer.valueOf(c[i]);
        }
        return 200.0 + sum % 100;
    }

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nPrinter's features"
                + "\nPrinter Technology:\t\t" + getPrinterTech()
                + "\nPrinting Type:\t\t\t" + getPrintType()
                + "\n----------------------------------------------------------------\n";
    }
}// class Printer
