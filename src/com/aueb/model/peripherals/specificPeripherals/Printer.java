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
        printerTech = "";
        printType = "";
        numOfPrinters++;
    }

    static void setPrinterTech(String Type) {
        if (Type.equals("1"))
            printerTech = LASER;
        else
            printerTech = INKJET;
    }

    static void setPrintType(String Type) {
        if (Type.equals("1"))
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
        return "\nPrinter Technology: " + getPrinterTech() + "\n"
                + "Printing Type: " + getPrintType() + "\n";
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
                setPrinterTech("1");
            else
                setPrinterTech("2");

            System.out.println("Mouse connection:");
            System.out.println("1. Wired");
            System.out.println("2. Wireless");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setPrintType("1");
            else
                setPrintType("2");

            System.out.println(printer);
        }
    }

}
