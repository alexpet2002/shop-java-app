/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/

import java.io.*;
import java.util.ArrayList;

class CreateFileOrders {

    public static final String ORDERS_TXT = "orders.txt";
    public ArrayList<Order> orders = new ArrayList<Order>();

    public void CreateList() {

        System.out.println(" >>>>>>> Create Objects (Orders) ...");

        Customer customer01 = new Customer("Giorgos_Antreou", "9877635");
        Customer customer02 = new Customer("Antreas_Georgiou", "9867635");
        Customer customer03 = new Customer("Kostantina_Antreou", "9877875");
        Customer customer04 = new Customer("Nikos_Georgiou", "9547635");
        Customer customer05 = new Customer("Sam_Antreou", "9811635");

        GraphicsCard soldgraphicsCard1 = new GraphicsCard(GraphicsCard.NAME, Product.YEAR_2019, Product.AMD, 270.0, GraphicsCard.AMD, GraphicsCard.MEM8);
        Ram soldram1 = new Ram(Ram.NAME, Product.YEAR_2021, Product.VENGEANCE, 269.0, Ram.DDR3, Ram.SIZE4, Ram.FREQUENCY1600);
        Ram soldram2 = new Ram(Ram.NAME, Product.YEAR_2021, Product.CRUCIAL, 272.0, Ram.DDR5, Ram.SIZE4, Ram.FREQUENCY1600);
        HardDrive soldhardDrive1 = new HardDrive(HardDrive.NAME, Product.YEAR_2021, Product.SAMSUNG, 278.0, HardDrive.HDD, HardDrive.DRIVE_SIZE18, HardDrive.CAPACITY_2TB);
        Cpu soldcpu1 = new Cpu(Cpu.NAME, Product.YEAR_2018, Product.INTEL, 600, Cpu.SPEED28, Cpu.CORES6, true);

        Order order1 = new Order(soldgraphicsCard1, customer01, "11-12-2019", 270.0);
        Order order2 = new Order(soldram1, customer02, "12-11-2019", 269.0);
        Order order3 = new Order(soldram2, customer03, "13-7-2021", 272.0);
        Order order4 = new Order(soldhardDrive1, customer04, "14-12-2021", 278.0);
        Order order5 = new Order(soldcpu1, customer05, "11-5-2019", 600.0);


        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);


        System.out.println(" >>>>>>> Add Objects (Orders) to ARRAYLIST...");

    }

    public static void CreateFile(ArrayList<Order> orders) {

        System.out.println(" >>>>>>> Write data from ARRAYLIST to FILE...");
        FileWriter writer = null;

        try {
            writer = new FileWriter(new File(ORDERS_TXT));

            writer.write(" ORDERS_LIST\n {\n");
            for (Order order : orders)

                if (order.getOrderedProduct() instanceof Motherboard) {
                    writer.write("\tORDER" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + ((Motherboard) order.getOrderedProduct()).getModelName()
                            + "\n" + "\t\t" + "NUMBER " + order.getOrderNum()
                            + "\n" + "\t\t" + "MODEL " + "AEXX-12-13"
                            + "\n" + "\t\t" + "NAME " + order.getCustomer().getName()
                            + "\n" + "\t\t" + "PHONE " + order.getCustomer().getPhonenumber()
                            + "\n" + "\t\t" + "ORDER_DATE " + order.getRandomDateOfOrder()
                            + "\n\t" + "\t" + "MODEL_YEAR " + ((Motherboard) order.getOrderedProduct()).getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + ((Motherboard) order.getOrderedProduct()).getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + ((Motherboard) order.getOrderedProduct()).getModelPrice()
                            + "\n\t" + "\t" + "PROCESSOR_TYPE " + ((Motherboard) order.getOrderedProduct()).getProcessorType()
                            + "\n\t" + "\t" + "MEMORY_TYPE " + ((Motherboard) order.getOrderedProduct()).getMemoryType()
                            + "\n\t" + "\t" + "NUMBER_OF_SATA_TYPE " + ((Motherboard) order.getOrderedProduct()).getNumOfPortsSataType()
                            + "\n\t" + "}" + "\n");
                }//Motherboard
                else if (order.getOrderedProduct() instanceof Cpu) {
                    writer.write("\tORDER" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + ((Cpu) order.getOrderedProduct()).getModelName()
                            + "\n" + "\t\t" + "NUMBER " + order.getOrderNum()
                            + "\n" + "\t\t" + "NAME " + order.getCustomer().getName()
                            + "\n" + "\t\t" + "PHONE " + order.getCustomer().getPhonenumber()
                            + "\n" + "\t\t" + "ORDER_DATE " + order.getRandomDateOfOrder()
                            + "\n" + "\t\t" + "MODEL " + "BEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + ((Cpu) order.getOrderedProduct()).getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + ((Cpu) order.getOrderedProduct()).getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + ((Cpu) order.getOrderedProduct()).getModelPrice()
                            + "\n\t" + "\t" + "CPU_SPEED " + ((Cpu) order.getOrderedProduct()).getCpuSpeed()
                            + "\n\t" + "\t" + "NUMBER_OF_CORES " + ((Cpu) order.getOrderedProduct()).getNumOfCores()
                            + "\n\t" + "\t" + "CPU_GRAPHICS " + ((Cpu) order.getOrderedProduct()).isCpuGraphics()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (order.getOrderedProduct() instanceof GraphicsCard) {
                    writer.write("\tORDER" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + ((GraphicsCard) order.getOrderedProduct()).getModelName()
                            + "\n" + "\t\t" + "NUMBER " + order.getOrderNum()
                            + "\n" + "\t\t" + "NAME " + order.getCustomer().getName()
                            + "\n" + "\t\t" + "PHONE " + order.getCustomer().getPhonenumber()
                            + "\n" + "\t\t" + "ORDER_DATE " + order.getRandomDateOfOrder()
                            + "\n" + "\t\t" + "MODEL " + "CEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + ((GraphicsCard) order.getOrderedProduct()).getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + ((GraphicsCard) order.getOrderedProduct()).getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + ((GraphicsCard) order.getOrderedProduct()).getModelPrice()
                            + "\n\t" + "\t" + "CHIPSET " + ((GraphicsCard) order.getOrderedProduct()).getChipset()
                            + "\n\t" + "\t" + "MEMORY_TYPE " + ((GraphicsCard) order.getOrderedProduct()).getCardMemory()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (order.getOrderedProduct() instanceof HardDrive) {
                    writer.write("\tORDER" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + ((HardDrive) order.getOrderedProduct()).getModelName()
                            + "\n" + "\t\t" + "NAME " + order.getCustomer().getName()
                            + "\n" + "\t\t" + "NUMBER " + order.getOrderNum()
                            + "\n" + "\t\t" + "PHONE " + order.getCustomer().getPhonenumber()
                            + "\n" + "\t\t" + "ORDER_DATE " + order.getRandomDateOfOrder()
                            + "\n" + "\t\t" + "MODEL " + "DEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + ((HardDrive) order.getOrderedProduct()).getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + ((HardDrive) order.getOrderedProduct()).getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + ((HardDrive) order.getOrderedProduct()).getModelPrice()
                            + "\n\t" + "\t" + "DRIVE_TYPE " + ((HardDrive) order.getOrderedProduct()).getDriveType()
                            + "\n\t" + "\t" + "DRIVE_SIZE " + ((HardDrive) order.getOrderedProduct()).getDriveSize()
                            + "\n\t" + "\t" + "DRIVE_CAPACITY " + ((HardDrive) order.getOrderedProduct()).getDriveCapacity()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (order.getOrderedProduct() instanceof Keyboard) {
                    writer.write("\tORDER" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + ((Keyboard) order.getOrderedProduct()).getModelName()
                            + "\n" + "\t\t" + "NUMBER " + order.getOrderNum()
                            + "\n" + "\t\t" + "NAME " + order.getCustomer().getName()
                            + "\n" + "\t\t" + "PHONE " + order.getCustomer().getPhonenumber()
                            + "\n" + "\t\t" + "ORDER_DATE " + order.getRandomDateOfOrder()
                            + "\n" + "\t\t" + "MODEL " + "EEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + ((Keyboard) order.getOrderedProduct()).getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + ((Keyboard) order.getOrderedProduct()).getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + ((Keyboard) order.getOrderedProduct()).getModelPrice()
                            + "\n\t" + "\t" + "KEYBOARD_CONNECTION " + ((Keyboard) order.getOrderedProduct()).getKeyboardConnect()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (order.getOrderedProduct() instanceof Mouse) {
                    writer.write("\tORDER" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + ((Mouse) order.getOrderedProduct()).getModelName()
                            + "\n" + "\t\t" + "NUMBER " + order.getOrderNum()
                            + "\n" + "\t\t" + "NAME " + order.getCustomer().getName()
                            + "\n" + "\t\t" + "PHONE " + order.getCustomer().getPhonenumber()
                            + "\n" + "\t\t" + "ORDER_DATE " + order.getRandomDateOfOrder()
                            + "\n" + "\t\t" + "MODEL " + "FEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + ((Mouse) order.getOrderedProduct()).getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + ((Mouse) order.getOrderedProduct()).getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + ((Mouse) order.getOrderedProduct()).getModelPrice()
                            + "\n\t" + "\t" + "MOUSE_CONNECTION " + ((Mouse) order.getOrderedProduct()).getMouseConnect()
                            + "\n\t" + "\t" + "MOUSE_TECHNOLOGY " + ((Mouse) order.getOrderedProduct()).getMouseTech()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (order.getOrderedProduct() instanceof Printer) {
                    writer.write("\tORDER" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + ((Printer) order.getOrderedProduct()).getModelName()
                            + "\n" + "\t\t" + "NUMBER " + order.getOrderNum()
                            + "\n" + "\t\t" + "NAME " + order.getCustomer().getName()
                            + "\n" + "\t\t" + "PHONE " + order.getCustomer().getPhonenumber()
                            + "\n" + "\t\t" + "ORDER_DATE " + order.getRandomDateOfOrder()
                            + "\n" + "\t\t" + "MODEL " + "GEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + ((Printer) order.getOrderedProduct()).getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + ((Printer) order.getOrderedProduct()).getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + ((Printer) order.getOrderedProduct()).getModelPrice()
                            + "\n\t" + "\t" + "PRINTER_TECHNOLOGY " + ((Printer) order.getOrderedProduct()).getPrinterTech()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (order.getOrderedProduct() instanceof Monitor) {
                    writer.write("\tORDER" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + ((Monitor) order.getOrderedProduct()).getModelName()
                            + "\n" + "\t\t" + "NUMBER " + order.getOrderNum()
                            + "\n" + "\t\t" + "NAME " + order.getCustomer().getName()
                            + "\n" + "\t\t" + "PHONE " + order.getCustomer().getPhonenumber()
                            + "\n" + "\t\t" + "ORDER_DATE " + order.getRandomDateOfOrder()
                            + "\n" + "\t\t" + "MODEL " + "HEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + ((Monitor) order.getOrderedProduct()).getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + ((Monitor) order.getOrderedProduct()).getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + ((Monitor) order.getOrderedProduct()).getModelPrice()
                            + "\n\t" + "\t" + "DIMENSIONS " + ((Monitor) order.getOrderedProduct()).getMonitorDimensions()
                            + "\n\t" + "\t" + "RESOLUTION " + ((Monitor) order.getOrderedProduct()).getMonitorResolution()
                            + "\n\t" + "\t" + "INTERFACES " + ((Monitor) order.getOrderedProduct()).getMonitorPort()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (order.getOrderedProduct() instanceof Ram) {
                    writer.write("\tORDER" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + ((Ram) order.getOrderedProduct()).getModelName()
                            + "\n" + "\t\t" + "NUMBER " + order.getOrderNum()
                            + "\n" + "\t\t" + "NAME " + order.getCustomer().getName()
                            + "\n" + "\t\t" + "PHONE " + order.getCustomer().getPhonenumber()
                            + "\n" + "\t\t" + "ORDER_DATE " + order.getRandomDateOfOrder()
                            + "\n" + "\t\t" + "MODEL " + "JEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + ((Ram) order.getOrderedProduct()).getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + ((Ram) order.getOrderedProduct()).getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + ((Ram) order.getOrderedProduct()).getModelPrice()
                            + "\n\t" + "\t" + "RAM_FREQUENCY " + ((Ram) order.getOrderedProduct()).getRamFrequency()
                            + "\n\t" + "\t" + "RAM_SIZE " + ((Ram) order.getOrderedProduct()).getRamSize()
                            + "\n\t" + "\t" + "RAM_TYPE " + ((Ram) order.getOrderedProduct()).getRamType()
                            + "\n\t" + "}" + "\n");
                }//Ram
            writer.write(" }");
            writer.close();

        }//try

        catch (IOException e) {
            System.err.println("Error writing file.");
        }
    }



    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void PrintFile() {

        try {

            BufferedReader reader = new BufferedReader(new FileReader(new File(ORDERS_TXT)));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }//dvd
            reader.close();

        }//try

        catch (IOException e) {
            System.err.println("Error writing file.");
        }
    } // PrintFile

    public static void main(String[] args) {
        CreateFileOrders app = new CreateFileOrders();
        app.CreateList();
        CreateFile(app.getOrders());
        app.PrintFile();
    }//main
}



