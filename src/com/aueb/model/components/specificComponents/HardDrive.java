package com.aueb.model.components.specificComponents;

import com.aueb.model.components.ComputerComponent;

public class HardDrive extends ComputerComponent {
    private static String driveType;
    static final String HDD = "HDD";
    static final String SSD = "SSD";

    private static String driveSize;
    static final String DRIVE_SIZE18 = "1.8";
    static final String DRIVE_SIZE25 = "2.5";
    static final String DRIVE_SIZE35 = "3.5";

    private static String driveCapacity;
    static final String CAPACITY256 = "256 GB";
    static final String CAPACITY512 = "512 GB";
    static final String CAPACITY_1TB = "1 TB";
    static final String CAPACITY_2TB = "2 TB";

    private int numOfHardDrives = 0;

    public HardDrive() {
        super();
        setDriveType("");
        setDriveSize("");
        setDriveCapacity("");
        numOfHardDrives++;
    }

    public HardDrive(String modelName, int modelYear, String modelManufacturer, double modelPrice, String driveType, String driveSize, String driveCapacity) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (driveType.equals("HDD"))
            setDriveType(HDD);
        else
            setDriveType(SSD);
        if (driveSize.equals("1.8"))
            setDriveSize(DRIVE_SIZE18);
        else if (driveSize.equals("2.5"))
            setDriveSize(DRIVE_SIZE25);
        else
            setDriveSize(DRIVE_SIZE35);
        if (driveCapacity.equals("256 GB"))
            setDriveCapacity(CAPACITY256);
        else if (driveCapacity.equals("512 GB"))
            setDriveCapacity(CAPACITY512);
        else if (driveCapacity.equals("1 TB"))
            setDriveCapacity(CAPACITY_1TB);
        else
            setDriveCapacity(CAPACITY_2TB);
        numOfHardDrives++;
    }

    public static void setDriveType(String Type) {
        if (Type.equals(HDD))
            driveType = HDD;
        else
            driveType = SSD;
    }

    public static void setDriveSize(String Type) {
        if (Type.equals(DRIVE_SIZE18))
            driveSize = DRIVE_SIZE18;
        else if (Type.equals(DRIVE_SIZE25))
            driveSize = DRIVE_SIZE25;
        else
            driveSize = DRIVE_SIZE35;
    }

    public static void setDriveCapacity(String Type) {
        if (Type.equals(CAPACITY256))
            driveCapacity = CAPACITY256;
        else if (Type.equals(CAPACITY512))
            driveCapacity = CAPACITY512;
        else if (Type.equals(CAPACITY_1TB))
            driveCapacity = CAPACITY_1TB;
        else
            driveCapacity = CAPACITY_2TB;
    }

    public String getDriveType() {
        return driveType;
    }

    public String getDriveSize() {
        return driveSize;
    }

    public String getDriveCapacity() {
        return driveCapacity;
    }

    public String getModelName() {
        return getDriveType() + "_" + getDriveSize() + "_" + getDriveCapacity();
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
        return getModelName().substring(0, 3) + "DRIVE_COMPUTERS";
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
        return sum + 250.0;
    }

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nHard drive features:\n"
                + "Hard drive type:\t\t" + getDriveType() + "\n"
                + "Hard drive size:\t\t" + getDriveSize() + " inches\n"
                + "Hard drive capacity:\t\t" + getDriveCapacity()
                + "\n----------------------------------------------------------------\n";
    }
}// class HardDrive