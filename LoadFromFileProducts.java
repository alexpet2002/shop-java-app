import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LoadFromFileProducts {

    public static void load(Shop shop, String data) {
        BufferedReader reader = null;
        Product product = null;

        try {
            reader = new BufferedReader(new FileReader(data));
            String line = reader.readLine();

            while (line != null) {

                StringTokenizer st = new StringTokenizer(line, " ");
                String token = st.nextToken();

                if (token.equals("ITEM_LIST")) {
                    line = reader.readLine();
                } else if (token.equals("{")) {
                    line = reader.readLine();
                } else if (token.equals("}")) {
                    line = reader.readLine();
                } else if (token.equals("\tITEM")) {
                    String typeOfProduct = null;
                    line = reader.readLine();
                    line = reader.readLine();

                    st = new StringTokenizer(line, " ");
                    token = st.nextToken();


                    if (token.equals("\t\tITEM_TYPE")) {
                        typeOfProduct = st.nextToken();
                    }

                    if (typeOfProduct.equals("HardDrive")) {

                    } else if (typeOfProduct.equals("Motherboard")) {

                        String MODEL = null;
                        String MODEL_YEAR = null;
                        String MANUFACTURER = null;
                        String PRICE = null;
                        String PROCESSOR_TYPE = null;
                        String MEMORY_TYPE = null;
                        String NUMBER_OF_SATA_TYPE = null;
                        String ITEMS = null;


                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL")) MODEL = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL_YEAR")) MODEL_YEAR = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMANUFACTURER")) MANUFACTURER = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tPRICE")) PRICE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tPROCESSOR_TYPE")) PROCESSOR_TYPE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMEMORY_TYPE")) MEMORY_TYPE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tNUMBER_OF_SATA_TYPE")) NUMBER_OF_SATA_TYPE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tITEMS")) ITEMS = st.nextToken();


                        product = new Motherboard();
                        ((Motherboard) product).setMemoryType(MEMORY_TYPE);
                        ((Motherboard) product).setProcessorType(PROCESSOR_TYPE);
//                        product.setProductId();
//                        ((Motherboard) product).setNumOfMotherboards(); // TODO: Missing from imported file
                        ((Motherboard) product).setNumOfPortsSataType(NUMBER_OF_SATA_TYPE);
                        product.setModelName(MODEL);
                        product.setModelYear(Integer.parseInt(MODEL_YEAR));
                        product.setModelManufacturer(MANUFACTURER);
                        product.setModelPrice(Double.parseDouble(PRICE));
//                        product.setDiscount();

                        shop.storeProduct(product);

                    } else if (typeOfProduct.equals("GraphicsCard")) {

                        String MODEL = null;
                        String MODEL_YEAR = null;
                        String MANUFACTURER = null;
                        String PRICE = null;
                        String CHIPSET = null;
                        String MEMORY_TYPE = null;
                        String ITEMS = null;


                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL")) MODEL = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL_YEAR")) MODEL_YEAR = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMANUFACTURER")) MANUFACTURER = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tPRICE")) PRICE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tCHIPSET")) CHIPSET = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMEMORY_TYPE")) MEMORY_TYPE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tITEMS")) ITEMS = st.nextToken();

                        product = new GraphicsCard();
                        ((GraphicsCard) product).setCardMemory(MEMORY_TYPE);
                        product.setModelName(MODEL);
                        ((GraphicsCard) product).setChipset(CHIPSET);
                        product.setModelManufacturer(MANUFACTURER);
                        product.setModelYear(Integer.parseInt(MODEL_YEAR));
                        product.setModelPrice(Double.parseDouble(PRICE));
//                        product.setDiscount();
//                        product.setProductId();

                        shop.storeProduct(product);

                    } else if (typeOfProduct.equals("Cpu")) {

                        String MODEL = null;
                        String MODEL_YEAR = null;
                        String MANUFACTURER = null;
                        String PRICE = null;
                        String CPU_SPEED = null;
                        String NUMBER_OF_CORES = null;
                        String CPU_GRAPHICS = null;
                        String ITEMS = null;


                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL")) MODEL = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL_YEAR")) MODEL_YEAR = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMANUFACTURER")) MANUFACTURER = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tPRICE")) PRICE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tCPU_SPEED")) CPU_SPEED = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tNUMBER_OF_CORES")) NUMBER_OF_CORES = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tCPU_GRAPHICS")) CPU_GRAPHICS = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tITEMS")) ITEMS = st.nextToken();

                        product = new Cpu();
//                        product.setDiscount();
                        ((Cpu) product).setNumOfCores(NUMBER_OF_CORES);
                        ((Cpu) product).setCpuGraphics(Boolean.parseBoolean(CPU_GRAPHICS));
                        product.setModelYear(Integer.parseInt(MODEL_YEAR));
                        product.setModelManufacturer(MANUFACTURER);
                        ((Cpu) product).setCpuSpeed(CPU_SPEED);
                        product.setModelName(MODEL);
                        product.setModelPrice(Double.parseDouble(PRICE));
//                        product.setProductId();
                        shop.storeProduct(product);

                    } else if (typeOfProduct.equals("Ram")) {

                        String MODEL = null;
                        String MODEL_YEAR = null;
                        String MANUFACTURER = null;
                        String PRICE = null;
                        String RAM_FREQUENCY = null;
                        String RAM_SIZE = null;
                        String RAM_TYPE = null;
                        String ITEMS = null;

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL")) MODEL = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL_YEAR")) MODEL_YEAR = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMANUFACTURER")) MANUFACTURER = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tPRICE")) PRICE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tRAM_FREQUENCY")) RAM_FREQUENCY = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tRAM_SIZE")) RAM_SIZE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tRAM_TYPE")) RAM_TYPE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tITEMS")) ITEMS = st.nextToken();

                        product = new Ram();
                        ((Ram) product).setRamSize(RAM_SIZE);
                        product.setModelYear(Integer.parseInt(MODEL_YEAR));
                        ((Ram) product).setRamFrequency(RAM_FREQUENCY);
                        product.setModelName(MODEL);
//                        product.setDiscount();
                        ((Ram) product).setRamType(RAM_TYPE);
                        product.setModelManufacturer(MANUFACTURER);
                        product.setModelPrice(Double.parseDouble(PRICE));
//                        product.setProductId();

                        shop.storeProduct(product);


                    } else if (typeOfProduct.equals("Monitor")) {

                        String MODEL = null;
                        String MODEL_YEAR = null;
                        String MANUFACTURER = null;
                        String PRICE = null;
                        String DIMENSIONS = null;
                        String RESOLUTION = null;
                        String INTERFACES = null;
                        String ITEMS = null;

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL")) MODEL = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL_YEAR")) MODEL_YEAR = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMANUFACTURER")) MANUFACTURER = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tPRICE")) PRICE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tDIMENSIONS")) DIMENSIONS = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tRESOLUTION")) RESOLUTION = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tINTERFACES")) INTERFACES = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tITEMS")) ITEMS = st.nextToken();


                        product = new Monitor();
//                        product.setProductId();
//                        ((Monitor) product).setMonitorType(); // TODO: Missing in the file
                        ((Monitor) product).setMonitorDimensions(DIMENSIONS);
                        ((Monitor) product).setMonitorResolution(RESOLUTION);
                        ((Monitor) product).setMonitorPort(INTERFACES);
                        product.setModelName(MODEL);
                        product.setModelYear(Integer.parseInt(MODEL_YEAR));
                        product.setModelManufacturer(MANUFACTURER);
                        product.setModelPrice(Double.parseDouble(PRICE));
//                        product.setDiscount();


                        shop.storeProduct(product);
                    } else if (typeOfProduct.equals("Mouse")) {

                        String MODEL = null;
                        String MODEL_YEAR = null;
                        String MANUFACTURER = null;
                        String PRICE = null;
                        String MOUSE_CONNECTION = null;
                        String MOUSE_TECHNOLOGY = null;
                        String ITEMS = null;

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL")) MODEL = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL_YEAR")) MODEL_YEAR = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMANUFACTURER")) MANUFACTURER = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tPRICE")) PRICE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMOUSE_CONNECTION")) MOUSE_CONNECTION = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMOUSE_TECHNOLOGY")) MOUSE_TECHNOLOGY = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tITEMS")) ITEMS = st.nextToken();


                        product = new Mouse();
                        ((Mouse) product).setMouseTech(MOUSE_TECHNOLOGY);
                        ((Mouse) product).setMouseConnect(MOUSE_CONNECTION);
                        product.setModelName(MODEL);
                        product.setModelYear(Integer.parseInt(MODEL_YEAR));
                        product.setModelManufacturer(MANUFACTURER);
                        product.setModelPrice(Double.parseDouble(PRICE));
//                        product.setDiscount();
//                        product.setProductId();

                        shop.storeProduct(product);
                    } else if (typeOfProduct.equals("Keyboard")) {


                        String MODEL = null;
                        String MODEL_YEAR = null;
                        String MANUFACTURER = null;
                        String PRICE = null;
                        String KEYBOARD_CONNECTION = null;
                        String ITEMS = null;

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL")) MODEL = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL_YEAR")) MODEL_YEAR = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMANUFACTURER")) MANUFACTURER = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tPRICE")) PRICE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tKEYBOARD_CONNECTION")) KEYBOARD_CONNECTION = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tITEMS")) ITEMS = st.nextToken();

                        product = new Keyboard();
                        ((Keyboard) product).setKeyboardConnect(KEYBOARD_CONNECTION);
                        product.setModelName(MODEL);
                        product.setModelYear(Integer.parseInt(MODEL_YEAR));
                        product.setModelManufacturer(MANUFACTURER);
                        product.setModelPrice(Double.parseDouble(PRICE));
//                        product.setDiscount();
//                        product.setProductId();

                        shop.storeProduct(product);
                    } else if (typeOfProduct.equals("Printer")) {

                        String MODEL = null;
                        String MODEL_YEAR = null;
                        String MANUFACTURER = null;
                        String PRICE = null;
                        String PRINTER_TECHNOLOGY = null;
                        String ITEMS = null;

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL")) MODEL = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMODEL_YEAR")) MODEL_YEAR = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tMANUFACTURER")) MANUFACTURER = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tPRICE")) PRICE = st.nextToken();

                        st = getStringTokenizer(reader);
                        token = st.nextToken();
                        if (token.equals("\t\tPRINTER_TECHNOLOGY")) PRINTER_TECHNOLOGY = st.nextToken();


                        product = new Printer();
                        ((Printer) product).setPrinterTech(PRINTER_TECHNOLOGY);
//                        ((Printer) product).setPrintType(); // TODO: Missing in the file
                        product.setModelName(MODEL);
                        product.setModelYear(Integer.parseInt(MODEL_YEAR));
                        product.setModelManufacturer(MANUFACTURER);
                        product.setModelPrice(Double.parseDouble(PRICE));
//                        product.setDiscount();
//                        product.setProductId();

                        shop.storeProduct(product);
                    }


                } else if (token.equals("CD")) {
                    // CD("Four","Led Zeppelin", 6, 55,23.95);
                    product = new Cpu();

//                    product.setsetTitle(st.nextToken());
//                    ((CD) product).setArtist(st.nextToken());
//                    ((CD) product).setNumberOfTracks(Integer.parseInt(st.nextToken()));
//                    product.setplayingTime(Integer.parseInt(st.nextToken()));
//                    product.setPrice(Float.parseFloat(st.nextToken()));
                } else if (token.equals("DVD")) {
                    // DVD#Match Point#woody allen#Jonathan Rhys Meyers#90
//                    product = new DVD();
//                    product.setTitle(st.nextToken());
//                    ((DVD)product).setDirector(st.nextToken());
//                    ((DVD)product).setStar(st.nextToken());
//                    product.setplayingTime(Integer.parseInt(st.nextToken()));
//                    product.setPrice(Float.parseFloat(st.nextToken()));
                }

//                shop.storeProduct (product);

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
        load(shop, CreateFileProducts.PRODUCTS_TXT);

        shop.getAvailableProducts();
    }
}
