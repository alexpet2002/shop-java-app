package com.aueb.model.components.specificComponents;


import com.aueb.model.components.ComputerComponent;

import java.util.Scanner;

class Cpu extends ComputerComponent {
    private static String cpuSpeed;
    static final String SPEED28 = "2.8";
    static final String SPEED33 = "3.3";
    static final String SPEED41 = "4.1";
    private static String numOfCores;
    static final String CORES6 = "6";
    static final String CORES8 = "8";
    static final String CORES16 = "16";
    private boolean cpuGraphics;
    static int numOfCpus = 0;

    Cpu() {
        setCpuSpeed("");
        setNumOfCores("");
        setCpuGraphics(false);
        numOfCpus++;
    }

    static void setCpuSpeed(String Type) {
        if (Type.equals("2.8"))
            cpuSpeed = SPEED28;
        else if (Type.equals("3.3"))
            cpuSpeed = SPEED33;
        else
            cpuSpeed = SPEED41;
    }

    String getCpuSpeed() {
        return cpuSpeed;
    }

    static void setNumOfCores(String Type) {
        if (Type.equals("6"))
            numOfCores = CORES6;
        else if (Type.equals("8"))
            numOfCores = CORES8;
        else
            numOfCores = CORES16;
    }

    String getNumOfCores() {
        return numOfCores;
    }

    void setCpuGraphics(boolean yes) {
        this.cpuGraphics = yes;
    }

    String getCpuGraphics() {
        if (cpuGraphics)
            return "With built-in graphics";
        else
            return "Without built-in graphics";
    }

    public String toString() {
        return "Cpu's features:\n"
                + "Cpu's speed: " + getCpuSpeed() + "\n"
                + "Number of cores: " + getNumOfCores() + "\n"
                + "Graphics: " + getCpuGraphics();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("1. Select Motherboard: ");
        System.out.println("2. Select Cpu: ");
        System.out.println("3. Exit");
        System.out.print("Choice? ");

        String select = in.nextLine();
        if (select.equals("2")) {
            Cpu cpu = new Cpu();
            System.out.println("Set the features of the cpu");

            System.out.println("cpu's speed:");
            System.out.println("1. for 2.8 GHz");
            System.out.println("2. for 3.3 GHz");
            System.out.println("2. for 4.1 GHz");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setCpuSpeed("2.8");
            else if (select.equals("2"))
                setCpuSpeed("3.3");
            else
                setCpuSpeed("4.1");

            System.out.println("Number of Cores:");
            System.out.println("1. Cores 6");
            System.out.println("2. Cores 8");
            System.out.println("3. Cores 16");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setNumOfCores("6");
            else if (select.equals("2"))
                setNumOfCores("8");
            else
                setNumOfCores("16");

            System.out.println("With built-in graphics or not?");
            System.out.println("1. With built-in graphics");
            System.out.println("2. Without built-in graphics");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                cpu.setCpuGraphics(true);
            else
                cpu.setCpuGraphics(false);

            System.out.println(cpu);
        }

    }
}//Cpu
