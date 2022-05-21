package com.aueb.model.components.specificComponents;

import com.aueb.model.components.ComputerComponent;

public class Ram extends ComputerComponent {
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

    public Ram() {
        super();
        setRamType("");
        setRamSize("");
        setRamFrequency("");
        numOfRams++;
    }

    public Ram(String modelName, int modelYear, String modelManufacturer, double modelPrice, String ramType, String ramSize, String ramFrequency) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (ramType.equals("DDR3"))
            setRamType(DDR3);
        else if (ramType.equals("DDR4"))
            setRamType(DDR4);
        else
            setRamType(DDR5);
        if (ramSize.equals("4"))
            setRamSize(SIZE4);
        else if (ramSize.equals("8"))
            setRamSize(SIZE8);
        else
            setRamSize(SIZE16);
        if (ramFrequency.equals("1600"))
            setRamFrequency(FREQUENCY1600);
        else if (ramFrequency.equals("2666"))
            setRamFrequency(FREQUENCY2666);
        else
            setRamFrequency(FREQUENCY3200);
        numOfRams++;
    }

    public static void setRamType(String Type) {
        if (Type.equals(DDR3))
            ramType = DDR3;
        else if (Type.equals(DDR4))
            ramType = DDR4;
        else
            ramType = DDR5;
    }

    public static void setRamSize(String Type) {
        if (Type.equals(SIZE4))
            ramSize = SIZE4;
        else if (Type.equals(SIZE8))
            ramSize = SIZE8;
        else
            ramSize = SIZE16;
    }

    public static void setRamFrequency(String Type) {
        if (Type.equals(FREQUENCY1600))
            ramFrequency = FREQUENCY1600;
        else if (Type.equals(FREQUENCY2666))
            ramFrequency = FREQUENCY2666;
        else
            ramFrequency = FREQUENCY3200;
    }

    public String getRamType() {
        return ramType;
    }

    public String getRamSize() {
        return ramSize;
    }

    public String getRamFrequency() {
        return ramFrequency;
    }

    public String getModelName() {
        return getRamType() + "_" + getRamSize() + "_" + getRamFrequency();
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
        return getModelName().substring(0, 4) + "RAM_COMPUTERS";
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
        return sum + 150.0;
    }

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nRum's features:"
                + "\nRum Type:\t\t\t" + getRamType()
                + "\nRum size:\t\t\t" + getRamSize() + " GB"
                + "\nRam frequency:\t\t\t" + getRamFrequency() + " GHz\n"
                + "\n----------------------------------------------------------------\n";
    }
}// class Ram

