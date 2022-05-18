package com.aueb.model.components.specificComponents;

import com.aueb.model.components.ComputerComponent;

import java.util.Scanner;

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

    static void setChipset(String Type) {
        if (Type.equals(NVIDIA))
            chipset = NVIDIA;
        else
            chipset = AMD;
    }

    static void setCardMemory(String Type) {
        if (Type.equals(MEM6))
            cardMemory = MEM6;
        else if (Type.equals(MEM8))
            cardMemory = MEM8;
        else
            cardMemory = MEM12;
    }

    String getChipset() {
        return chipset;
    }

    String getCardMemory() {
        return cardMemory;
    }

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nGraphics card features:\n"
                + "Chipset Type:\t\t\t" + getChipset() + "\n"
                + "Graphics card memory size:\t" + getCardMemory() + " GB"
                + "\n----------------------------------------------------------------\n";

    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("4. Select Graphics card");
        System.out.print("Choice? ");

        String select = in.nextLine();
        if (select.equals("4")) {
            GraphicsCard card = new GraphicsCard();
            System.out.println("Set the features of the Graphics card");

            System.out.println("Graphics card chipset:");
            System.out.println("1. nVIDIA");
            System.out.println("2. AMD");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setChipset(NVIDIA);
            else
                setChipset(AMD);

            System.out.println("Card Memory:");
            System.out.println("1. 6 GB");
            System.out.println("2. 8 GB");
            System.out.println("3. 12 GB");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setCardMemory(MEM6);
            else if (select.equals("2"))
                setCardMemory(MEM8);
            else
                setCardMemory(MEM12);

            System.out.println(card);
        }
    }
}// class GraphicsCard