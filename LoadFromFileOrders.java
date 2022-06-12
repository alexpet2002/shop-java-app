import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LoadFromFileOrders {

    public static void load(Shop shop, String data) {
        BufferedReader reader = null;
        Product product = null;

        try {
            reader = new BufferedReader(new FileReader(data));
            String line = reader.readLine();

            while (line != null) {

                StringTokenizer st = new StringTokenizer(line, " ");
                String token = st.nextToken();

                switch (token) {
                    case "ORDERS_LIST":
                        line = reader.readLine();
                        break;
                    case "{":
                        line = reader.readLine();
                        break;
                    case "}":
                        line = reader.readLine();
                        break;
                    case "\t}":
                        line = reader.readLine();
                        break;
                    case "\tORDER":

                        String itemString = "";
                        String typeOfProduct = null;
                        line = reader.readLine();
                        line = reader.readLine();


                        while (!line.equals("\t}")) {
                            itemString += line;
                            line = reader.readLine();
                        }

                        String token2 = "";
                        StringTokenizer st2 = null;

                        st = new StringTokenizer(itemString, "\t\t");
                        do {
                            token = st.nextToken();

                            st2 = new StringTokenizer(token, " ");
                            token2 = st2.nextToken();
                        } while (!token2.equals("ITEM_TYPE"));

                        typeOfProduct = st2.nextToken();


                        switch (typeOfProduct) {
                            case "HardDrive": {

                                String NUMBER = String.valueOf(1);
                                String NAME = "Anna_Papazoglou";
                                String PHONE = "1111111";
                                String ORDER_DATE = "11-6-2022";
                                String MODEL = HardDrive.DEXX_12_13;
                                String MODEL_YEAR = String.valueOf(Product.YEAR_2022);
                                String MANUFACTURER = Product.SAMSUNG;
                                String PRICE = String.valueOf(278.0);
                                String DRIVE_TYPE = HardDrive.HDD;
                                String DRIVE_SIZE = HardDrive.DRIVE_SIZE18;
                                String DRIVE_CAPACITY = HardDrive.CAPACITY256;
                                //String ITEMS = String.valueOf(1);

                                st = new StringTokenizer(itemString, "\t\t");
                                int countToken = st.countTokens();

                                for (int i = 0; i < countToken; i++) {
                                    token = st.nextToken();
                                    st2 = new StringTokenizer(token, " ");
                                    token2 = st2.nextToken();

                                    if (token2.equals("NUMBER")) NUMBER = st2.nextToken();
                                    if (token2.equals("NAME"))
                                        NAME = st2.nextToken(); // TODO: Make sure that the name is not spaced
                                    if (token2.equals("PHONE")) PHONE = st2.nextToken();
                                    if (token2.equals("ORDER_DATE")) ORDER_DATE = st2.nextToken();
                                    if (token2.equals("MODEL")) MODEL = st2.nextToken();
                                    if (token2.equals("MODEL_YEAR")) MODEL_YEAR = st2.nextToken();
                                    if (token2.equals("MANUFACTURER")) MANUFACTURER = st2.nextToken();
                                    if (token2.equals("PRICE")) PRICE = st2.nextToken();
                                    if (token2.equals("DRIVE_TYPE")) DRIVE_TYPE = st2.nextToken();
                                    if (token2.equals("DRIVE_SIZE")) DRIVE_SIZE = st2.nextToken();
                                    if (token2.equals("DRIVE_CAPACITY")) DRIVE_CAPACITY = st2.nextToken();

                                }


                                product = new HardDrive();
                                ((HardDrive) product).setDriveType(DRIVE_TYPE);
                                ((HardDrive) product).setDriveSize(DRIVE_SIZE);
                                ((HardDrive) product).setDriveCapacity(DRIVE_CAPACITY);
                                product.setModelName(typeOfProduct);
                                product.setModel(MODEL);
                                product.setModelYear(Integer.parseInt(MODEL_YEAR));
                                product.setModelManufacturer(MANUFACTURER);
                                product.setModelPrice(Double.parseDouble(PRICE));

                                Customer customer = new Customer();
                                customer.setName(NAME);
                                customer.setPhonenumber(PHONE);


                                Order order = new Order();
                                order.setOrderedProduct(product);
                                order.setCustomer(customer);
                                order.setRandomDateOfOrder(ORDER_DATE);
                                order.setFinalCost(Double.parseDouble(PRICE));


                                shop.addOrder(order);
                                line = reader.readLine();


                                break;
                            }
                            case "Motherboard": {

                                String NUMBER = String.valueOf(1);
                                String NAME = "Anna_Papazoglou";
                                String PHONE = "1111111";
                                String ORDER_DATE = "11-6-2022";
                                String MODEL = Motherboard.AEXX_12_13;
                                String MODEL_YEAR = String.valueOf(Product.YEAR_2018);
                                String MANUFACTURER = Product.SAMSUNG;
                                String PRICE = String.valueOf(270.0);
                                String PROCESSOR_TYPE = Motherboard.TYPE_INTEL;
                                String MEMORY_TYPE = Motherboard.MEM32;
                                String NUMBER_OF_SATA_TYPE = Motherboard.SATA4;
                                String ITEMS = String.valueOf(1);


                                st = new StringTokenizer(itemString, "\t\t");
                                int countToken = st.countTokens();

                                for (int i = 0; i < countToken; i++) {
                                    token = st.nextToken();
                                    st2 = new StringTokenizer(token, " ");
                                    token2 = st2.nextToken();

                                    if (token2.equals("NUMBER")) NUMBER = st2.nextToken();
                                    if (token2.equals("NAME"))
                                        NAME = st2.nextToken(); // TODO: Make sure that the name is not spaced
                                    if (token2.equals("PHONE")) PHONE = st2.nextToken();
                                    if (token2.equals("ORDER_DATE")) ORDER_DATE = st2.nextToken();
                                    if (token2.equals("MODEL")) MODEL = st2.nextToken();
                                    if (token2.equals("MODEL_YEAR")) MODEL_YEAR = st2.nextToken();
                                    if (token2.equals("MANUFACTURER")) MANUFACTURER = st2.nextToken();
                                    if (token2.equals("PRICE")) PRICE = st2.nextToken();
                                    if (token2.equals("PROCESSOR_TYPE")) PROCESSOR_TYPE = st2.nextToken();
                                    if (token2.equals("MEMORY_TYPE")) MEMORY_TYPE = st2.nextToken();
                                    if (token2.equals("NUMBER_OF_SATA_TYPE")) NUMBER_OF_SATA_TYPE = st2.nextToken();
                                    if (token2.equals("ITEMS")) ITEMS = st2.nextToken();


                                }

                                product = new Motherboard();
                                ((Motherboard) product).setMemoryType(MEMORY_TYPE);
                                ((Motherboard) product).setProcessorType(PROCESSOR_TYPE);
                                ((Motherboard) product).setNumOfPortsSataType(NUMBER_OF_SATA_TYPE);
                                product.setModelName(typeOfProduct);
                                product.setModel(MODEL);
                                product.setModelYear(Integer.parseInt(MODEL_YEAR));
                                product.setModelManufacturer(MANUFACTURER);
                                product.setModelPrice(Double.parseDouble(PRICE));


                                Customer customer = new Customer();
                                customer.setName(NAME);
                                customer.setPhonenumber(PHONE);

                                Order order = new Order();
                                order.setOrderedProduct(product);
                                order.setCustomer(customer);
                                order.setRandomDateOfOrder(ORDER_DATE);
                                order.setFinalCost(Double.parseDouble(PRICE));


                                shop.addOrder(order);
                                line = reader.readLine();


                                break;
                            }
                            case "GraphicsCard": {

                                String NUMBER = String.valueOf(1);
                                String NAME = "Anna_Papazoglou";
                                String PHONE = "1111111";
                                String ORDER_DATE = "11-6-2022";
                                String MODEL = GraphicsCard.CEXX_12_13;
                                String MODEL_YEAR = String.valueOf(Product.YEAR_2018);
                                String MANUFACTURER = Product.AMD;
                                String PRICE = String.valueOf(270.0);
                                String CHIPSET = GraphicsCard.AMD;
                                String MEMORY_TYPE = GraphicsCard.MEM8;
                                String ITEMS = String.valueOf(1);

                                st = new StringTokenizer(itemString, "\t\t");
                                int countToken = st.countTokens();

                                for (int i = 0; i < countToken; i++) {
                                    token = st.nextToken();
                                    st2 = new StringTokenizer(token, " ");
                                    token2 = st2.nextToken();

                                    if (token2.equals("NUMBER")) NUMBER = st2.nextToken();
                                    if (token2.equals("NAME"))
                                        NAME = st2.nextToken(); // TODO: Make sure that the name is not spaced
                                    if (token2.equals("PHONE")) PHONE = st2.nextToken();
                                    if (token2.equals("ORDER_DATE")) ORDER_DATE = st2.nextToken();
                                    if (token2.equals("MODEL")) MODEL = st2.nextToken();
                                    if (token2.equals("MODEL_YEAR")) MODEL_YEAR = st2.nextToken();
                                    if (token2.equals("MANUFACTURER")) MANUFACTURER = st2.nextToken();
                                    if (token2.equals("PRICE")) PRICE = st2.nextToken();
                                    if (token2.equals("CHIPSET")) CHIPSET = st2.nextToken();
                                    if (token2.equals("MEMORY_TYPE")) MEMORY_TYPE = st2.nextToken();
                                    if (token2.equals("ITEMS")) ITEMS = st2.nextToken();

                                }


                                product = new GraphicsCard();
                                ((GraphicsCard) product).setCardMemory(MEMORY_TYPE);
                                product.setModelName(typeOfProduct);
                                product.setModel(MODEL);
                                ((GraphicsCard) product).setChipset(CHIPSET);
                                product.setModelManufacturer(MANUFACTURER);
                                product.setModelYear(Integer.parseInt(MODEL_YEAR));
                                product.setModelPrice(Double.parseDouble(PRICE));


                                Customer customer = new Customer();
                                customer.setName(NAME);
                                customer.setPhonenumber(PHONE);

                                Order order = new Order();
                                order.setOrderedProduct(product);
                                order.setCustomer(customer);
                                order.setRandomDateOfOrder(ORDER_DATE);
                                order.setFinalCost(Double.parseDouble(PRICE));


                                shop.addOrder(order);
                                line = reader.readLine();

                                break;
                            }
                            case "Cpu": {

                                String NUMBER = String.valueOf(1);
                                String NAME = "Anna_Papazoglou";
                                String PHONE = "1111111";
                                String ORDER_DATE = "11-6-2022";
                                String MODEL = Cpu.BEXX_12_13;
                                String MODEL_YEAR = String.valueOf(Product.YEAR_2018);
                                String MANUFACTURER = Product.INTEL;
                                String PRICE = String.valueOf(600.0);
                                String CPU_SPEED = Cpu.SPEED28;
                                String NUMBER_OF_CORES = Cpu.CORES6;
                                String CPU_GRAPHICS = String.valueOf(true);
                                String ITEMS = String.valueOf(1);

                                st = new StringTokenizer(itemString, "\t\t");
                                int countToken = st.countTokens();

                                for (int i = 0; i < countToken; i++) {
                                    token = st.nextToken();
                                    st2 = new StringTokenizer(token, " ");
                                    token2 = st2.nextToken();

                                    if (token2.equals("NUMBER")) NUMBER = st2.nextToken();
                                    if (token2.equals("NAME"))
                                        NAME = st2.nextToken(); // TODO: Make sure that the name is not spaced
                                    if (token2.equals("PHONE")) PHONE = st2.nextToken();
                                    if (token2.equals("ORDER_DATE")) ORDER_DATE = st2.nextToken();
                                    if (token2.equals("MODEL")) MODEL = st2.nextToken();
                                    if (token2.equals("MODEL_YEAR")) MODEL_YEAR = st2.nextToken();
                                    if (token2.equals("MANUFACTURER")) MANUFACTURER = st2.nextToken();
                                    if (token2.equals("PRICE")) PRICE = st2.nextToken();
                                    if (token2.equals("CPU_SPEED")) CPU_SPEED = st2.nextToken();
                                    if (token2.equals("NUMBER_OF_CORES")) NUMBER_OF_CORES = st2.nextToken();
                                    if (token2.equals("CPU_GRAPHICS")) CPU_GRAPHICS = st2.nextToken();
                                    if (token2.equals("ITEMS")) ITEMS = st2.nextToken();
                                }


                                product = new Cpu();

                                ((Cpu) product).setNumOfCores(NUMBER_OF_CORES);
                                ((Cpu) product).setCpuGraphics(Boolean.parseBoolean(CPU_GRAPHICS));
                                product.setModelYear(Integer.parseInt(MODEL_YEAR));
                                product.setModelManufacturer(MANUFACTURER);
                                ((Cpu) product).setCpuSpeed(CPU_SPEED);
                                product.setModelName(typeOfProduct);
                                product.setModel(MODEL);
                                product.setModelPrice(Double.parseDouble(PRICE));

                                Customer customer = new Customer();
                                customer.setName(NAME);
                                customer.setPhonenumber(PHONE);

                                Order order = new Order();
                                order.setOrderedProduct(product);
                                order.setCustomer(customer);
                                order.setRandomDateOfOrder(ORDER_DATE);
                                order.setFinalCost(Double.parseDouble(PRICE));


                                shop.addOrder(order);
                                line = reader.readLine();


                                break;
                            }
                            case "Ram": {

                                String NUMBER = String.valueOf(1);
                                String NAME = "Anna_Papazoglou";
                                String PHONE = "1111111";
                                String ORDER_DATE = "11-6-2022";
                                String MODEL = Ram.JEXX_12_13;
                                String MODEL_YEAR = String.valueOf(Product.YEAR_2021);
                                String MANUFACTURER = Product.VENGEANCE;
                                String PRICE = String.valueOf(269.0);
                                String RAM_FREQUENCY = Ram.FREQUENCY1600;
                                String RAM_SIZE = Ram.SIZE4;
                                String RAM_TYPE = Ram.DDR3;
                                String ITEMS = String.valueOf(1);

                                st = new StringTokenizer(itemString, "\t\t");
                                int countToken = st.countTokens();

                                for (int i = 0; i < countToken; i++) {
                                    token = st.nextToken();
                                    st2 = new StringTokenizer(token, " ");
                                    token2 = st2.nextToken();

                                    if (token2.equals("NUMBER")) NUMBER = st2.nextToken();
                                    if (token2.equals("NAME"))
                                        NAME = st2.nextToken(); // TODO: Make sure that the name is not spaced
                                    if (token2.equals("PHONE")) PHONE = st2.nextToken();
                                    if (token2.equals("ORDER_DATE")) ORDER_DATE = st2.nextToken();
                                    if (token2.equals("MODEL")) MODEL = st2.nextToken();
                                    if (token2.equals("MODEL_YEAR")) MODEL_YEAR = st2.nextToken();
                                    if (token2.equals("MANUFACTURER")) MANUFACTURER = st2.nextToken();
                                    if (token2.equals("PRICE")) PRICE = st2.nextToken();
                                    if (token2.equals("RAM_FREQUENCY")) RAM_FREQUENCY = st2.nextToken();
                                    if (token2.equals("RAM_SIZE")) RAM_SIZE = st2.nextToken();
                                    if (token2.equals("RAM_TYPE")) RAM_TYPE = st2.nextToken();
                                    if (token2.equals("ITEMS")) ITEMS = st2.nextToken();

                                }

                                product = new Ram();
                                ((Ram) product).setRamSize(RAM_SIZE);
                                product.setModelYear(Integer.parseInt(MODEL_YEAR));
                                ((Ram) product).setRamFrequency(RAM_FREQUENCY);
                                product.setModelName(typeOfProduct);
                                product.setModel(MODEL);

                                ((Ram) product).setRamType(RAM_TYPE);
                                product.setModelManufacturer(MANUFACTURER);
                                product.setModelPrice(Double.parseDouble(PRICE));

                                Customer customer = new Customer();
                                customer.setName(NAME);
                                customer.setPhonenumber(PHONE);

                                Order order = new Order();
                                order.setOrderedProduct(product);
                                order.setCustomer(customer);
                                order.setRandomDateOfOrder(ORDER_DATE);
                                order.setFinalCost(Double.parseDouble(PRICE));


                                shop.addOrder(order);
                                line = reader.readLine();


                                break;
                            }
                            case "Monitor": {

                                String NUMBER = String.valueOf(1);
                                String NAME = "Anna_Papazoglou";
                                String PHONE = "1111111";
                                String ORDER_DATE = "11-6-2022";
                                String MODEL = Monitor.HEXX_12_13;
                                String MODEL_YEAR = String.valueOf(Product.YEAR_2018);
                                String MANUFACTURER = Product.SAMSUNG;
                                String PRICE = String.valueOf(292.0);
                                String DIMENSIONS = Monitor.DIMENSION17;
                                String RESOLUTION = Monitor.RESOLUTION2;
                                String INTERFACES = Monitor.PORT2;
                                String ITEMS = String.valueOf(1);

                                st = new StringTokenizer(itemString, "\t\t");
                                int countToken = st.countTokens();

                                for (int i = 0; i < countToken; i++) {
                                    token = st.nextToken();
                                    st2 = new StringTokenizer(token, " ");
                                    token2 = st2.nextToken();

                                    if (token2.equals("NUMBER")) NUMBER = st2.nextToken();
                                    if (token2.equals("NAME"))
                                        NAME = st2.nextToken(); // TODO: Make sure that the name is not spaced
                                    if (token2.equals("PHONE")) PHONE = st2.nextToken();
                                    if (token2.equals("ORDER_DATE")) ORDER_DATE = st2.nextToken();
                                    if (token2.equals("MODEL")) MODEL = st2.nextToken();
                                    if (token2.equals("MODEL_YEAR")) MODEL_YEAR = st2.nextToken();
                                    if (token2.equals("MANUFACTURER")) MANUFACTURER = st2.nextToken();
                                    if (token2.equals("PRICE")) PRICE = st2.nextToken();
                                    if (token2.equals("DIMENSIONS")) DIMENSIONS = st2.nextToken();
                                    if (token2.equals("RESOLUTION")) RESOLUTION = st2.nextToken();
                                    if (token2.equals("INTERFACES")) INTERFACES = st2.nextToken();
                                    if (token2.equals("ITEMS")) ITEMS = st2.nextToken();
                                }

                                product = new Monitor();

                                ((Monitor) product).setMonitorDimensions(DIMENSIONS);
                                ((Monitor) product).setMonitorResolution(RESOLUTION);
                                ((Monitor) product).setMonitorPort(INTERFACES);
                                product.setModelName(typeOfProduct);
                                product.setModel(MODEL);
                                product.setModelYear(Integer.parseInt(MODEL_YEAR));
                                product.setModelManufacturer(MANUFACTURER);
                                product.setModelPrice(Double.parseDouble(PRICE));


                                Customer customer = new Customer();
                                customer.setName(NAME);
                                customer.setPhonenumber(PHONE);

                                Order order = new Order();
                                order.setOrderedProduct(product);
                                order.setCustomer(customer);
                                order.setRandomDateOfOrder(ORDER_DATE);
                                order.setFinalCost(Double.parseDouble(PRICE));


                                shop.addOrder(order);
                                line = reader.readLine();

                                break;
                            }
                            case "Mouse": {

                                String NUMBER = String.valueOf(1);
                                String NAME = "Anna_Papazoglou";
                                String PHONE = "1111111";
                                String ORDER_DATE = "11-6-2022";
                                String MODEL = Mouse.FEXX_12_13;
                                String MODEL_YEAR = String.valueOf(Product.YEAR_2019);
                                String MANUFACTURER = Product.SAMSUNG;
                                String PRICE = String.valueOf(262.0);
                                String MOUSE_CONNECTION = Mouse.WIRELESS;
                                String MOUSE_TECHNOLOGY = Mouse.LASER;
                                String ITEMS = String.valueOf(1);


                                st = new StringTokenizer(itemString, "\t\t");
                                int countToken = st.countTokens();

                                for (int i = 0; i < countToken; i++) {
                                    token = st.nextToken();
                                    st2 = new StringTokenizer(token, " ");
                                    token2 = st2.nextToken();

                                    if (token2.equals("NUMBER")) NUMBER = st2.nextToken();
                                    if (token2.equals("NAME"))
                                        NAME = st2.nextToken(); // TODO: Make sure that the name is not spaced
                                    if (token2.equals("PHONE")) PHONE = st2.nextToken();
                                    if (token2.equals("ORDER_DATE")) ORDER_DATE = st2.nextToken();
                                    if (token2.equals("MODEL")) MODEL = st2.nextToken();
                                    if (token2.equals("MODEL_YEAR")) MODEL_YEAR = st2.nextToken();
                                    if (token2.equals("MANUFACTURER")) MANUFACTURER = st2.nextToken();
                                    if (token2.equals("PRICE")) PRICE = st2.nextToken();
                                    if (token2.equals("MOUSE_CONNECTION")) MOUSE_CONNECTION = st2.nextToken();
                                    if (token2.equals("MOUSE_TECHNOLOGY")) MOUSE_TECHNOLOGY = st2.nextToken();
                                    if (token2.equals("ITEMS")) ITEMS = st2.nextToken();

                                }


                                product = new Mouse();
                                ((Mouse) product).setMouseTech(MOUSE_TECHNOLOGY);
                                ((Mouse) product).setMouseConnect(MOUSE_CONNECTION);
                                product.setModelName(typeOfProduct);
                                product.setModel(MODEL);
                                product.setModelYear(Integer.parseInt(MODEL_YEAR));
                                product.setModelManufacturer(MANUFACTURER);
                                product.setModelPrice(Double.parseDouble(PRICE));


                                Customer customer = new Customer();
                                customer.setName(NAME);
                                customer.setPhonenumber(PHONE);

                                Order order = new Order();
                                order.setOrderedProduct(product);
                                order.setCustomer(customer);
                                order.setRandomDateOfOrder(ORDER_DATE);
                                order.setFinalCost(Double.parseDouble(PRICE));


                                shop.addOrder(order);
                                line = reader.readLine();

                                break;
                            }
                            case "Keyboard": {

                                String NUMBER = String.valueOf(1);
                                String NAME = "Anna_Papazoglou";
                                String PHONE = "1111111";
                                String ORDER_DATE = "11-6-2022";
                                String MODEL = Keyboard.EEXX_12_13;
                                String MODEL_YEAR = String.valueOf(Product.YEAR_2021);
                                String MANUFACTURER = Product.RAZER;
                                String PRICE = String.valueOf(255.0);
                                String KEYBOARD_CONNECTION = Keyboard.WIRED;
                                String ITEMS = String.valueOf(1);


                                st = new StringTokenizer(itemString, "\t\t");
                                int countToken = st.countTokens();

                                for (int i = 0; i < countToken; i++) {
                                    token = st.nextToken();
                                    st2 = new StringTokenizer(token, " ");
                                    token2 = st2.nextToken();

                                    if (token2.equals("NUMBER")) NUMBER = st2.nextToken();
                                    if (token2.equals("NAME"))
                                        NAME = st2.nextToken(); // TODO: Make sure that the name is not spaced
                                    if (token2.equals("PHONE")) PHONE = st2.nextToken();
                                    if (token2.equals("ORDER_DATE")) ORDER_DATE = st2.nextToken();
                                    if (token2.equals("MODEL")) MODEL = st2.nextToken();
                                    if (token2.equals("MODEL_YEAR")) MODEL_YEAR = st2.nextToken();
                                    if (token2.equals("MANUFACTURER")) MANUFACTURER = st2.nextToken();
                                    if (token2.equals("PRICE")) PRICE = st2.nextToken();
                                    if (token2.equals("KEYBOARD_CONNECTION")) KEYBOARD_CONNECTION = st2.nextToken();
                                    if (token2.equals("ITEMS")) ITEMS = st2.nextToken();

                                }


                                product = new Keyboard();
                                ((Keyboard) product).setKeyboardConnect(KEYBOARD_CONNECTION);
                                product.setModelName(typeOfProduct);
                                product.setModel(MODEL);
                                product.setModelYear(Integer.parseInt(MODEL_YEAR));
                                product.setModelManufacturer(MANUFACTURER);
                                product.setModelPrice(Double.parseDouble(PRICE));

                                Customer customer = new Customer();
                                customer.setName(NAME);
                                customer.setPhonenumber(PHONE);

                                Order order = new Order();
                                order.setOrderedProduct(product);
                                order.setCustomer(customer);
                                order.setRandomDateOfOrder(ORDER_DATE);
                                order.setFinalCost(Double.parseDouble(PRICE));


                                shop.addOrder(order);
                                line = reader.readLine();

                                break;
                            }
                            case "Printer": {
                                String NUMBER = String.valueOf(1);
                                String NAME = "Anna_Papazoglou";
                                String PHONE = "1111111";
                                String ORDER_DATE = "11-6-2022";
                                String MODEL = Printer.GEXX_12_13;
                                String MODEL_YEAR = String.valueOf(Product.YEAR_2018);
                                String MANUFACTURER = Product.HP;
                                String PRICE = String.valueOf(261.0);
                                String PRINTER_TECHNOLOGY = Printer.LASER;
                                String ITEMS = String.valueOf(1);

                                st = new StringTokenizer(itemString, "\t\t");
                                int countToken = st.countTokens();

                                for (int i = 0; i < countToken; i++) {
                                    token = st.nextToken();
                                    st2 = new StringTokenizer(token, " ");
                                    token2 = st2.nextToken();

                                    if (token2.equals("NUMBER")) NUMBER = st2.nextToken();
                                    if (token2.equals("NAME"))
                                        NAME = st2.nextToken(); // TODO: Make sure that the name is not spaced
                                    if (token2.equals("PHONE")) PHONE = st2.nextToken();
                                    if (token2.equals("ORDER_DATE")) ORDER_DATE = st2.nextToken();
                                    if (token2.equals("MODEL")) MODEL = st2.nextToken();
                                    if (token2.equals("MODEL_YEAR")) MODEL_YEAR = st2.nextToken();
                                    if (token2.equals("MANUFACTURER")) MANUFACTURER = st2.nextToken();
                                    if (token2.equals("PRICE")) PRICE = st2.nextToken();
                                    if (token2.equals("PRINTER_TECHNOLOGY")) PRINTER_TECHNOLOGY = st2.nextToken();
                                    if (token2.equals("ITEMS")) ITEMS = st2.nextToken();

                                }


                                product = new Printer();
                                ((Printer) product).setPrinterTech(PRINTER_TECHNOLOGY);
                                product.setModelName(typeOfProduct);
                                product.setModel(MODEL);
                                product.setModelYear(Integer.parseInt(MODEL_YEAR));
                                product.setModelManufacturer(MANUFACTURER);
                                product.setModelPrice(Double.parseDouble(PRICE));

                                Customer customer = new Customer();
                                customer.setName(NAME);
                                customer.setPhonenumber(PHONE);

                                Order order = new Order();
                                order.setOrderedProduct(product);
                                order.setCustomer(customer);
                                order.setRandomDateOfOrder(ORDER_DATE);
                                order.setFinalCost(Double.parseDouble(PRICE));


                                shop.addOrder(order);
                                line = reader.readLine();

                                break;
                            }
                        }// switch internal
                        break;
                }// switch external

            } // while

            reader.close();
        } // try

        catch (IOException e) {
            System.err.println("Error Reading File...");
        }
    }

    private static StringTokenizer getStringTokenizer(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return new StringTokenizer(line, " ");
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        load(shop, CreateFileOrders.ORDERS_TXT);

        System.out.println(shop.displayOrders());
    }// main

}// LoadFromFileOrders