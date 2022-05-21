package com.aueb;

import com.aueb.model.Shop;
import com.aueb.model.components.specificComponents.*;
import com.aueb.model.peripherals.specificPeripherals.Keyboard;
import com.aueb.model.peripherals.specificPeripherals.Monitor;
import com.aueb.model.peripherals.specificPeripherals.Mouse;
import com.aueb.model.peripherals.specificPeripherals.Printer;

import java.util.Scanner;
public class Main {

    // Beginning of the application
    public static void main(String[] args) {
        // initializing product catalog
        Shop shop = new Shop();
        Motherboard motherboard = new Motherboard("", 0, "", 0.0, "TYPE_INTEL", "32", "6");
        Cpu cpu = new Cpu("", 0, "", 0.0, "2.8", "8", true);
        Ram ram = new Ram("", 0, "", 0.0, "DDR3", "8", "2666");
        Printer printer = new Printer("", 0, "", 0.0, "Laser", "Colored");
        Mouse mouse = new Mouse("", 0, "", 0.0, "Laser", "Wired");
        Monitor monitor = new Monitor("", 0, "", 0.0, "Portable Monitor", "17", "1920 x 1080", "Display Port");
        Keyboard keyboard = new Keyboard("", 0, "", 0.0, "Wired");
        HardDrive drive = new HardDrive("", 0, "", 0.0, "HDD", "1.8", "256 GB");
        GraphicsCard card = new GraphicsCard("", 0, "", 0.0, "nVIDIA", "AMD");

        // initializing sales catalogue
        // initializing order catalogue

        // Menu
        // Welcome Screen

        boolean done = false;

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to our Shop!!!");
        while (!done) {
            System.out.println("How can we assist you? Do you want to view our catalogue?");
            System.out.println("1. Yes");
            System.out.println("2. Exit");
            System.out.print("Choice? ");
            String select = in.nextLine();
            System.out.println();

            if (select.equals("1")) {
                System.out.println("Please choose one of the products");
                System.out.println("1. Motherboard");
                System.out.println("2. Cpu");
                System.out.println("3. Ram");
                System.out.println("4. GraphicsCard");
                System.out.println("5. Hard Drive");
                System.out.println("6. Monitor");
                System.out.println("7. Keyboard");
                System.out.println("8. Mouse");
                System.out.println("9. Printer");
                System.out.print("Choice? ");
                select = in.nextLine();
                System.out.println();

                // Selection of Motherboard type
                if (select.equals("1")) {
                    Motherboard mother = new Motherboard();
                    System.out.println("Set the features of the motherboard");

                    System.out.println("Processor features:");
                    System.out.println("1. Intel's processor");
                    System.out.println("2. AMD's processor");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        Motherboard.setProcessorType("TYPE_INTEL");
                    else
                        Motherboard.setProcessorType("TYPE_AMD");

                    System.out.println("Memory features:");
                    System.out.println("1. 32 GB memory");
                    System.out.println("2. 64 GB memory");
                    System.out.println("3. 128 GB memory");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        Motherboard.setMemoryType("32");
                    else if (select.equals("2"))
                        Motherboard.setMemoryType("64");
                    else
                        Motherboard.setMemoryType("128");

                    System.out.println("Number of sata ports:");
                    System.out.println("1. SATA ports 4");
                    System.out.println("2. SATA ports 6");
                    System.out.println("3. SATA ports 8");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();
                    if (select.equals("1"))
                        Motherboard.setNumOfPortsSataType("4");
                    else if (select.equals("2"))
                        Motherboard.setNumOfPortsSataType("6");
                    else
                        Motherboard.setNumOfPortsSataType("8");

                    System.out.println(mother);
                }

                // Selection of Cpu type
                if (select.equals("2")) {
                    Cpu cp = new Cpu();
                    System.out.println("Set the features of the cpu");

                    System.out.println("cpu's speed:");
                    System.out.println("1. for 2.8 GHz");
                    System.out.println("2. for 3.3 GHz");
                    System.out.println("3. for 4.1 GHz");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();
                    if (select.equals("1"))
                        Cpu.setCpuSpeed("2.8");
                    else if (select.equals("2"))
                        Cpu.setCpuSpeed("3.3");
                    else
                        Cpu.setCpuSpeed("4.1");

                    System.out.println("Number of Cores:");
                    System.out.println("1. Cores 6");
                    System.out.println("2. Cores 8");
                    System.out.println("3. Cores 16");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();
                    if (select.equals("1"))
                        Cpu.setNumOfCores("6");
                    else if (select.equals("2"))
                        Cpu.setNumOfCores("8");
                    else
                        Cpu.setNumOfCores("16");

                    System.out.println("With built-in graphics or not?");
                    System.out.println("1. With built-in graphics");
                    System.out.println("2. Without built-in graphics");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();
                    if (select.equals("1"))
                        cpu.setCpuGraphics(true);
                    else
                        cpu.setCpuGraphics(false);

                    System.out.println(cp);
                }


                // Selection of Ram type
                if (select.equals("3")) {
                    Ram r = new Ram();
                    System.out.println("Set the features of the RAM");

                    System.out.println("Ram Type:");
                    System.out.println("1. DDR3");
                    System.out.println("2. DDR4");
                    System.out.println("3. DDR5");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();
                    if (select.equals("1"))
                        Ram.setRamType("DDR3");
                    else if (select.equals("2"))
                        Ram.setRamType("DDR4");
                    else
                        Ram.setRamType("DDR5");

                    System.out.println("RAM size:");
                    System.out.println("1. 4 GB");
                    System.out.println("2. 8 GB");
                    System.out.println("3. 16 GB");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();
                    if (select.equals("1"))
                        Ram.setRamSize("4");
                    else if (select.equals("2"))
                        Ram.setRamSize("8");
                    else
                        Ram.setRamSize("6");

                    System.out.println("Frequency of RAM");
                    System.out.println("1. 1600 MHz");
                    System.out.println("2. 2666 MHz");
                    System.out.println("3. 3200 MHz");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();
                    if (select.equals("1"))
                        Ram.setRamFrequency("1600");
                    else if (select.equals("2"))
                        Ram.setRamFrequency("666");
                    else
                        Ram.setRamFrequency("3200");

                    System.out.println(r);
                }

                // Selection of GraphicsCard type
                if (select.equals("4")) {
                    GraphicsCard c = new GraphicsCard();
                    System.out.println("Set the features of the Graphics card");

                    System.out.println("Graphics card chipset:");
                    System.out.println("1. nVIDIA");
                    System.out.println("2. AMD");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();
                    if (select.equals("1"))
                        GraphicsCard.setChipset("nVIDIA");
                    else
                        GraphicsCard.setChipset("AMD");

                    System.out.println("Card Memory:");
                    System.out.println("1. 6 GB");
                    System.out.println("2. 8 GB");
                    System.out.println("3. 12 GB");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        GraphicsCard.setCardMemory("6");
                    else if (select.equals("2"))
                        GraphicsCard.setCardMemory("8");
                    else
                        GraphicsCard.setCardMemory("12");

                    System.out.println(c);
                }

                // Selection of HardDrive type
                if (select.equals("5")) {
                    HardDrive dr = new HardDrive();
                    System.out.println("Set the features of the hard drive");

                    System.out.println("Hard Drive Type:");
                    System.out.println("1. HDD");
                    System.out.println("2. SSD");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        HardDrive.setDriveType("HDD");
                    else
                        HardDrive.setDriveType("SSD");

                    System.out.println("Hard Drive size:");
                    System.out.println("1. 1.8 inches");
                    System.out.println("2. 2.5 inches");
                    System.out.println("3. 3.5 inches");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        HardDrive.setDriveSize("1.8");
                    else if (select.equals("2"))
                        HardDrive.setDriveSize("2.5");
                    else
                        HardDrive.setDriveSize("3.5");

                    System.out.println("Hard drive's capacity");
                    System.out.println("1. 256 GB");
                    System.out.println("2. 512 GB");
                    System.out.println("3. 1 TB");
                    System.out.println("4. 2 TB");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        HardDrive.setDriveCapacity("256 GB");
                    else if (select.equals("2"))
                        HardDrive.setDriveCapacity("512 GB");
                    else if (select.equals("3"))
                        HardDrive.setDriveCapacity("1 TB");
                    else
                        HardDrive.setDriveCapacity("2 TB");

                    System.out.println(dr);
                }

                // Selection of Monitor type
                if (select.equals("6")) {
                    Monitor mon = new Monitor();
                    System.out.println("Set the features of the Monitor");

                    System.out.println("Monitor Type:");
                    System.out.println("1. Monitor");
                    System.out.println("2. Portable Monitor");
                    System.out.println("3. TV Monitor");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        Monitor.setMonitorType("Monitor");
                    else if (select.equals("2"))
                        Monitor.setMonitorType("Portable Monitor");
                    else
                        Monitor.setMonitorType("TV Monitor");

                    System.out.println("Monitor Dimensions:");
                    System.out.println("1. 17 inches");
                    System.out.println("2. 24 inches");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        Monitor.setMonitorDimensions("17");
                    else
                        Monitor.setMonitorDimensions("24");

                    System.out.println("Monitor Resolution:");
                    System.out.println("1. 1920 X 1080");
                    System.out.println("2. 2048 X 1152");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        Monitor.setMonitorResolution("1920 x 1080");
                    else
                        Monitor.setMonitorResolution("2048 x 1152");

                    System.out.println("Monitor Port:");
                    System.out.println("1. Display Port");
                    System.out.println("2. HDMI");
                    System.out.println("3. USB-C");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        Monitor.setMonitorPort("Display Port");
                    else if (select.equals("2"))
                        Monitor.setMonitorPort("HDMI");
                    else
                        Monitor.setMonitorPort("USB-C");

                    System.out.println(mon);
                }

                // Selection of Keyboard type
                if (select.equals("7")) {
                    Keyboard keyb = new Keyboard();
                    System.out.println("Set the features of the keyboard");

                    System.out.println("Keyboard connection:");
                    System.out.println("1. Wired");
                    System.out.println("2. Wireless");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        Keyboard.setKeyboardConnect("Wired");
                    else
                        Keyboard.setKeyboardConnect("Wireless");

                    System.out.println(keyb);
                }

                // Selection of Mouse type
                if (select.equals("8")) {
                    Mouse mous = new Mouse();
                    System.out.println("Set the features of the mouse");

                    System.out.println("Mouse technology:");
                    System.out.println("1. Laser");
                    System.out.println("2. Optical");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        Mouse.setMouseTech("Laser");
                    else
                        Mouse.setMouseTech("Optical");

                    System.out.println("Mouse connection:");
                    System.out.println("1. Wired");
                    System.out.println("2. Wireless");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        Mouse.setMouseConnect("Wired");
                    else
                        Mouse.setMouseConnect("Wireless");

                    System.out.println(mous);
                }

                // Selection of Print type
                if (select.equals("9")) {
                    Printer print = new Printer();
                    System.out.println("Set the features of the printer");

                    System.out.println("Printer technology:");
                    System.out.println("1. Laser");
                    System.out.println("2. Inkjet");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        Printer.setPrinterTech("Laser");
                    else
                        Printer.setPrinterTech("Inkjet");

                    System.out.println("Print's Type:");
                    System.out.println("1. Colored");
                    System.out.println("2. Black and White");
                    System.out.print("Choice? ");
                    select = in.nextLine();
                    System.out.println();

                    if (select.equals("1"))
                        Printer.setPrintType("Colored");
                    else
                        Printer.setPrintType("Black and White");

                    System.out.println(print);
                }
            } else
                done = true;
        }
    }
}
