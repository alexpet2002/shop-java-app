package com.aueb.model.components.specificComponents;

import com.aueb.model.components.ComputerComponent;

import java.util.Scanner;

class Motherboard extends ComputerComponent {

    private static String processorType;
    static final String TYPE_INTEL = "TYPE_INTEL";
    static final String TYPE_AMD = "TYPE_AMD";

    private static String memoryType;
    static final String MEM32 = "32";
    static final String MEM64 = "64";
    static final String MEM128 = "128";

    private static String numOfPortsSataType;
    static final String SATA4 = "4";
    static final String SATA6 = "6";
    static final String SATA8 = "8";

    static int numOfMotherboards = 0;

    Motherboard() {
        setProcessorType("");
        setMemoryType("");
        setNumOfPortsSataType("");
        numOfMotherboards++;
    }

    static void setProcessorType(String Type) {
        if (Type.equals("1"))
            processorType = TYPE_INTEL;
        else
            processorType = TYPE_AMD;
    }

    String getProcessorType() {
        return processorType;
    }

    static void setMemoryType(String Type) {
        if (Type.equals("32"))
            memoryType = MEM32;
        else if (Type.equals("64"))
            memoryType = MEM64;
        else
            memoryType = MEM128;
    }

    String getMemoryType() {
        return memoryType;
    }

    static void setNumOfPortsSataType(String Type) {
        if (Type.equals("4"))
            numOfPortsSataType = SATA4;
        else if (Type.equals("6"))
            numOfPortsSataType = SATA6;
        else
            numOfPortsSataType = SATA8;
    }

    String getNumOfPortsSataType() {
        return numOfPortsSataType;
    }

    public String toString() {
        return "Motherboard features:\n"
                + "Processor Type: " + getProcessorType() + "\n"
                + "Memory size: " + getMemoryType() + " GB\n"
                + "Number of sata ports: " + getNumOfPortsSataType();
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("1. Select Motherboard: ");
        System.out.println("2. Select Cpu: ");
        System.out.println("3. Exit");
        System.out.print("Choice? ");

        String select = in.nextLine();
        if (select.equals("1")) {
            Motherboard motherboard = new Motherboard();
            System.out.println("Set the features of the motherboard");

            System.out.println("Processor features:");
            System.out.println("1. Intel's processor");
            System.out.println("2. AMD's processor");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setProcessorType("1");
            else
                setProcessorType("2");

            System.out.println("Memory features:");
            System.out.println("1. 32 GB memory");
            System.out.println("2. 64 GB memory");
            System.out.println("3. 128 GB memory");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setMemoryType("32");
            else if (select.equals("2"))
                setMemoryType("64");
            else
                setMemoryType("128");

            System.out.println("Number of sata ports:");
            System.out.println("1. SATA ports 4");
            System.out.println("2. SATA ports 6");
            System.out.println("3. SATA ports 8");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setNumOfPortsSataType("4");
            else if (select.equals("2"))
                setNumOfPortsSataType("6");
            else
                setNumOfPortsSataType("8");

            System.out.println(motherboard);
        }
    }


}//Motherboard
