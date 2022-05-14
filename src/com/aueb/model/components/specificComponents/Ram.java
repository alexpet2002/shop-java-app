package com.aueb.model.components.specificComponents;

import com.aueb.model.components.ComputerComponent;

import java.util.Scanner;

class Ram extends ComputerComponent {
    private static String ramType;
    static final String DDR3 = "DDR3";
    static final String DDR4 = "DDR4";
    static final String DDR5 = "DDR5";
    private static String ramSize;
    static final String SIZE4 = "4";
    static final String SIZE8 = "8";
    static final String SIZE16 = "16";
    private static String ramFrequency;
    static final String FREQUENCY1600 = "1600";
    static final String FREQUENCY2666 = "2666";
    static final String FREQUENCY3200 = "3200";
    static int numOfRams = 0;

    Ram() {

    }

    static void setRamType(String Type) {
        if (Type.equals("1"))
            ramType = DDR3;
        else if (Type.equals("2"))
            ramType = DDR4;
        else
            ramType = DDR5;
    }

    String getRamType() {
        return ramType;
    }

    static void setRamSize(String Type) {
        if (Type.equals("1"))
            ramSize = SIZE4;
        else if (Type.equals("2"))
            ramSize = SIZE8;
        else
            ramSize = SIZE16;
    }

    String getRamSize() {
        return ramSize;
    }

    static void setRamFrequency(String Type) {
        if (Type.equals("1"))
            ramFrequency = FREQUENCY1600;
        else if (Type.equals("2"))
            ramFrequency = FREQUENCY2666;
        else
            ramFrequency = FREQUENCY3200;
    }

    String getRamFrequency() {
        return ramFrequency;
    }

    public String toString() {
        return "Rum features:\n"
                + "Rum Type: " + getRamType() + "\n"
                + "Rum size: " + getRamSize() + " GB\n"
                + "Ram frequency: " + getRamFrequency() + " GHz";
    }


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("1. Select Motherboard: ");
        System.out.println("2. Select Cpu: ");
        System.out.println("3. Select RAM");
        System.out.println("3. Exit");
        System.out.print("Choice? ");

        String select = in.nextLine();
        if (select.equals("3")) {
            Ram ram = new Ram();
            System.out.println("Set the features of the RAM");

            System.out.println("Ram Type:");
            System.out.println("1. DDR3");
            System.out.println("2. DDR4");
            System.out.println("2. DDR5");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setRamType("1");
            else if (select.equals("2"))
                setRamType("2");
            else
                setRamType("3");

            System.out.println("RAM size:");
            System.out.println("1. 4 GB");
            System.out.println("2. 8 GB");
            System.out.println("3. 16 GB");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setRamSize("4");
            else if (select.equals("2"))
                setRamSize("8");
            else
                setRamSize("16");

            System.out.println("Frequency of RAM");
            System.out.println("1. 1600 MHz");
            System.out.println("2. 2666 MHz");
            System.out.println("3. 3200 MHz");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setRamFrequency("1600");
            else if (select.equals("2"))
                setRamFrequency("2666");
            else
                setRamFrequency("3200");

            System.out.println(ram);
        }
    }

}//Ram

