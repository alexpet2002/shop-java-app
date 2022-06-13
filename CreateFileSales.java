/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

class CreateFileSales {

    public static final String SALES_TXT = "sales.txt";
    public ArrayList<Sale> sales = new ArrayList<Sale>();

    public void CreateList() {

        System.out.println(" >>>>>>> Create Objects (Sales) ...");

        Customer customer01 = new Customer("Giorgos Antreou", "9877635");
        Customer customer02 = new Customer("Antreas Georgiou", "9867635");
        Customer customer03 = new Customer("Kostantina Antreou", "9877875");
        Customer customer04 = new Customer("Nikos Georgiou", "9547635");
        Customer customer05 = new Customer("Sam Antreou", "9811635");

        GraphicsCard soldgraphicsCard1 = new GraphicsCard(GraphicsCard.NAME, Product.YEAR_2019, Product.AMD, 270.0, GraphicsCard.AMD, GraphicsCard.MEM8);
        Ram soldram1 = new Ram(Ram.NAME, Product.YEAR_2021, Product.VENGEANCE, 269.0, Ram.DDR3, Ram.SIZE4, Ram.FREQUENCY1600);
        Ram soldram2 = new Ram(Ram.NAME, Product.YEAR_2021, Product.CRUCIAL, 272.0, Ram.DDR5, Ram.SIZE4, Ram.FREQUENCY1600);
        HardDrive soldhardDrive1 = new HardDrive(HardDrive.NAME, Product.YEAR_2021, Product.SAMSUNG, 278.0, HardDrive.HDD, HardDrive.DRIVE_SIZE18, HardDrive.CAPACITY_2TB);
        Cpu soldcpu1 = new Cpu(Cpu.NAME, Product.YEAR_2018, Product.INTEL, 600, Cpu.SPEED28, Cpu.CORES6, true);


        Sale sale01 = new Sale(soldcpu1, customer01, LocalDate.parse("2022-06-12"), soldcpu1.finalPrice());
        Sale sale02 = new Sale(soldgraphicsCard1, customer02, LocalDate.parse("2022-06-12"), soldgraphicsCard1.finalPrice());
        Sale sale03 = new Sale(soldram1, customer03, LocalDate.parse("2022-06-12"), soldram1.finalPrice());
        Sale sale04 = new Sale(soldram2, customer04, LocalDate.parse("2022-06-12"), soldram2.finalPrice());
        Sale sale05 = new Sale(soldhardDrive1, customer05, LocalDate.parse("2022-06-12"), soldhardDrive1.finalPrice());

        System.out.println(" >>>>>>> Add Objects (Sales) to ARRAYLIST...");

        sales.add(sale01);
        sales.add(sale02);
        sales.add(sale03);
        sales.add(sale04);
        sales.add(sale05);
    }

    public static void CreateFile(ArrayList<Sale> sales) {

        System.out.println(" >>>>>>> Write data from ARRAYLIST to FILE...");
        FileWriter writer = null;

        try {
            writer = new FileWriter(new File(SALES_TXT));

            writer.write(" SALES_LIST\n {\n");
            for (Sale sale : sales)

                if (sale.getSoldProduct() instanceof Motherboard) {
                    writer.write("\tSALE" + "\n\t" + "{"
                            + "\n\t\t" + "NUMBER " + sale.getSalesNum()
                            + "\n\t\t" + "ITEM_TYPE " + sale.getSoldProduct().getModelName()
                            + "\n\t\t" + "MODEL " + "AEXX-12-13"
                            + "\n\t\t" + "NAME " + sale.getCustomer().getName()
                            + "\n\t\t" + "PHONE " + sale.getCustomer().getPhonenumber()
                            + "\n\t\t" + "SALE_DATE " + sale.getDateOfSale()
                            + "\n\t\t" + "MODEL_YEAR " + sale.getSoldProduct().getModelYear()
                            + "\n\t\t" + "MANUFACTURER " + sale.getSoldProduct().getModelManufacturer()
                            + "\n\t\t" + "PRICE " + sale.getSoldProduct().getModelPrice()
                            + "\n\t\t" + "PROCESSOR_TYPE " + ((Motherboard) sale.getSoldProduct()).getProcessorType()
                            + "\n\t\t" + "MEMORY_TYPE " + ((Motherboard) sale.getSoldProduct()).getMemoryType()
                            + "\n\t\t" + "NUMBER_OF_SATA_TYPE " + ((Motherboard) sale.getSoldProduct()).getNumOfPortsSataType()
                            + "\n\t" + "}" + "\n");
                }//Motherboard
                else if (sale.getSoldProduct() instanceof Cpu) {
                    writer.write("\tSALE" + "\n\t" + "{"
                            + "\n\t\t" + "NUMBER " + sale.getSalesNum()
                            + "\n\t\t" + "ITEM_TYPE " + sale.getSoldProduct().getModelName()
                            + "\n\t\t" + "NAME " + sale.getCustomer().getName()
                            + "\n\t\t" + "PHONE " + sale.getCustomer().getPhonenumber()
                            + "\n\t\t" + "SALE_DATE " + sale.getDateOfSale()
                            + "\n\t\t" + "MODEL " + "BEXX-12-13"
                            + "\n\t\t" + "MODEL_YEAR " + sale.getSoldProduct().getModelYear()
                            + "\n\t\t" + "MANUFACTURER " + sale.getSoldProduct().getModelManufacturer()
                            + "\n\t\t" + "PRICE " + sale.getSoldProduct().getModelPrice()
                            + "\n\t\t" + "CPU_SPEED " + ((Cpu) sale.getSoldProduct()).getCpuSpeed()
                            + "\n\t\t" + "NUMBER_OF_CORES " + ((Cpu) sale.getSoldProduct()).getNumOfCores()
                            + "\n\t\t" + "CPU_GRAPHICS " + ((Cpu) sale.getSoldProduct()).isCpuGraphics()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (sale.getSoldProduct() instanceof GraphicsCard) {
                    writer.write("\tSALE" + "\n\t" + "{"
                            + "\n\t\t" + "NUMBER " + sale.getSalesNum()
                            + "\n\t\t" + "ITEM_TYPE " + sale.getSoldProduct().getModelName()
                            + "\n\t\t" + "NAME " + sale.getCustomer().getName()
                            + "\n\t\t" + "PHONE " + sale.getCustomer().getPhonenumber()
                            + "\n\t\t" + "SALE_DATE " + sale.getDateOfSale()
                            + "\n\t\t" + "MODEL " + "CEXX-12-13"
                            + "\n\t\t" + "MODEL_YEAR " + sale.getSoldProduct().getModelYear()
                            + "\n\t\t" + "MANUFACTURER " + sale.getSoldProduct().getModelManufacturer()
                            + "\n\t\t" + "PRICE " + sale.getSoldProduct().getModelPrice()
                            + "\n\t\t" + "CHIPSET " + ((GraphicsCard) sale.getSoldProduct()).getChipset()
                            + "\n\t\t" + "MEMORY_TYPE " + ((GraphicsCard) sale.getSoldProduct()).getCardMemory()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (sale.getSoldProduct() instanceof HardDrive) {
                    writer.write("\tSALE" + "\n\t" + "{"
                            + "\n\t\t" + "NUMBER " + sale.getSalesNum()
                            + "\n\t\t" + "ITEM_TYPE " + sale.getSoldProduct().getModelName()
                            + "\n\t\t" + "NAME " + sale.getCustomer().getName()
                            + "\n\t\t" + "PHONE " + sale.getCustomer().getPhonenumber()
                            + "\n\t\t" + "SALE_DATE " + sale.getDateOfSale()
                            + "\n\t\t" + "MODEL " + "DEXX-12-13"
                            + "\n\t\t" + "MODEL_YEAR " + sale.getSoldProduct().getModelYear()
                            + "\n\t\t" + "MANUFACTURER " + sale.getSoldProduct().getModelManufacturer()
                            + "\n\t\t" + "PRICE " + sale.getSoldProduct().getModelPrice()
                            + "\n\t\t" + "DRIVE_TYPE " + ((HardDrive) sale.getSoldProduct()).getDriveType()
                            + "\n\t\t" + "DRIVE_SIZE " + ((HardDrive) sale.getSoldProduct()).getDriveSize()
                            + "\n\t\t" + "DRIVE_CAPACITY " + ((HardDrive) sale.getSoldProduct()).getDriveCapacity()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (sale.getSoldProduct() instanceof Keyboard) {
                    writer.write("\tSALE" + "\n\t" + "{"
                            + "\n\t\t" + "NUMBER " + sale.getSalesNum()
                            + "\n\t\t" + "ITEM_TYPE " + sale.getSoldProduct().getModelName()
                            + "\n\t\t" + "NAME " + sale.getCustomer().getName()
                            + "\n\t\t" + "PHONE " + sale.getCustomer().getPhonenumber()
                            + "\n\t\t" + "SALE_DATE " + sale.getDateOfSale()
                            + "\n\t\t" + "MODEL " + "EEXX-12-13"
                            + "\n\t\t" + "MODEL_YEAR " + sale.getSoldProduct().getModelYear()
                            + "\n\t\t" + "MANUFACTURER " + sale.getSoldProduct().getModelManufacturer()
                            + "\n\t\t" + "PRICE " + sale.getSoldProduct().getModelPrice()
                            + "\n\t\t" + "KEYBOARD_CONNECTION " + ((Keyboard) sale.getSoldProduct()).getKeyboardConnect()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (sale.getSoldProduct() instanceof Mouse) {
                    writer.write("\tSALE" + "\n\t" + "{"
                            + "\n\t\t" + "NUMBER " + sale.getSalesNum()
                            + "\n\t\t" + "ITEM_TYPE " + sale.getSoldProduct().getModelName()
                            + "\n\t\t" + "NAME " + sale.getCustomer().getName()
                            + "\n\t\t" + "PHONE " + sale.getCustomer().getPhonenumber()
                            + "\n\t\t" + "SALE_DATE " + sale.getDateOfSale()
                            + "\n\t\t" + "MODEL " + "FEXX-12-13"
                            + "\n\t\t" + "MODEL_YEAR " + sale.getSoldProduct().getModelYear()
                            + "\n\t\t" + "MANUFACTURER " + sale.getSoldProduct().getModelManufacturer()
                            + "\n\t\t" + "PRICE " + sale.getSoldProduct().getModelPrice()
                            + "\n\t\t" + "MOUSE_CONNECTION " + ((Mouse) sale.getSoldProduct()).getMouseConnect()
                            + "\n\t\t" + "MOUSE_TECHNOLOGY " + ((Mouse) sale.getSoldProduct()).getMouseTech()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (sale.getSoldProduct() instanceof Printer) {
                    writer.write("\tSALE" + "\n\t" + "{"
                            + "\n\t\t" + "NUMBER " + sale.getSalesNum()
                            + "\n\t\t" + "ITEM_TYPE " + sale.getSoldProduct().getModelName()
                            + "\n\t\t" + "NAME " + sale.getCustomer().getName()
                            + "\n\t\t" + "PHONE " + sale.getCustomer().getPhonenumber()
                            + "\n\t\t" + "SALE_DATE " + sale.getDateOfSale()
                            + "\n\t\t" + "MODEL " + "GEXX-12-13"
                            + "\n\t\t" + "MODEL_YEAR " + sale.getSoldProduct().getModelYear()
                            + "\n\t\t" + "MANUFACTURER " + sale.getSoldProduct().getModelManufacturer()
                            + "\n\t\t" + "PRICE " + sale.getSoldProduct().getModelPrice()
                            + "\n\t\t" + "PRINTER_TECHNOLOGY " + ((Printer) sale.getSoldProduct()).getPrinterTech()
                            + "\n\t\t" + "PRINTER_TYPE " + ((Printer) sale.getSoldProduct()).getPrintType()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (sale.getSoldProduct() instanceof Monitor) {
                    writer.write("\tSALE" + "\n\t" + "{"
                            + "\n\t\t" + "NUMBER " + sale.getSalesNum()
                            + "\n\t\t" + "ITEM_TYPE " + sale.getSoldProduct().getModelName()
                            + "\n\t\t" + "NAME " + sale.getCustomer().getName()
                            + "\n\t\t" + "PHONE " + sale.getCustomer().getPhonenumber()
                            + "\n\t\t" + "SALE_DATE " + sale.getDateOfSale()
                            + "\n\t\t" + "MODEL " + "HEXX-12-13"
                            + "\n\t\t" + "MODEL_YEAR " + sale.getSoldProduct().getModelYear()
                            + "\n\t\t" + "MANUFACTURER " + sale.getSoldProduct().getModelManufacturer()
                            + "\n\t\t" + "PRICE " + sale.getSoldProduct().getModelPrice()
                            + "\n\t\t" + "MONITOR_TYPE " + ((Monitor) sale.getSoldProduct()).getMonitorType()
                            + "\n\t\t" + "DIMENSIONS " + ((Monitor) sale.getSoldProduct()).getMonitorDimensions()
                            + "\n\t\t" + "RESOLUTION " + ((Monitor) sale.getSoldProduct()).getMonitorResolution()
                            + "\n\t\t" + "INTERFACES " + ((Monitor) sale.getSoldProduct()).getMonitorPort()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (sale.getSoldProduct() instanceof Ram) {
                    writer.write("\tSALE" + "\n\t" + "{"
                            + "\n\t\t" + "NUMBER " + sale.getSalesNum()
                            + "\n\t\t" + "ITEM_TYPE " + sale.getSoldProduct().getModelName()
                            + "\n\t\t" + "NAME " + sale.getCustomer().getName()
                            + "\n\t\t" + "PHONE " + sale.getCustomer().getPhonenumber()
                            + "\n\t\t" + "SALE_DATE " + sale.getDateOfSale()
                            + "\n\t\t" + "MODEL " + "JEXX-12-13"
                            + "\n\t\t" + "MODEL_YEAR " + sale.getSoldProduct().getModelYear()
                            + "\n\t\t" + "MANUFACTURER " + sale.getSoldProduct().getModelManufacturer()
                            + "\n\t\t" + "PRICE " + sale.getSoldProduct().getModelPrice()
                            + "\n\t\t" + "RAM_FREQUENCY " + ((Ram) sale.getSoldProduct()).getRamFrequency()
                            + "\n\t\t" + "RAM_SIZE " + ((Ram) sale.getSoldProduct()).getRamSize()
                            + "\n\t\t" + "RAM_TYPE " + ((Ram) sale.getSoldProduct()).getRamType()
                            + "\n\t" + "}" + "\n");
                }//Cpu
            writer.write(" }");
            writer.close();

        }//try

        catch (IOException e) {
            System.err.println("Error writing file.");
        }
    }

    public void PrintFile() {

        try {

            BufferedReader reader = new BufferedReader(new FileReader(new File("sales.txt")));
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

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public static void main(String[] args) {
        CreateFileSales app = new CreateFileSales();
        app.CreateList();
        CreateFile(app.getSales());
        app.PrintFile();
    }//main
}



