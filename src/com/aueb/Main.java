package com.aueb;

import com.aueb.model.*;
import com.aueb.model.components.specificComponents.*;
import com.aueb.model.peripherals.specificPeripherals.Keyboard;
import com.aueb.model.peripherals.specificPeripherals.Monitor;
import com.aueb.model.peripherals.specificPeripherals.Mouse;
import com.aueb.model.peripherals.specificPeripherals.Printer;

import java.time.LocalDate;
import java.util.Scanner;

import static com.aueb.model.Order.DEFAULT_DATE_OF_ORDER;
import static com.aueb.model.components.specificComponents.Cpu.AMD;
import static com.aueb.model.components.specificComponents.Cpu.CRUCIAL;
import static com.aueb.model.components.specificComponents.Cpu.HP;
import static com.aueb.model.components.specificComponents.Cpu.INTEL;
import static com.aueb.model.components.specificComponents.Cpu.LG;
import static com.aueb.model.components.specificComponents.Cpu.LOGITECH;
import static com.aueb.model.components.specificComponents.Cpu.RAZER;
import static com.aueb.model.components.specificComponents.Cpu.SAMSUNG;
import static com.aueb.model.components.specificComponents.Cpu.SEAGATE;
import static com.aueb.model.components.specificComponents.Cpu.VENGEANCE;
import static com.aueb.model.components.specificComponents.Cpu.YEAR_2018;
import static com.aueb.model.components.specificComponents.Cpu.YEAR_2019;
import static com.aueb.model.components.specificComponents.Cpu.YEAR_2020;
import static com.aueb.model.components.specificComponents.Cpu.YEAR_2021;
import static com.aueb.model.components.specificComponents.Cpu.YEAR_2022;
import static com.aueb.model.components.specificComponents.Cpu.*;
import static com.aueb.model.components.specificComponents.GraphicsCard.*;
import static com.aueb.model.components.specificComponents.HardDrive.*;
import static com.aueb.model.components.specificComponents.Motherboard.*;
import static com.aueb.model.components.specificComponents.Ram.*;
import static com.aueb.model.peripherals.specificPeripherals.Monitor.*;
import static com.aueb.model.peripherals.specificPeripherals.Mouse.*;
import static com.aueb.model.peripherals.specificPeripherals.Printer.*;

public class Main {

    // Beginning of the application
    public static final Shop shop = new Shop();

    public static void main(String[] args) {

        // initializing product catalog
        GraphicsCard graphicsCard01 = new GraphicsCard(2019, AMD, 270.0, GraphicsCard.AMD, MEM8);
        Motherboard motherboard01 = new Motherboard(2018, SAMSUNG, 270.0, TYPE_INTEL, MEM32, SATA4);
        Ram ram01 = new Ram(2021, VENGEANCE, 269.0, DDR3, SIZE4, FREQUENCY1600);
        HardDrive hardDrive01 = new HardDrive(2022, SAMSUNG, 278.0, HDD, DRIVE_SIZE18, CAPACITY256);
        Cpu cpu01 = new Cpu(Cpu.NAME, YEAR_2018, INTEL, 600, SPEED28, CORES6, true);

        shop.storeProduct(motherboard01);
        shop.storeProduct(cpu01);
        shop.storeProduct(ram01);
        shop.storeProduct(graphicsCard01);
        shop.storeProduct(hardDrive01);

        // Menu
        // Welcome Screen
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our Shop!!!");
        mainLoop(shop, in);

    }

    private static void mainLoop(Shop shop, Scanner in) {
        boolean endOfProgram = false;

        while (!endOfProgram) {
            System.out.println("Main Menu");
            System.out.println("Please make a choice using [0, 1, 2, or 3]:");
            System.out.println("0. Display Available Products");
            System.out.println("1. Overview of Orders");
            System.out.println("2. Overview of Sales");
            System.out.println("3. Show products in Stock");
            System.out.println("4. Exit program");
            String selectedChoiceOfMenu = in.nextLine();

            System.out.println("Your choice is " + selectedChoiceOfMenu);

            switch (selectedChoiceOfMenu) {
                case "0":
                    overviewOfAllAvailableProducts(in);
                    break;
                case "1":
                    orederOverview(shop);
                    break;
                case "2":
                    salesOverview(shop);
                    break;
                case "3":
                    productsInStock(shop);
                    break;
                case "4":
                    endOfProgram = isEndOfProgram();
                    break;
                default:
                    invalidChoices(4);
            }
        }
    }

    private static void productsInStock(Shop shop) {
        System.out.println("Showing products in Stock");
        System.out.println("Total amount of products in stock: " + shop.totalAmountOfProductsInStock());
        shop.displayUniqueStock();
        System.out.println();
    }

    private static void invalidChoices(int choices) {
        StringBuilder s = new StringBuilder("Your input is invalid. Please select");
        for (int i = 0; i < choices; i++) {
            s.append(" ").append(i);
        }
        s.append(".");
        System.out.println(s);
    }

    private static boolean isEndOfProgram() {
        boolean endOfProgram;
        System.out.println("End of the program!");
        endOfProgram = true;
        return true;
    }

    private static void overviewOfAllAvailableProducts(Scanner in) {
        boolean endOfSelectedMenuChoice = false;

        while (!endOfSelectedMenuChoice) {

            System.out.println("Display Available Products");
            System.out.println("Please select the category:");
            System.out.println("0. Components");
            System.out.println("1. Peripherals");
            System.out.println("2. Back to the previous menu");
            String selectedChoiceOfCategory = in.nextLine();

            switch (selectedChoiceOfCategory) {
                case "0":
                    overviewOfComponents(in);
                    break;
                case "1":
                    overviewOfPeripherals(in);
                    break;
                case "2":
                    endOfSelectedMenuChoice = true;
                    System.out.println("Back to the previous menu");
                    break;
                default:
                    System.out.println("Your input is invalid. Please select either 0, 1, 2 or 3");
            }
        }
    }

    private static void overviewOfComponents(Scanner in) {
        boolean endOfSelectedCategoryChoice = false;
        while (!endOfSelectedCategoryChoice) {

            System.out.println("Selected components");
            System.out.println("Please select the component");
            System.out.println("0. Cpu");
            System.out.println("1. GraphicsCard");
            System.out.println("2. HardDrive");
            System.out.println("3. Motherboard");
            System.out.println("4. Ram");
            System.out.println("5. Back to the previous menu");

            String selectedChoiceOfComponent = in.nextLine();
            switch (selectedChoiceOfComponent) {
                case "0":
                    CpuComponent(in);
                    break;
                case "1":
                    GraphicsCardComponent(in);
                    break;
                case "2":
                    HardDriveComponent(in);
                    break;
                case "3":
                    MotherboardComponent(in);
                    break;
                case "4":
                    RamComponent(in);
                    break;
                case "5":
                    System.out.println("Back to the previous menu");
                    endOfSelectedCategoryChoice = true;
                    break;
                default:
                    System.out.println("Your input is invalid. Please select either 0, 1, 2, 3, 4 or 5");
            }
        }
    }

    private static void RamComponent(Scanner in) {
        String modelNameChoice = Ram.NAME;
        int yearChoice = yearChoice(in);
        String manufacturerChoice = ramManufacturerChoice(in);

        String ramTypeChoice = ramTypeChoice(in);
        String ramSizeChoice = ramSizeChoice(in);
        String ramFrequencyChoice = ramFrequencyChoice(in);


        Ram ram = new Ram(modelNameChoice, yearChoice, manufacturerChoice, 100, ramTypeChoice, ramSizeChoice, ramFrequencyChoice);
        ram.setModelPriceToRandom();

        sellOrOrder(in, ram);
    }

    private static String ramManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the ram Manufacturer:");
            System.out.println("0. " + VENGEANCE);
            System.out.println("1. " + CRUCIAL);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return VENGEANCE;
                case "1":
                    return CRUCIAL;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String ramFrequencyChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the ram Frequency:");
            System.out.println("0. " + FREQUENCY1600);
            System.out.println("1. " + FREQUENCY2666);
            System.out.println("1. " + FREQUENCY3200);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return FREQUENCY1600;
                case "1":
                    return FREQUENCY2666;
                case "2":
                    return FREQUENCY3200;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String ramSizeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the ram size:");
            System.out.println("0. " + SIZE4);
            System.out.println("1. " + SIZE8);
            System.out.println("1. " + SIZE16);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return SIZE4;
                case "1":
                    return SIZE8;
                case "2":
                    return SIZE16;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String ramTypeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the ram Type:");
            System.out.println("0. " + DDR3);
            System.out.println("1. " + DDR4);
            System.out.println("1. " + DDR5);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return DDR3;
                case "1":
                    return DDR4;
                case "2":
                    return DDR5;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static void MotherboardComponent(Scanner in) {
        String modelNameChoice = Motherboard.NAME;
        int yearChoice = yearChoice(in);
        String manufacturerChoice = hardDriveManufacturerChoice(in);

        String processorTypeChoice = processorTypeChoice(in);
        String memoryTypeChoice = memoryTypeChoice(in);
        String numOfPortsSataTypeChoice = numOfPortsSataTypeChoice(in);

        Motherboard motherboard = new Motherboard(modelNameChoice, yearChoice, manufacturerChoice, 100, processorTypeChoice, memoryTypeChoice, numOfPortsSataTypeChoice);
        motherboard.setModelPriceToRandom();

        sellOrOrder(in, motherboard);
    }

    private static String numOfPortsSataTypeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the num Of Ports Sata Type:");
            System.out.println("0. " + SATA4);
            System.out.println("1. " + SATA6);
            System.out.println("1. " + SATA8);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return SATA4;
                case "1":
                    return SATA6;
                case "2":
                    return SATA8;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String memoryTypeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the memory Type:");
            System.out.println("0. " + MEM32);
            System.out.println("1. " + MEM64);
            System.out.println("1. " + MEM128);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return MEM32;
                case "1":
                    return MEM64;
                case "2":
                    return MEM128;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String processorTypeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the processor Type:");
            System.out.println("0. " + TYPE_INTEL);
            System.out.println("1. " + TYPE_AMD);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return TYPE_INTEL;
                case "1":
                    return TYPE_AMD;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static void HardDriveComponent(Scanner in) {
        String modelNameChoice = HardDrive.NAME;
        int yearChoice = yearChoice(in);
        String manufacturerChoice = hardDriveManufacturerChoice(in);

        String driveTypeChoice = driveTypeChoice(in);
        String driveSizeChoice = driveSizeChoice(in);
        String driveCapacityChoice = driveCapacityChoice(in);


        HardDrive hardDrive = new HardDrive(modelNameChoice, yearChoice, manufacturerChoice, 100, driveTypeChoice, driveSizeChoice, driveCapacityChoice);
        hardDrive.setModelPriceToRandom();

        sellOrOrder(in, hardDrive);
    }

    private static String hardDriveManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the hardDrive Manufacturer:");
            System.out.println("0. " + SAMSUNG);
            System.out.println("1. " + SEAGATE);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return SAMSUNG;
                case "1":
                    return SEAGATE;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String driveCapacityChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the drive Capacity:");
            System.out.println("0. " + CAPACITY256);
            System.out.println("1. " + CAPACITY512);
            System.out.println("2. " + CAPACITY_1TB);
            System.out.println("3. " + CAPACITY_2TB);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return CAPACITY256;
                case "1":
                    return CAPACITY512;
                case "2":
                    return CAPACITY_1TB;
                case "3":
                    return CAPACITY_2TB;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String driveSizeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the drive Size:");
            System.out.println("0. " + DRIVE_SIZE18);
            System.out.println("1. " + DRIVE_SIZE25);
            System.out.println("2. " + DRIVE_SIZE35);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return DRIVE_SIZE18;
                case "1":
                    return DRIVE_SIZE25;
                case "2":
                    return DRIVE_SIZE35;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String driveTypeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the drive Type:");
            System.out.println("0. " + HDD);
            System.out.println("1. " + SSD);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return HDD;
                case "1":
                    return SSD;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static void CpuComponent(Scanner in) {

        String modelNameChoice = Cpu.NAME;
        int yearChoice = yearChoice(in);
        String manufacturerChoice = cpuManufacturerChoice(in);

        String cpuSpeedChoice = cpuSpeedChoice(in);
        String cpuNumberOfCoresChoice = cpuNumberOfCoresChoice(in);
        boolean cpuGraphicsChoice = cpuGraphicsChoice(in);

        Cpu cpu = new Cpu(modelNameChoice, yearChoice, manufacturerChoice, 100, cpuSpeedChoice, cpuNumberOfCoresChoice, cpuGraphicsChoice);
        cpu.setModelPriceToRandom();

        sellOrOrder(in, cpu);

    }

    private static void GraphicsCardComponent(Scanner in) {

        String modelNameChoice = GraphicsCard.NAME;
        int yearChoice = yearChoice(in);
        String manufacturerChoice = cpuManufacturerChoice(in);

        String chipsetChoice = chipsetChoice(in);
        String cardMemoryChoice = cardMemoryChoice(in);

        GraphicsCard graphicsCard = new GraphicsCard(modelNameChoice, yearChoice, manufacturerChoice, 100, chipsetChoice, cardMemoryChoice);
        graphicsCard.setModelPriceToRandom();

        sellOrOrder(in, graphicsCard);

    }

    private static String cardMemoryChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the Memory:");
            System.out.println("0. " + MEM6);
            System.out.println("1. " + MEM8);
            System.out.println("2. " + MEM12);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return MEM6;
                case "1":
                    return MEM8;
                case "2":
                    return MEM12;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String chipsetChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the chipset:");
            System.out.println("0. " + NVIDIA);
            System.out.println("1. " + AMD);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return NVIDIA;
                case "1":
                    return AMD;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static void sellOrOrder(Scanner in, Product product) {
        Product p = shop.findMatchingAvailableProduct(product);

        if (p == null) {
            boolean orderProductChoice = orderProductChoice(in);
            if (orderProductChoice) {
                orderingProduct(in, product);
            }
        } else {
            boolean sellProductChoice = sellProductChoice(in);
            if (sellProductChoice) {
                sellingProduct(in, p);
            }
        }
    }

    private static void sellingProduct(Scanner in, Product product) {
        Customer customer = askCustomerInfo(in);
        double finalPrice = calulateFinalPrice(product);

        Sale sale = new Sale(product, customer, finalPrice);

        shop.addSale(sale);
        shop.removeTheProductFromStock(product);
        System.out.println("Congratulations! You have bought the product!");
    }

    private static void orderingProduct(Scanner in, Product product) {
        Customer customer = askCustomerInfo(in);
        LocalDate dateOfArrival = askArrivalDate(in);
        double finalPrice = calulateFinalPrice(product);

        Order order = new Order(product, customer, dateOfArrival, finalPrice);
        shop.addOrder(order);
        System.out.println("Congratulations! You have ordered the product!");
    }

    private static double calulateFinalPrice(Product product) {
        System.out.println("Price before discount: " + product.getModelPrice());
        System.out.println("Discount: " + product.getDiscount());
        System.out.println("Final Price: " + product.finalPrice());
        return product.finalPrice();
    }

    private static LocalDate askArrivalDate(Scanner in) {
        while (true) {
            System.out.println("Please input the date of the arrival:");
            System.out.println("Year:");
            int year = Integer.parseInt(in.nextLine());
            System.out.println("Month:");
            int month = Integer.parseInt(in.nextLine());
            System.out.println("Day:");
            int day = Integer.parseInt(in.nextLine());

            LocalDate selectedDate = DEFAULT_DATE_OF_ORDER;
            try {
                selectedDate = LocalDate.of(year, month, day);
            } catch (Exception e) {
            }

            if (selectedDate.isAfter(DEFAULT_DATE_OF_ORDER)) {
                return selectedDate;
            } else {
                System.out.println("Invalid date. Must be after 11-05-2022. Please select another day!");
            }

        }
    }

    private static Customer askCustomerInfo(Scanner in) {
        System.out.println("Please input your Name");
        String customersName = in.nextLine();
        System.out.println("Please input your phone number");
        String customersPhone = in.nextLine();

        Customer customer = new Customer(customersName, customersPhone);
        System.out.println("The customer infos:\n" + customer);
        return customer;

    }

    private static boolean orderProductChoice(Scanner in) {
        while (true) {
            System.out.println("Do you wish to order this product");
            System.out.println("0. yes");
            System.out.println("1. no");

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return true;
                case "1":
                    return false;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static boolean sellProductChoice(Scanner in) {
        while (true) {
            System.out.println("Do you wish this product to be sold");
            System.out.println("0. yes");
            System.out.println("1. no");

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return true;
                case "1":
                    return false;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String cpuManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the manufacturer:");
            System.out.println("0. " + INTEL);
            System.out.println("1. " + AMD);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return INTEL;
                case "1":
                    return AMD;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }

    }

    private static int yearChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the year:");
            System.out.println("0. 2018");
            System.out.println("1. 2019");
            System.out.println("2. 2020");
            System.out.println("3. 2021");
            System.out.println("4. 2022");

            String selectedChoiceOfYear = in.nextLine();
            switch (selectedChoiceOfYear) {
                case "0":
                    return YEAR_2018;
                case "1":
                    return YEAR_2019;
                case "2":
                    return YEAR_2020;
                case "3":
                    return YEAR_2021;
                case "4":
                    return YEAR_2022;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1 2 3 4");
            }

        }

    }

    private static boolean cpuGraphicsChoice(Scanner in) {
        while (true) {
            System.out.println("Please select yes or no for Cpu Graphics:");
            System.out.println("0. yes");
            System.out.println("1. no");
            String selectedChoiceOfCpuGraphics = in.nextLine();
            switch (selectedChoiceOfCpuGraphics) {
                case "0":
                    return true;
                case "1":
                    return false;
                default:
                    System.out.println("Your input is invalid. Please select either 0 or 1");

            }
        }
    }

    private static String cpuNumberOfCoresChoice(Scanner in) {
        while (true) {
            System.out.println("Please select CPU number of cores:");
            System.out.println("0. " + CORES6);
            System.out.println("1. " + CORES8);
            System.out.println("2. " + CORES16);
            String selectedChoiceOfNbOfCores = in.nextLine();
            switch (selectedChoiceOfNbOfCores) {
                case "0":
                    System.out.println("You've selected " + CORES6);
                    return CORES6;
                case "1":
                    System.out.println("You've selected " + CORES8);
                    return CORES8;
                case "2":
                    System.out.println("You've selected " + CORES16);
                    return CORES16;
                default:
                    System.out.println("Your input is invalid. Please select either 0, 1, 2");
            }
        }
    }

    private static String cpuSpeedChoice(Scanner in) {
        while (true) {

            System.out.println("Selected Cpu");
            System.out.println("Please select CPU speed:");
            System.out.println("0. " + SPEED28);
            System.out.println("1. " + SPEED33);
            System.out.println("2. " + SPEED41);


            String selectedChoiceOfCpuSpeed = in.nextLine();
            switch (selectedChoiceOfCpuSpeed) {
                case "0":
                    System.out.println("You've selected " + SPEED28);
                    return SPEED28;
                case "1":
                    System.out.println("You've selected " + SPEED33);
                    return SPEED33;
                case "2":
                    System.out.println("You've selected " + SPEED41);
                    return SPEED41;
                default:
                    System.out.println("Your input is invalid. Please select either 0, 1, 2");

            }
        }
    }

    private static void overviewOfPeripherals(Scanner in) {
        boolean endOfSelectedCategoryChoice = false;
        while (!endOfSelectedCategoryChoice) {
            System.out.println("Selected Peripherals");
            System.out.println("Please select the Peripheral");
            System.out.println("0. Keyboard");
            System.out.println("1. Monitor");
            System.out.println("2. Mouse");
            System.out.println("3. Printer");
            System.out.println("4. Back to the previous menu");

            String selectedChoiceOfPeripheral = in.nextLine();
            switch (selectedChoiceOfPeripheral) {
                case "0":
                    KeyboardPeripheral(in);
                    break;
                case "1":
                    MonitorPeripheral(in);
                    break;
                case "2":
                    MousePeripheral(in);
                    break;
                case "3":
                    PrinterPeripheral(in);
                    break;
                case "4":
                    endOfSelectedCategoryChoice = true;
                    System.out.println("End of the program!");
                    break;
                default:
                    System.out.println("Your input is invalid. Please select either 0, 1, 2, 3 or 4");

            }
        }
    }

    private static void PrinterPeripheral(Scanner in) {
        String modelNameChoice = Printer.NAME;
        int yearChoice = yearChoice(in);
        String manufacturerChoice = printerManufacturerChoice(in);

        String printerTechChoice = printerTechChoice(in);
        String printTypeChoice = printTypeChoice(in);

        Printer printer = new Printer(modelNameChoice, yearChoice, manufacturerChoice, 100, printerTechChoice, printTypeChoice);
        printer.setModelPriceToRandom();

        sellOrOrder(in, printer);

    }

    private static String printTypeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the printer type:");
            System.out.println("0. " + COLORED);
            System.out.println("1. " + BLACK_WHITE);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return COLORED;
                case "1":
                    return BLACK_WHITE;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String printerTechChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the printer Tech:");
            System.out.println("0. " + LASER);
            System.out.println("1. " + INKJET);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return LASER;
                case "1":
                    return INKJET;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String printerManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the printer Manufacturer:");
            System.out.println("0. " + HP);
            System.out.println("1. " + SAMSUNG);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return HP;
                case "1":
                    return SAMSUNG;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static void MousePeripheral(Scanner in) {
        String modelNameChoice = Mouse.NAME;
        int yearChoice = yearChoice(in);
        String manufacturerChoice = mouseManufacturerChoice(in);

        String mouseTechChoice = mouseTechChoice(in);
        String mouseConnectChoice = mouseConnectChoice(in);

        Mouse mouse = new Mouse(modelNameChoice, yearChoice, manufacturerChoice, 100, mouseTechChoice, mouseConnectChoice);
        mouse.setModelPriceToRandom();

        sellOrOrder(in, mouse);

    }

    private static String mouseConnectChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the mouse Connection:");
            System.out.println("0. " + WIRED);
            System.out.println("1. " + WIRELESS);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return WIRED;
                case "1":
                    return WIRELESS;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String mouseTechChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the mouse Tech:");
            System.out.println("0. " + LASER);
            System.out.println("1. " + OPTICAL);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return LASER;
                case "1":
                    return OPTICAL;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String mouseManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the mouse Manufacturer:");
            System.out.println("0. " + LOGITECH);
            System.out.println("1. " + SAMSUNG);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return LOGITECH;
                case "1":
                    return SAMSUNG;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static void MonitorPeripheral(Scanner in) {
        String modelNameChoice = Monitor.NAME;
        int yearChoice = yearChoice(in);
        String manufacturerChoice = monitorManufacturerChoice(in);

        String monitorTypeChoice = monitorTypeChoice(in);
        String monitorDimensionsChoice = monitorDimensionsChoice(in);
        String monitorResolutionChoice = monitorResolutionChoice(in);
        String monitorPortChoice = monitorPortChoice(in);

        Monitor monitor = new Monitor(modelNameChoice, yearChoice, manufacturerChoice, 100, monitorTypeChoice, monitorDimensionsChoice, monitorResolutionChoice, monitorPortChoice);
        monitor.setModelPriceToRandom();

        sellOrOrder(in, monitor);

    }

    private static String monitorPortChoice(Scanner in) {
        while (true) {
            System.out.println("Please select monitor Port:");
            System.out.println("0. " + PORT1);
            System.out.println("1. " + PORT2);
            System.out.println("2. " + PORT3);
            String selectedChoiceOfNbOfCores = in.nextLine();
            switch (selectedChoiceOfNbOfCores) {
                case "0":
                    System.out.println("You've selected " + PORT1);
                    return PORT1;
                case "1":
                    System.out.println("You've selected " + PORT2);
                    return PORT2;
                case "2":
                    System.out.println("You've selected " + PORT3);
                    return PORT3;
                default:
                    System.out.println("Your input is invalid. Please select either 0, 1, 2");
            }
        }
    }

    private static String monitorResolutionChoice(Scanner in) {
        while (true) {
            System.out.println("Please select monitor Resolution:");
            System.out.println("0. " + RESOLUTION1);
            System.out.println("1. " + RESOLUTION2);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return RESOLUTION1;
                case "1":
                    return RESOLUTION2;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String monitorDimensionsChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the monitor Dimensions :");
            System.out.println("0. " + DIMENSION17);
            System.out.println("1. " + DIMENSION24);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return DIMENSION17;
                case "1":
                    return DIMENSION24;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String monitorTypeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the monitor Type:");
            System.out.println("0. " + MONITOR);
            System.out.println("1. " + PORTABLE_MONITOR);
            System.out.println("2. " + TV_MONITOR);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return MONITOR;
                case "1":
                    return PORTABLE_MONITOR;
                case "2":
                    return TV_MONITOR;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String monitorManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the monitor Manufacturer:");
            System.out.println("0. " + SAMSUNG);
            System.out.println("1. " + LG);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return SAMSUNG;
                case "1":
                    return LG;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static void KeyboardPeripheral(Scanner in) {
        String modelNameChoice = Keyboard.NAME;
        int yearChoice = yearChoice(in);
        String manufacturerChoice = keyboardManufacturerChoice(in);

        String keyboardConnectChoice = keyboardConnectChoice(in);

        Keyboard keyboard = new Keyboard(modelNameChoice, yearChoice, manufacturerChoice, 100, keyboardConnectChoice);
        keyboard.setModelPriceToRandom();

        sellOrOrder(in, keyboard);

    }

    private static String keyboardConnectChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the keyboard Connection:");
            System.out.println("0. " + WIRED);
            System.out.println("1. " + WIRELESS);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return WIRED;
                case "1":
                    return WIRELESS;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String keyboardManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the keyboard Connection:");
            System.out.println("0. " + LOGITECH);
            System.out.println("1. " + RAZER);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return LOGITECH;
                case "1":
                    return RAZER;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }


    private static void salesOverview(Shop shop) {
        System.out.println("Overview of Sales");
        System.out.println("Total amount of sales is: " + shop.totalAmountOfSales());
        System.out.println(shop.displaySales().replaceFirst("\\[", "").replaceAll("]", ""));
        System.out.println();
    }

    private static void orederOverview(Shop shop) {
        System.out.println("Overview of Orders");
        System.out.println("Total amount of orders is: " + shop.totalAmountOfOrders());
        System.out.println(shop.displayOrders()
                .replaceFirst("\\[", "")
                .replaceAll("]", "")
                .replaceAll(", \n", "\n"));
        System.out.println();
    }
}
