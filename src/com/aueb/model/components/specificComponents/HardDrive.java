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
        setDriveType("");
        setDriveSize("");
        setDriveCapacity("");
        numOfHardDrives++;
    }

    static void setDriveType(String Type) {
        if (Type.equals("1"))
            driveType = HDD;
        else
            driveType = SSD;
    }

    String getDriveType() {
        return driveType;
    }

    static void setDriveSize(String Type) {
        if (Type.equals("1"))
            driveSize = DRIVE_SIZE18;
        else if (Type.equals("2"))
            driveSize = DRIVE_SIZE25;
        else
            driveSize = DRIVE_SIZE35;
    }

    String getDriveSize() {
        return driveSize;
    }

    static void setDriveCapacity(String Type) {
        if (Type.equals("1"))
            driveCapacity = CAPACITY256;
        else if (Type.equals("2"))
            driveCapacity = CAPACITY512;
        else if (Type.equals("3"))
            driveCapacity = CAPACITY_1TB;
        else
            driveCapacity = CAPACITY_2TB;
    }

    String getDriveCapacity() {
        return driveCapacity;
    }

    public String toString() {
        return "\nHard drive features:\n"
                + "Hard drive type: " + getDriveType() + "\n"
                + "Hard drive size: " + getDriveSize() + " inches\n"
                + "Hard drive capacity: " + getDriveCapacity() + "\n";
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
                setDriveType("1");
            else
                setDriveType("2");

            System.out.println("Hard Drive size:");
            System.out.println("1. 1.8 inches");
            System.out.println("2. 2.5 inches");
            System.out.println("3. 3.5 inches");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setDriveSize("1");
            else if (select.equals("2"))
                setDriveSize("2");
            else
                setDriveSize("3");

            System.out.println("Hard drive's capacity");
            System.out.println("1. 256 GB");
            System.out.println("2. 512 GB");
            System.out.println("3. 1 TB");
            System.out.println("4. 2 TB");
            System.out.print("Choice? ");
            select = in.nextLine();
            if (select.equals("1"))
                setDriveCapacity("1");
            else if (select.equals("2"))
                setDriveCapacity("2");
            else if (select.equals("3"))
                setDriveCapacity("3");
            else
                setDriveCapacity("4");

            System.out.println(drive);
        }
    }
}// class HardDrive