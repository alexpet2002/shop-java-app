/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/

import java.time.LocalDate;
import java.util.Scanner;

public class mainApp {

    // Beginning of the application
    public static final Shop shop = new Shop();

    public static void main(String[] args) {

        // initializing product catalog
        //Component products
//        GraphicsCard graphicsCard01 = new GraphicsCard(GraphicsCard.NAME,Product.YEAR_2019, Product.AMD, 270.0, GraphicsCard.AMD, GraphicsCard.MEM8);
//        GraphicsCard graphicsCard02 = new GraphicsCard(GraphicsCard.NAME, Product.YEAR_2019, Product.AMD, 270.0, GraphicsCard.AMD, GraphicsCard.MEM8);
//
//        Motherboard motherboard01 = new Motherboard(Motherboard.NAME,Product.YEAR_2018, Product.SAMSUNG, 270.0, Motherboard.TYPE_INTEL, Motherboard.MEM32, Motherboard.SATA4);
//        Motherboard motherboard02 = new Motherboard(Motherboard.NAME,Product.YEAR_2022, Product.SEAGATE, 274.0, Motherboard.TYPE_AMD, Motherboard.MEM64, Motherboard.SATA8);
//
//        Ram ram01 = new Ram(Ram.NAME, Product.YEAR_2021, Product.VENGEANCE, 269.0, Ram.DDR3, Ram.SIZE4, Ram.FREQUENCY1600);
//        Ram ram02 = new Ram(Ram.NAME, Product.YEAR_2021, Product.CRUCIAL, 272.0, Ram.DDR5, Ram.SIZE4, Ram.FREQUENCY1600);
//
//        HardDrive hardDrive01 = new HardDrive(HardDrive.NAME, Product.YEAR_2022, Product.SAMSUNG, 278.0, HardDrive.HDD, HardDrive.DRIVE_SIZE18, HardDrive.CAPACITY256);
//        HardDrive hardDrive02 = new HardDrive(HardDrive.NAME, Product.YEAR_2021, Product.SAMSUNG, 278.0, HardDrive.HDD, HardDrive.DRIVE_SIZE18, HardDrive.CAPACITY_2TB);
//
//        Cpu cpu01 = new Cpu(Cpu.NAME, Product.YEAR_2018, Product.INTEL, 600, Cpu.SPEED28, Cpu.CORES6, true);
//        Cpu cpu02 = new Cpu(Cpu.NAME, Product.YEAR_2018, Product.AMD, 268.0, Cpu.SPEED33, Cpu.CORES16, true);
//        //Peripheral products
//        Keyboard keyboard01 = new Keyboard(Keyboard.NAME, Product.YEAR_2021, Product.RAZER, 255.0, Keyboard.WIRED);
//        Keyboard keyboard02 = new Keyboard(Keyboard.NAME, Product.YEAR_2021, Product.RAZER, 254.0, Keyboard.WIRELESS);
//
//        Monitor monitor01 = new Monitor(Monitor.NAME, Product.YEAR_2018, Product.SAMSUNG, 292.0, Monitor.MONITOR, Monitor.DIMENSION17, Monitor.RESOLUTION2, Monitor.PORT2);
//        Monitor monitor02 = new Monitor(Monitor.NAME, Product.YEAR_2018, Product.SAMSUNG, 292.0, Monitor.MONITOR, Monitor.DIMENSION17, Monitor.RESOLUTION2, Monitor.PORT2);
//
//        Mouse mouse01 = new Mouse(Mouse.NAME,Product.YEAR_2019, Mouse.SAMSUNG, 262.0, Mouse.OPTICAL, Mouse.WIRELESS);
//        Mouse mouse02 = new Mouse(Mouse.NAME,Product.YEAR_2022, Mouse.LOGITECH, 256.0, Mouse.OPTICAL, Mouse.WIRELESS);
//
//        Printer printer01 = new Printer(Printer.NAME, Product.YEAR_2018, Printer.HP, 261.0, Printer.LASER, Printer.COLORED);
//        Printer printer02 = new Printer(Printer.NAME, Product.YEAR_2021, Printer.HP, 255.0, Printer.LASER, Printer.BLACK_WHITE);
//
//        //Adding products to the store
//        shop.storeProduct(motherboard01);
//        shop.storeProduct(motherboard02);
//        shop.storeProduct(cpu01);
//        shop.storeProduct(cpu02);
//        shop.storeProduct(ram01);
//        shop.storeProduct(ram02);
//        shop.storeProduct(graphicsCard01);
//        shop.storeProduct(graphicsCard02);
//        shop.storeProduct(hardDrive01);
//        shop.storeProduct(hardDrive02);
//        shop.storeProduct(keyboard01);
//        shop.storeProduct(keyboard02);
//        shop.storeProduct(monitor01);
//        shop.storeProduct(monitor02);
//        shop.storeProduct(mouse01);
//        shop.storeProduct(mouse02);
//        shop.storeProduct(printer01);
//        shop.storeProduct(printer02);

        // Menu
        // Welcome Screen


        final String productsFilename = "products.txt";
        final String salesFilename = "sales.txt";
        final String ordersFilename = "orders.txt";
        LoadFromFileProducts.load(shop, productsFilename);
        LoadFromFileSales.load(shop, salesFilename);
        LoadFromFileOrders.load(shop, ordersFilename);
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our Shop!!!");
        mainLoop(shop, in);

    }

    //////////////////////////Main loop///////////////////////////////////////
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
                    endOfProgram = isEndOfProgram(shop);
                    break;
                default:
                    invalidChoices(4);
            }
        }
    }

    //Method for invalid choices
    private static void invalidChoices(int choices) {
        StringBuilder s = new StringBuilder("Your input is invalid. Please select");
        for (int i = 0; i < choices; i++) {
            s.append(" ").append(i);
        }
        s.append(".");
        System.out.println(s);
    }

    //Method for ending the program
    private static boolean isEndOfProgram(Shop shop) {
        boolean endOfProgram;
        CreateFileProducts.CreateFile(shop.getAvailableProducts());
        CreateFileSales.CreateFile(shop.getSales());
        CreateFileOrders.CreateFile(shop.getOrders());
        System.out.println("End of the program!");
        endOfProgram = true;
        return true;
    }

    //Method for overviewing all products
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

    private static void productsInStock(Shop shop) {
        System.out.println("Showing products in Stock");
        System.out.println("Total amount of products in stock: " + shop.totalAmountOfProductsInStock());
        shop.displayUniqueStock();
        System.out.println();
    }
    //////////////////////////Methods for Components///////////////////////////////////////

    //Method for overviewing all components
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

    //Choices for Ram
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
            System.out.println("0. " + Product.VENGEANCE);
            System.out.println("1. " + Product.CRUCIAL);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Product.VENGEANCE;
                case "1":
                    return Product.CRUCIAL;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String ramFrequencyChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the ram Frequency:");
            System.out.println("0. " + Ram.FREQUENCY1600);
            System.out.println("1. " + Ram.FREQUENCY2666);
            System.out.println("2. " + Ram.FREQUENCY3200);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Ram.FREQUENCY1600;
                case "1":
                    return Ram.FREQUENCY2666;
                case "2":
                    return Ram.FREQUENCY3200;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String ramSizeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the ram size:");
            System.out.println("0. " + Ram.SIZE4);
            System.out.println("1. " + Ram.SIZE8);
            System.out.println("2. " + Ram.SIZE16);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Ram.SIZE4;
                case "1":
                    return Ram.SIZE8;
                case "2":
                    return Ram.SIZE16;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String ramTypeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the ram Type:");
            System.out.println("0. " + Ram.DDR3);
            System.out.println("1. " + Ram.DDR4);
            System.out.println("2. " + Ram.DDR5);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Ram.DDR3;
                case "1":
                    return Ram.DDR4;
                case "2":
                    return Ram.DDR5;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    //Choices for Motherboard
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
            System.out.println("0. " + Motherboard.SATA4);
            System.out.println("1. " + Motherboard.SATA6);
            System.out.println("2. " + Motherboard.SATA8);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Motherboard.SATA4;
                case "1":
                    return Motherboard.SATA6;
                case "2":
                    return Motherboard.SATA8;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String memoryTypeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the memory Type:");
            System.out.println("0. " + Motherboard.MEM32);
            System.out.println("1. " + Motherboard.MEM64);
            System.out.println("2. " + Motherboard.MEM128);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Motherboard.MEM32;
                case "1":
                    return Motherboard.MEM64;
                case "2":
                    return Motherboard.MEM128;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String processorTypeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the processor Type:");
            System.out.println("0. " + Motherboard.TYPE_INTEL);
            System.out.println("1. " + Motherboard.TYPE_AMD);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Motherboard.TYPE_INTEL;
                case "1":
                    return Motherboard.TYPE_AMD;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    //Choices for HardDrive
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
            System.out.println("0. " + Product.SAMSUNG);
            System.out.println("1. " + Product.SEAGATE);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Product.SAMSUNG;
                case "1":
                    return Product.SEAGATE;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String driveCapacityChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the drive Capacity:");
            System.out.println("0. " + HardDrive.CAPACITY256);
            System.out.println("1. " + HardDrive.CAPACITY512);
            System.out.println("2. " + HardDrive.CAPACITY_1TB);
            System.out.println("3. " + HardDrive.CAPACITY_2TB);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return HardDrive.CAPACITY256;
                case "1":
                    return HardDrive.CAPACITY512;
                case "2":
                    return HardDrive.CAPACITY_1TB;
                case "3":
                    return HardDrive.CAPACITY_2TB;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String driveSizeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the drive Size:");
            System.out.println("0. " + HardDrive.DRIVE_SIZE18);
            System.out.println("1. " + HardDrive.DRIVE_SIZE25);
            System.out.println("2. " + HardDrive.DRIVE_SIZE35);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return HardDrive.DRIVE_SIZE18;
                case "1":
                    return HardDrive.DRIVE_SIZE25;
                case "2":
                    return HardDrive.DRIVE_SIZE35;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String driveTypeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the drive Type:");
            System.out.println("0. " + HardDrive.HDD);
            System.out.println("1. " + HardDrive.SSD);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return HardDrive.HDD;
                case "1":
                    return HardDrive.SSD;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    //Choices for Cpu
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

    private static String cpuManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the manufacturer:");
            System.out.println("0. " + Product.INTEL);
            System.out.println("1. " + Product.AMD);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Product.INTEL;
                case "1":
                    return Product.AMD;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
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
            System.out.println("0. " + Cpu.CORES6);
            System.out.println("1. " + Cpu.CORES8);
            System.out.println("2. " + Cpu.CORES16);
            String selectedChoiceOfNbOfCores = in.nextLine();
            switch (selectedChoiceOfNbOfCores) {
                case "0":
                    System.out.println("You've selected " + Cpu.CORES6);
                    return Cpu.CORES6;
                case "1":
                    System.out.println("You've selected " + Cpu.CORES8);
                    return Cpu.CORES8;
                case "2":
                    System.out.println("You've selected " + Cpu.CORES16);
                    return Cpu.CORES16;
                default:
                    System.out.println("Your input is invalid. Please select either 0, 1, 2");
            }
        }
    }

    private static String cpuSpeedChoice(Scanner in) {
        while (true) {

            System.out.println("Selected Cpu");
            System.out.println("Please select CPU speed:");
            System.out.println("0. " + Cpu.SPEED28);
            System.out.println("1. " + Cpu.SPEED33);
            System.out.println("2. " + Cpu.SPEED41);


            String selectedChoiceOfCpuSpeed = in.nextLine();
            switch (selectedChoiceOfCpuSpeed) {
                case "0":
                    System.out.println("You've selected " + Cpu.SPEED28);
                    return Cpu.SPEED28;
                case "1":
                    System.out.println("You've selected " + Cpu.SPEED33);
                    return Cpu.SPEED33;
                case "2":
                    System.out.println("You've selected " + Cpu.SPEED41);
                    return Cpu.SPEED41;
                default:
                    System.out.println("Your input is invalid. Please select either 0, 1, 2");

            }
        }
    }

    //Choices for GraphicsCard

    private static void GraphicsCardComponent(Scanner in) {

        String modelNameChoice = GraphicsCard.NAME;
        int yearChoice = yearChoice(in);
        String manufacturerChoice = graphicsCardManufacturerChoice(in);

        String chipsetChoice = chipsetChoice(in);
        String cardMemoryChoice = cardMemoryChoice(in);

        GraphicsCard graphicsCard = new GraphicsCard(modelNameChoice, yearChoice, manufacturerChoice, 100, chipsetChoice, cardMemoryChoice);
        graphicsCard.setModelPriceToRandom();

        sellOrOrder(in, graphicsCard);

    }

    private static String graphicsCardManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the manufacturer:");
            System.out.println("0. " + Product.nVIDIA);
            System.out.println("1. " + Product.AMD);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Product.nVIDIA;
                case "1":
                    return Product.AMD;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }

    }

    private static String cardMemoryChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the Memory:");
            System.out.println("0. " + GraphicsCard.MEM6);
            System.out.println("1. " + GraphicsCard.MEM8);
            System.out.println("2. " + GraphicsCard.MEM12);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return GraphicsCard.MEM6;
                case "1":
                    return GraphicsCard.MEM8;
                case "2":
                    return GraphicsCard.MEM12;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String chipsetChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the chipset:");
            System.out.println("0. " + GraphicsCard.NVIDIA);
            System.out.println("1. " + GraphicsCard.AMD);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return GraphicsCard.NVIDIA;
                case "1":
                    return GraphicsCard.AMD;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    //////////////////////////Selling and Ordering///////////////////////////////////////

    private static void sellOrOrder(Scanner in, Product product) {
        Product p = shop.findMatchingAvailableProduct(product);

        if (p == null) {
            boolean orderProductChoice = orderProductChoice(in, product);
            if (orderProductChoice) {
                orderingProduct(in, product);
            }
        } else {
            decrementStaticsInCaseInstanceIsNotUsed(product);
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
        System.out.println(sale);
    }

    private static void orderingProduct(Scanner in, Product product) {
        Customer customer = askCustomerInfo(in);
        LocalDate dateOfArrival = askArrivalDate(in);
        double finalPrice = calulateFinalPrice(product);

        Order order = new Order(product, customer, dateOfArrival, finalPrice);
        shop.addOrder(order);
        System.out.println("Congratulations! You have ordered the product!");
        System.out.println(order);
    }

    private static double calulateFinalPrice(Product product) {
        System.out.println("Price before discount: " + product.getModelPrice());
        System.out.println("Discount: " + product.getDiscount());
        System.out.println("Final Price: " + product.finalPrice());
        return product.finalPrice();
    }

    private static LocalDate askArrivalDate(Scanner in) {
        while (true) {
            LocalDate selectedDate = Order.DEFAULT_DATE_OF_ORDER;

            try {
                System.out.println("Please input the date of the arrival:");
                System.out.println("Year:");
                int year = Integer.parseInt(in.nextLine());
                System.out.println("Month:");
                int month = Integer.parseInt(in.nextLine());
                System.out.println("Day:");
                int day = Integer.parseInt(in.nextLine());

                selectedDate = LocalDate.of(year, month, day);
            } catch (Exception ignored) {

            }

            if (selectedDate.isAfter(Order.DEFAULT_DATE_OF_ORDER)) {
                return selectedDate;
            } else {
                System.out.println("Invalid date. Must be after today's Date. Please select another day!");
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

    private static boolean orderProductChoice(Scanner in, Product product) {
        while (true) {
            System.out.println("Do you wish to order this product");
            System.out.println("0. yes");
            System.out.println("1. no");

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return true;
                case "1":
                    decrementStaticsInCaseInstanceIsNotUsed(product);
                    return false;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    // Method for decreasing the number of products in case user chose a product but doesn't want to buy/order it

    private static void decrementStaticsInCaseInstanceIsNotUsed(Product product) {
        Product.nextProductNum--;
        if (product instanceof Cpu) {
            Cpu.numOfCpus--;
        } else if (product instanceof HardDrive) {
            HardDrive.numOfHardDrives--;
        } else if (product instanceof GraphicsCard) {
            GraphicsCard.numOfGraphicsCards--;
        } else if (product instanceof Printer) {
            Printer.numOfPrinters--;
        } else if (product instanceof Ram) {
            Ram.numOfRams--;
        } else if (product instanceof Motherboard) {
            Motherboard.numOfMotherboards--;
        } else if (product instanceof Mouse) {
            Mouse.numOfMice--;
        } else if (product instanceof Monitor) {
            Monitor.numOfMonitors--;
        } else if (product instanceof Keyboard) {
            Keyboard.numOfKeyboards--;
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
                    return Product.YEAR_2018;
                case "1":
                    return Product.YEAR_2019;
                case "2":
                    return Product.YEAR_2020;
                case "3":
                    return Product.YEAR_2021;
                case "4":
                    return Product.YEAR_2022;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1 2 3 4");
            }

        }

    }
    //////////////////////////Methods for Peripherals///////////////////////////////////////

    //Method for overviewing all Peripherals
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

    //printer choice
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
            System.out.println("0. " + Printer.COLORED);
            System.out.println("1. " + Printer.BLACK_WHITE);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Printer.COLORED;
                case "1":
                    return Printer.BLACK_WHITE;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String printerTechChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the printer Tech:");
            System.out.println("0. " + Printer.LASER);
            System.out.println("1. " + Printer.INKJET);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Printer.LASER;
                case "1":
                    return Printer.INKJET;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String printerManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the printer Manufacturer:");
            System.out.println("0. " + Printer.HP);
            System.out.println("1. " + Printer.SAMSUNG);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Printer.HP;
                case "1":
                    return Printer.SAMSUNG;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    //Mouse choice
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
            System.out.println("0. " + Mouse.WIRED);
            System.out.println("1. " + Mouse.WIRELESS);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Mouse.WIRED;
                case "1":
                    return Mouse.WIRELESS;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String mouseTechChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the mouse Tech:");
            System.out.println("0. " + Mouse.LASER);
            System.out.println("1. " + Mouse.OPTICAL);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Mouse.LASER;
                case "1":
                    return Mouse.OPTICAL;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String mouseManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the mouse Manufacturer:");
            System.out.println("0. " + Product.LOGITECH);
            System.out.println("1. " + Product.SAMSUNG);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Product.LOGITECH;
                case "1":
                    return Product.SAMSUNG;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    //Monitor choice
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
            System.out.println("0. " + Monitor.PORT1);
            System.out.println("1. " + Monitor.PORT2);
            System.out.println("2. " + Monitor.PORT3);
            String selectedChoiceOfNbOfCores = in.nextLine();
            switch (selectedChoiceOfNbOfCores) {
                case "0":
                    System.out.println("You've selected " + Monitor.PORT1);
                    return Monitor.PORT1;
                case "1":
                    System.out.println("You've selected " + Monitor.PORT2);
                    return Monitor.PORT2;
                case "2":
                    System.out.println("You've selected " + Monitor.PORT3);
                    return Monitor.PORT3;
                default:
                    System.out.println("Your input is invalid. Please select either 0, 1, 2");
            }
        }
    }

    private static String monitorResolutionChoice(Scanner in) {
        while (true) {
            System.out.println("Please select monitor Resolution:");
            System.out.println("0. " + Monitor.RESOLUTION1);
            System.out.println("1. " + Monitor.RESOLUTION2);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Monitor.RESOLUTION1;
                case "1":
                    return Monitor.RESOLUTION2;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String monitorDimensionsChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the monitor Dimensions :");
            System.out.println("0. " + Monitor.DIMENSION17);
            System.out.println("1. " + Monitor.DIMENSION24);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Monitor.DIMENSION17;
                case "1":
                    return Monitor.DIMENSION24;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String monitorTypeChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the monitor Type:");
            System.out.println("0. " + Monitor.MONITOR);
            System.out.println("1. " + Monitor.PORTABLE_MONITOR);
            System.out.println("2. " + Monitor.TV_MONITOR);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Monitor.MONITOR;
                case "1":
                    return Monitor.PORTABLE_MONITOR;
                case "2":
                    return Monitor.TV_MONITOR;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String monitorManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the monitor Manufacturer:");
            System.out.println("0. " + Product.SAMSUNG);
            System.out.println("1. " + Product.LG);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Product.SAMSUNG;
                case "1":
                    return Product.LG;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    //Keyboard choice
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
            System.out.println("0. " + Keyboard.WIRED);
            System.out.println("1. " + Keyboard.WIRELESS);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Keyboard.WIRED;
                case "1":
                    return Keyboard.WIRELESS;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    private static String keyboardManufacturerChoice(Scanner in) {
        while (true) {
            System.out.println("Please select the keyboard Connection:");
            System.out.println("0. " + Product.LOGITECH);
            System.out.println("1. " + Product.RAZER);

            String selectedChoice = in.nextLine();
            switch (selectedChoice) {
                case "0":
                    return Product.LOGITECH;
                case "1":
                    return Product.RAZER;
                default:
                    System.out.println("Your input is invalid. Please select either 0 1");
            }

        }
    }

    //////////////////////////Sales and Orders overview///////////////////////////////////////

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
