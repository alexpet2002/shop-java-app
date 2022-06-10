import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LoadFromFileProducts {

    public static void load(Shop shop, String data) {
        BufferedReader reader= null;
        Product product = null;

        try{
            reader = new BufferedReader (new FileReader(data));
            String line = reader.readLine();

            while (line!=null){

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

                    line = reader.readLine();

                    st = new StringTokenizer(line, " ");
                    token = st.nextToken();


                    if (typeOfProduct.equals("HardDrive")) {

                    } else if (typeOfProduct.equals("Motherboard")) {

                    } else if (typeOfProduct.equals("GraphicsCard")) {

                        if (token.equals("\t\tMODEL")) {

                        }
                        if (token.equals("\t\tMODEL_YEAR")) {

                        }
                        if (token.equals("\t\tMANUFACTURER")) {

                        }
                        if (token.equals("\t\tPRICE")) {

                        }
                        if (token.equals("\t\tCHIPSET")) {

                        }
                        if (token.equals("\t\tMEMORY_TYPE")) {

                        }
                        if (token.equals("\t\tITEMS")) {

                        }


                    } else if (typeOfProduct.equals("Cpu")) {

                    } else if (typeOfProduct.equals("Ram")) {

                    } else if (typeOfProduct.equals("Monitor")) {

                    } else if (typeOfProduct.equals("Mouse")) {

                    } else if (typeOfProduct.equals("Keyboard")) {

                    } else if (typeOfProduct.equals("Printer")) {

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

    public static void main(String[] args) {
        Shop shop = new Shop();
        load(shop, CreateFileProducts.PRODUCTS_TXT);

        shop.getAvailableProducts();
    }
}
