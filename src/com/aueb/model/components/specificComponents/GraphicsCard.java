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
        setChipset("");
        setCardMemory("");
        numOfGraphicsCard++;
    }

    static void setChipset(String Type) {
        if (Type.equals("1"))
            chipset = NVIDIA;
        else
            chipset = AMD;
    }

    String getChipset() {
        return chipset;
    }

    static void setCardMemory(String Type) {
        if (Type.equals("6"))
            cardMemory = MEM6;
        else if (Type.equals("8"))
            cardMemory = MEM8;
        else
            cardMemory = MEM12;
    }

    String getCardMemory() {
        return cardMemory;
    }

    public String toString() {
        return "\nGraphics card features:\n"
                + "Chipset Type: " + getChipset() + "\n"
                + "Graphics card memory size: " + getCardMemory() + " GB\n";

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
                setChipset("1");
            else
                setChipset("2");

            System.out.println("Card Memory:");
            System.out.println("1. 6 GB");
            System.out.println("2. 8 GB");
            System.out.println("3. 12 GB");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setCardMemory("6");
            else if (select.equals("2"))
                setCardMemory("8");
            else
                setCardMemory("12");

            System.out.println(card);
        }
    }
}// class GraphicsCard