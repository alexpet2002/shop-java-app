package com.aueb.model.components.specificComponents;


import com.aueb.model.components.ComputerComponent;

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

    public static void setCpuSpeed(String Type) {
        if (Type.equals(SPEED28))
            cpuSpeed = SPEED28;
        else if (Type.equals(SPEED33))
            cpuSpeed = SPEED33;
        else
            cpuSpeed = SPEED41;
    }

    public static void setNumOfCores(String Type) {
        if (Type.equals(CORES6))
            numOfCores = CORES6;
        else if (Type.equals(CORES8))
            numOfCores = CORES8;
        else
            numOfCores = CORES16;
    }

    public void setCpuGraphics(boolean yes) {
        this.cpuGraphics = yes;
    }

    public String getCpuSpeed() {
        return cpuSpeed;
    }

    public String getNumOfCores() {
        return numOfCores;
    }

    public String getCpuGraphics() {
        if (cpuGraphics)
            return "With_built-in_graphics";
        else
            return "Without_built-in_graphics";
    }

    public String getModelName() {
        return "Cpu_" + getCpuSpeed() + "_" + getNumOfCores() + "_" + getCpuGraphics();
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
        return getModelName().substring(0, 3) + "_COMPUTERS";
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
        return sum + 200.0;
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
}// class Cpu
