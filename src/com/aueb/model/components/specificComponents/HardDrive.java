package com.aueb.model.components.specificComponents;

import com.aueb.model.components.ComputerComponent;

import java.util.Scanner;

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

    static void setDriveType(String Type) {
        if (Type.equals(HDD))
            driveType = HDD;
        else
            driveType = SSD;
    }

    static void setDriveSize(String Type) {
        if (Type.equals(DRIVE_SIZE18))
            driveSize = DRIVE_SIZE18;
        else if (Type.equals(DRIVE_SIZE25))
            driveSize = DRIVE_SIZE25;
        else
            driveSize = DRIVE_SIZE35;
    }

    static void setDriveCapacity(String Type) {
        if (Type.equals(CAPACITY256))
            driveCapacity = CAPACITY256;
        else if (Type.equals(CAPACITY512))
            driveCapacity = CAPACITY512;
        else if (Type.equals(CAPACITY_1TB))
            driveCapacity = CAPACITY_1TB;
        else
            driveCapacity = CAPACITY_2TB;
    }

    String getDriveType() {
        return driveType;
    }

    String getDriveSize() {
        return driveSize;
    }

    String getDriveCapacity() {
        return driveCapacity;
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

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("5. Select Hard Drive");
        System.out.print("Choice? ");

        String select = in.nextLine();
        if (select.equals("5")) {
            HardDrive drive = new HardDrive();
            System.out.println("Set the features of the hard drive");

            System.out.println("Hard Drive Type:");
            System.out.println("1. HDD");
            System.out.println("2. SSD");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setDriveType(HDD);
            else
                setDriveType(SSD);

            System.out.println("Hard Drive size:");
            System.out.println("1. 1.8 inches");
            System.out.println("2. 2.5 inches");
            System.out.println("3. 3.5 inches");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setDriveSize(DRIVE_SIZE18);
            else if (select.equals("2"))
                setDriveSize(DRIVE_SIZE25);
            else
                setDriveSize(DRIVE_SIZE35);

            System.out.println("Hard drive's capacity");
            System.out.println("1. 256 GB");
            System.out.println("2. 512 GB");
            System.out.println("3. 1 TB");
            System.out.println("4. 2 TB");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setDriveCapacity(CAPACITY256);
            else if (select.equals("2"))
                setDriveCapacity(CAPACITY512);
            else if (select.equals("3"))
                setDriveCapacity(CAPACITY_1TB);
            else
                setDriveCapacity(CAPACITY_2TB);

            System.out.println(drive);
        }
    }
}// class HardDrive