package com.aueb.model.peripherals.specificPeripherals;

import com.aueb.model.peripherals.ComputerPeripheral;

import java.util.Scanner;

public class Printer extends ComputerPeripheral {
    private static String printerTech;
    static final String LASER = "Laser";
    static final String INKJET = "Inkjet";

    private static String printType;
    static final String COLORED = "Colored";
    static final String BLACK_WHITE = "Black and White";

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

    static void setPrinterTech(String Type) {
        if (Type.equals(LASER))
            printerTech = LASER;
        else
            printerTech = INKJET;
    }

    static void setPrintType(String Type) {
        if (Type.equals(COLORED))
            printType = COLORED;
        else
            printType = BLACK_WHITE;
    }

    String getPrinterTech() {
        return printerTech;
    }

    String getPrintType() {
        return printType;
    }

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nPrinter's features"
                + "\nPrinter Technology:\t\t" + getPrinterTech()
                + "\nPrinting Type:\t\t\t" + getPrintType()
                + "\n----------------------------------------------------------------\n";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("9. Select Printer: ");
        System.out.print("Choice? ");

        String select = in.nextLine();
        if (select.equals("9")) {
            Printer printer = new Printer();
            System.out.println("Set the features of the printer");

            System.out.println("Printer technology:");
            System.out.println("1. Laser");
            System.out.println("2. Inkjet");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setPrinterTech(LASER);
            else
                setPrinterTech(INKJET);

            System.out.println("Print's Type:");
            System.out.println("1. Colored");
            System.out.println("2. Black and White");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setPrintType(COLORED);
            else
                setPrintType(BLACK_WHITE);

            System.out.println(printer);
        }
    }
}// class Printer
