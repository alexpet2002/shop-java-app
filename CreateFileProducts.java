/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/

import java.io.*;
import java.util.ArrayList;

class CreateFileProducts {

    public ArrayList<Product> products = new ArrayList<Product>();


    public void CreateList() {

        System.out.println(" >>>>>>> Create Objects (Products) ...");

        GraphicsCard graphicsCard01 = new GraphicsCard(GraphicsCard.NAME, Product.YEAR_2019, Product.AMD, 270.0, GraphicsCard.AMD, GraphicsCard.MEM8);
        GraphicsCard graphicsCard02 = new GraphicsCard(GraphicsCard.NAME, Product.YEAR_2019, Product.AMD, 270.0, GraphicsCard.AMD, GraphicsCard.MEM8);

        Motherboard motherboard01 = new Motherboard(Motherboard.NAME, Product.YEAR_2018, Product.SAMSUNG, 270.0, Motherboard.TYPE_INTEL, Motherboard.MEM32, Motherboard.SATA4);
        Motherboard motherboard02 = new Motherboard(Motherboard.NAME, Product.YEAR_2022, Product.SEAGATE, 274.0, Motherboard.TYPE_AMD, Motherboard.MEM64, Motherboard.SATA8);

        Ram ram01 = new Ram(Ram.NAME, Product.YEAR_2021, Product.VENGEANCE, 269.0, Ram.DDR3, Ram.SIZE4, Ram.FREQUENCY1600);
        Ram ram02 = new Ram(Ram.NAME, Product.YEAR_2021, Product.CRUCIAL, 272.0, Ram.DDR5, Ram.SIZE4, Ram.FREQUENCY1600);

        HardDrive hardDrive01 = new HardDrive(HardDrive.NAME, Product.YEAR_2022, Product.SAMSUNG, 278.0, HardDrive.HDD, HardDrive.DRIVE_SIZE18, HardDrive.CAPACITY256);
        HardDrive hardDrive02 = new HardDrive(HardDrive.NAME, Product.YEAR_2021, Product.SAMSUNG, 278.0, HardDrive.HDD, HardDrive.DRIVE_SIZE18, HardDrive.CAPACITY_2TB);

        Cpu cpu01 = new Cpu(Cpu.NAME, Product.YEAR_2018, Product.INTEL, 600, Cpu.SPEED28, Cpu.CORES6, true);
        Cpu cpu02 = new Cpu(Cpu.NAME, Product.YEAR_2018, Product.AMD, 268.0, Cpu.SPEED33, Cpu.CORES16, true);
        //Peripheral products
        Keyboard keyboard01 = new Keyboard(Keyboard.NAME, Product.YEAR_2021, Product.RAZER, 255.0, Keyboard.WIRED);
        Keyboard keyboard02 = new Keyboard(Keyboard.NAME, Product.YEAR_2021, Product.RAZER, 254.0, Keyboard.WIRELESS);

        Monitor monitor01 = new Monitor(Monitor.NAME, Product.YEAR_2018, Product.SAMSUNG, 292.0, Monitor.MONITOR, Monitor.DIMENSION17, Monitor.RESOLUTION2, Monitor.PORT2);
        Monitor monitor02 = new Monitor(Monitor.NAME, Product.YEAR_2018, Product.SAMSUNG, 292.0, Monitor.MONITOR, Monitor.DIMENSION17, Monitor.RESOLUTION2, Monitor.PORT2);

        Mouse mouse01 = new Mouse(Mouse.NAME, Product.YEAR_2019, Mouse.SAMSUNG, 262.0, Mouse.OPTICAL, Mouse.WIRELESS);
        Mouse mouse02 = new Mouse(Mouse.NAME, Product.YEAR_2022, Mouse.LOGITECH, 256.0, Mouse.OPTICAL, Mouse.WIRELESS);

        Printer printer01 = new Printer(Printer.NAME, Product.YEAR_2018, Printer.HP, 261.0, Printer.LASER, Printer.COLORED);
        Printer printer02 = new Printer(Printer.NAME, Product.YEAR_2021, Printer.HP, 255.0, Printer.LASER, Printer.BLACK_WHITE);

        System.out.println(" >>>>>>> Add Objects (Products) to ARRAYLIST...");

        products.add(graphicsCard01);
        products.add(graphicsCard02);
        products.add(motherboard01);
        products.add(motherboard02);
        products.add(ram01);
        products.add(ram02);
        products.add(hardDrive01);
        products.add(hardDrive02);
        products.add(cpu01);
        products.add(cpu02);
        products.add(keyboard01);
        products.add(keyboard02);
        products.add(monitor01);
        products.add(monitor02);
        products.add(mouse01);
        products.add(mouse02);
        products.add(printer01);
        products.add(printer02);

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public static void CreateFile(ArrayList<Product> products) {

        System.out.println(" >>>>>>> Write data from ARRAYLIST to FILE...");

        FileWriter writer = null;

        try {
            writer = new FileWriter(new File("products.txt"));

            writer.write(" ITEM_LIST\n {\n\n");
            for (Product product : products)

                if (product instanceof Motherboard) {
                    writer.write("\tITEM" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + product.getModelName()
                            + "\n" + "\t\t" + "MODEL " + "AEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + product.getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + product.getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + product.getModelPrice()
                            + "\n\t" + "\t" + "PROCESSOR_TYPE " + ((Motherboard) product).getProcessorType()
                            + "\n\t" + "\t" + "MEMORY_TYPE " + ((Motherboard) product).getMemoryType()
                            + "\n\t" + "\t" + "NUMBER_OF_SATA_TYPE " + ((Motherboard) product).getNumOfPortsSataType()
                            + "\n\t" + "}" + "\n");
                }//Motherboard
                else if (product instanceof Cpu) {
                    writer.write("\tITEM" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + product.getModelName()
                            + "\n" + "\t\t" + "MODEL " + "BEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + product.getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + product.getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + product.getModelPrice()
                            + "\n\t" + "\t" + "CPU_SPEED " + ((Cpu) product).getCpuSpeed()
                            + "\n\t" + "\t" + "NUMBER_OF_CORES " + ((Cpu) product).getNumOfCores()
                            + "\n\t" + "\t" + "CPU_GRAPHICS " + ((Cpu) product).isCpuGraphics()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (product instanceof GraphicsCard) {
                    writer.write("\tITEM" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + product.getModelName()
                            + "\n" + "\t\t" + "MODEL " + "CEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + product.getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + product.getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + product.getModelPrice()
                            + "\n\t" + "\t" + "CHIPSET " + ((GraphicsCard) product).getChipset()
                            + "\n\t" + "\t" + "MEMORY_TYPE " + ((GraphicsCard) product).getCardMemory()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (product instanceof HardDrive) {
                    writer.write("\tITEM" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + product.getModelName()
                            + "\n" + "\t\t" + "MODEL " + "DEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + product.getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + product.getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + product.getModelPrice()
                            + "\n\t" + "\t" + "DRIVE_TYPE " + ((HardDrive) product).getDriveType()
                            + "\n\t" + "\t" + "DRIVE_SIZE " + ((HardDrive) product).getDriveSize()
                            + "\n\t" + "\t" + "DRIVE_CAPACITY " + ((HardDrive) product).getDriveCapacity()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (product instanceof Keyboard) {
                    writer.write("\tITEM" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + product.getModelName()
                            + "\n" + "\t\t" + "MODEL " + "EEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + product.getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + product.getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + product.getModelPrice()
                            + "\n\t" + "\t" + "KEYBOARD_CONNECTION " + ((Keyboard) product).getKeyboardConnect()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (product instanceof Mouse) {
                    writer.write("\tITEM" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + product.getModelName()
                            + "\n" + "\t\t" + "MODEL " + "FEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + product.getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + product.getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + product.getModelPrice()
                            + "\n\t" + "\t" + "MOUSE_CONNECTION " + ((Mouse) product).getMouseConnect()
                            + "\n\t" + "\t" + "MOUSE_TECHNOLOGY " + ((Mouse) product).getMouseTech()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (product instanceof Printer) {
                    writer.write("\tITEM" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + product.getModelName()
                            + "\n" + "\t\t" + "MODEL " + "GEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + product.getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + product.getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + product.getModelPrice()
                            + "\n\t" + "\t" + "PRINTER_TECHNOLOGY " + ((Printer) product).getPrinterTech()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (product instanceof Monitor) {
                    writer.write("\tITEM" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + product.getModelName()
                            + "\n" + "\t\t" + "MODEL " + "HEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + product.getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + product.getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + product.getModelPrice()
                            + "\n\t" + "\t" + "DIMENSIONS " + ((Monitor) product).getMonitorDimensions()
                            + "\n\t" + "\t" + "RESOLUTION " + ((Monitor) product).getMonitorResolution()
                            + "\n\t" + "\t" + "INTERFACES " + ((Monitor) product).getMonitorPort()
                            + "\n\t" + "}" + "\n");
                }//Cpu
                else if (product instanceof Ram) {
                    writer.write("\tITEM" + "\n\t" + "{"
                            + "\n" + "\t\t" + "ITEM_TYPE " + product.getModelName()
                            + "\n" + "\t\t" + "MODEL " + "JEXX-12-13"
                            + "\n\t" + "\t" + "MODEL_YEAR " + product.getModelYear()
                            + "\n\t" + "\t" + "MANUFACTURER " + product.getModelManufacturer()
                            + "\n\t" + "\t" + "PRICE " + product.getModelPrice()
                            + "\n\t" + "\t" + "RAM_FREQUENCY " + ((Ram) product).getRamFrequency()
                            + "\n\t" + "\t" + "RAM_SIZE " + ((Ram) product).getRamSize()
                            + "\n\t" + "\t" + "RAM_TYPE " + ((Ram) product).getRamType()
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

            BufferedReader reader = new BufferedReader(new FileReader(new File("products.txt")));
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
		CreateFileProducts app = new CreateFileProducts();
		app.CreateList();
		app.CreateFile(app.getProducts());
		app.PrintFile();
	}//main

}



