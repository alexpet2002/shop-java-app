package com.aueb.model.components.specificComponents;

import com.aueb.model.components.ComputerComponent;

import java.util.Scanner;

public class Motherboard extends ComputerComponent {
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

    public Motherboard() {
        super();
        setProcessorType("");
        setMemoryType("");
        setNumOfPortsSataType("");
        numOfMotherboards++;
    }

    public Motherboard(String modelName, int modelYear, String modelManufacturer, double modelPrice, String processorType, String memoryType, String numOfPortsSataType) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (processorType.equals("TYPE_INTEL"))
            setProcessorType(TYPE_INTEL);
        else
            setProcessorType(TYPE_AMD);
        if (memoryType.equals("32"))
            setMemoryType(MEM32);
        else if (memoryType.equals("64"))
            setMemoryType(MEM64);
        else
            setMemoryType(MEM128);
        if (numOfPortsSataType.equals("4"))
            setNumOfPortsSataType(SATA4);
        else if (numOfPortsSataType.equals("6"))
            setNumOfPortsSataType(SATA6);
        else
            setNumOfPortsSataType(SATA8);
        numOfMotherboards++;
    }

    static void setProcessorType(String Type) {
        if (Type.equals(TYPE_INTEL)) {
            processorType = TYPE_INTEL;
        } else
            processorType = TYPE_AMD;
    }

    static void setMemoryType(String Type) {
        if (Type.equals(MEM32))
            memoryType = MEM32;
        else if (Type.equals(MEM64))
            memoryType = MEM64;
        else
            memoryType = MEM128;
    }

    static void setNumOfPortsSataType(String Type) {
        if (Type.equals(SATA4))
            numOfPortsSataType = SATA4;
        else if (Type.equals(SATA6))
            numOfPortsSataType = SATA6;
        else
            numOfPortsSataType = SATA8;
    }

    String getProcessorType() {
        return processorType;
    }

    String getMemoryType() {
        return memoryType;
    }

    String getNumOfPortsSataType() {
        return numOfPortsSataType;
    }

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nMotherboard's features:"
                + "\nProcessor Type:\t\t\t" + getProcessorType()
                + "\nMemory size:\t\t\t" + getMemoryType() + " GB"
                + "\nNumber of sata ports:\t\t" + getNumOfPortsSataType() + " ports"
                + "\n----------------------------------------------------------------\n";
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("1. Select Motherboard: ");
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
                setProcessorType(TYPE_INTEL);
            else
                setProcessorType(TYPE_AMD);

            System.out.println("Memory features:");
            System.out.println("1. 32 GB memory");
            System.out.println("2. 64 GB memory");
            System.out.println("3. 128 GB memory");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setMemoryType(MEM32);
            else if (select.equals("2"))
                setMemoryType(MEM64);
            else
                setMemoryType(MEM128);

            System.out.println("Number of sata ports:");
            System.out.println("1. SATA ports 4");
            System.out.println("2. SATA ports 6");
            System.out.println("3. SATA ports 8");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setNumOfPortsSataType(SATA4);
            else if (select.equals("2"))
                setNumOfPortsSataType(SATA6);
            else
                motherboard.setNumOfPortsSataType(SATA8);

            System.out.println(motherboard);
        }
    }
}// class Motherboard

