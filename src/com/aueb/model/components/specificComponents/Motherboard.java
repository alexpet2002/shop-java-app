package com.aueb.model.components.specificComponents;

import com.aueb.model.components.ComputerComponent;

public class Motherboard extends ComputerComponent {
    static String processorType;
    static final String TYPE_INTEL = "TYPE_INTEL";
    static final String TYPE_AMD = "TYPE_AMD";

    static String memoryType;
    static final String MEM32 = "32";
    static final String MEM64 = "64";
    static final String MEM128 = "128";

    static String numOfPortsSataType;
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

    public static void setProcessorType(String Type) {
        if (Type.equals(TYPE_INTEL)) {
            processorType = TYPE_INTEL;
        } else
            processorType = TYPE_AMD;
    }

    public static void setMemoryType(String Type) {
        if (Type.equals(MEM32))
            memoryType = MEM32;
        else if (Type.equals(MEM64))
            memoryType = MEM64;
        else
            memoryType = MEM128;
    }

    public static void setNumOfPortsSataType(String Type) {
        if (Type.equals(SATA4))
            numOfPortsSataType = SATA4;
        else if (Type.equals(SATA6))
            numOfPortsSataType = SATA6;
        else
            numOfPortsSataType = SATA8;
    }

    public String getProcessorType() {
        return processorType;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public String getNumOfPortsSataType() {
        return numOfPortsSataType;
    }

    public String getModelName() {
        return getProcessorType() + "_" + getMemoryType() + "_" + getNumOfPortsSataType();
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
        return getModelName().substring(5, 8) + "_COMPUTERS";
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
        return sum + 500.0;
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
}// class Motherboard

