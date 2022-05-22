package com.aueb.model.components.specificComponents;


import com.aueb.model.Product;
import com.aueb.model.components.ComputerComponent;

public class Cpu extends ComputerComponent {
    // Constants
    public static final String NAME = "Cpu";
    public static final String SPEED28 = "2.8";
    public static final String SPEED33 = "3.3";
    public static final String SPEED41 = "4.1";
    public static final String CORES6 = "6";
    public static final String CORES8 = "8";
    public static final String CORES16 = "16";
    static int numOfCpus = 0;
    private static String cpuSpeed;
    private static String numOfCores;
    private boolean cpuGraphics;

    //Constructors for Cpu
    public Cpu() {
        super(NAME);
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
        setCpuGraphics(cpuGraphics);
        numOfCpus++;
    }

    public Cpu(int modelYear, String modelManufacturer, double modelPrice, String cpuSpeed, String numOfCores, boolean cpuGraphics) {
        super(NAME, modelYear, modelManufacturer, modelPrice);
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
        setCpuGraphics(cpuGraphics);
        numOfCpus++;
    }

    //Getters for Cpu
    public String getCpuSpeed() {
        return cpuSpeed;
    }

    //Setters for Cpu
    public static void setCpuSpeed(String Type) {
        if (Type.equals(SPEED28))
            cpuSpeed = SPEED28;
        else if (Type.equals(SPEED33))
            cpuSpeed = SPEED33;
        else
            cpuSpeed = SPEED41;
    }

    public String getNumOfCores() {
        return numOfCores;
    }

    public static void setNumOfCores(String Type) {
        if (Type.equals(CORES6))
            numOfCores = CORES6;
        else if (Type.equals(CORES8))
            numOfCores = CORES8;
        else
            numOfCores = CORES16;
    }

    public boolean isCpuGraphics() {
        return cpuGraphics;
    }

    public void setCpuGraphics(boolean yes) {
        this.cpuGraphics = yes;
    }

    @Override
    public String returnStringOfAllProperties() {
        return super.returnStringOfAllProperties() + getCpuSpeed() + getNumOfCores() + isCpuGraphics();
    }

    //Method for comparing two objects
    @Override
    public boolean sameProductAs(Product obj) {
        try {
            Cpu newObj = (Cpu) obj;
            return (newObj.getCpuSpeed().equals(this.getCpuSpeed()))
                    && (newObj.getNumOfCores().equals(this.getNumOfCores()))
                    && (newObj.isCpuGraphics() == this.isCpuGraphics())
                    && (newObj.getModelName().equals(this.getModelName()))
                    && (newObj.getModelYear() == this.getModelYear())
                    && (newObj.getModelManufacturer().equals(this.getModelManufacturer()));
        } catch (Exception exception) {
            return false;
        }
    }

    // toString method
    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nCpu speed:\t\t\t" + getCpuSpeed()
                + "\nNumber of cores:\t\t" + getNumOfCores()
                + "\nGraphics:\t\t\t" + isCpuGraphics()
                + "\n----------------------------------------------------------------";
    }
}// class Cpu
