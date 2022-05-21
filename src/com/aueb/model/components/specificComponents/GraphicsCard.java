package com.aueb.model.components.specificComponents;

import com.aueb.model.components.ComputerComponent;

public class GraphicsCard extends ComputerComponent {
    private static String chipset;
    static final String NVIDIA = "nVIDIA";
    static final String AMD = "AMD";

    private static String cardMemory;
    static final String MEM6 = "6";
    static final String MEM8 = "8";
    static final String MEM12 = "12";

    private int numOfGraphicsCard = 0;

    public GraphicsCard() {
        super();
        setChipset("");
        setCardMemory("");
        numOfGraphicsCard++;
    }

    public GraphicsCard(String modelName, int modelYear, String modelManufacturer, double modelPrice, String chipset, String cardMemory) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (chipset.equals("nVIDIA"))
            setChipset(NVIDIA);
        else
            setChipset(AMD);
        if (cardMemory.equals("6"))
            setCardMemory(MEM6);
        else if (cardMemory.equals("8"))
            setCardMemory(MEM8);
        else
            setCardMemory(MEM12);
        numOfGraphicsCard++;
    }

    public static void setChipset(String Type) {
        if (Type.equals(NVIDIA))
            chipset = NVIDIA;
        else
            chipset = AMD;
    }

    public static void setCardMemory(String Type) {
        if (Type.equals(MEM6))
            cardMemory = MEM6;
        else if (Type.equals(MEM8))
            cardMemory = MEM8;
        else
            cardMemory = MEM12;
    }

    public String getChipset() {
        return chipset;
    }

    public String getCardMemory() {
        return cardMemory;
    }

    public String getModelName() {
        return getChipset() + "_" + getCardMemory();
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
        return "GRAPHIC_COMPUTERS";
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
        return sum + 235.0;
    }

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nGraphics card features:\n"
                + "Chipset Type:\t\t\t" + getChipset() + "\n"
                + "Graphics card memory size:\t" + getCardMemory() + " GB"
                + "\n----------------------------------------------------------------\n";

    }
}// class GraphicsCard