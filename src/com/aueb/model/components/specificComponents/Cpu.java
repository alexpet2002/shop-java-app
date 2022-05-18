package com.aueb.model.components.specificComponents;


import com.aueb.model.components.ComputerComponent;

import java.util.Scanner;

public class Cpu extends ComputerComponent {
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

    public Cpu() {
        super();
        setCpuSpeed("");
        setNumOfCores("");
        setCpuGraphics(false);
        numOfCpus++;
    }

    public Cpu(String modelName, int modelYear, String modelManufacturer, double modelPrice, String cpuSpeed, String numOfCores, boolean cpuGraphics) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (cpuSpeed.equals("2.8"))
            setCpuSpeed(SPEED28);
        else if (cpuSpeed.equals("3.3"))
            setCpuSpeed(SPEED33);
        else
            setCpuSpeed(SPEED41);
        if (numOfCores.equals("6"))
            setNumOfCores(CORES6);
        else if (numOfCores.equals("8"))
            setNumOfCores(CORES8);
        else
            setNumOfCores(CORES16);
        if (cpuGraphics)
            setCpuGraphics(true);
        else
            setCpuGraphics(false);
        numOfCpus++;
    }

    static void setCpuSpeed(String Type) {
        if (Type.equals(SPEED28))
            cpuSpeed = SPEED28;
        else if (Type.equals(SPEED33))
            cpuSpeed = SPEED33;
        else
            cpuSpeed = SPEED41;
    }

    static void setNumOfCores(String Type) {
        if (Type.equals(CORES6))
            numOfCores = CORES6;
        else if (Type.equals(CORES8))
            numOfCores = CORES8;
        else
            numOfCores = CORES16;
    }

    void setCpuGraphics(boolean yes) {
        this.cpuGraphics = yes;
    }

    String getCpuSpeed() {
        return cpuSpeed;
    }

    String getNumOfCores() {
        return numOfCores;
    }

    String getCpuGraphics() {
        if (cpuGraphics)
            return "With built-in graphics";
        else
            return "Without built-in graphics";
    }

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nCpu's features:"
                + "\nCpu's speed:\t\t\t" + getCpuSpeed()
                + "\nNumber of cores:\t\t" + getNumOfCores()
                + "\nGraphics:\t\t\t" + getCpuGraphics()
                + "\n----------------------------------------------------------------\n";
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("2. Select Cpu: ");
        System.out.print("Choice? ");

        String select = in.nextLine();
        if (select.equals("2")) {
            Cpu cpu = new Cpu();
            System.out.println("Set the features of the cpu");

            System.out.println("cpu's speed:");
            System.out.println("1. for 2.8 GHz");
            System.out.println("2. for 3.3 GHz");
            System.out.println("3. for 4.1 GHz");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setCpuSpeed(SPEED28);
            else if (select.equals("2"))
                setCpuSpeed(SPEED33);
            else
                setCpuSpeed(SPEED41);

            System.out.println("Number of Cores:");
            System.out.println("1. Cores 6");
            System.out.println("2. Cores 8");
            System.out.println("3. Cores 16");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setNumOfCores(CORES6);
            else if (select.equals("2"))
                setNumOfCores(CORES8);
            else
                setNumOfCores(CORES16);

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
}// class Cpu
