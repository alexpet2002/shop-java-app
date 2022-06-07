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

                StringTokenizer st = new StringTokenizer(line,"#");
                String token = st.nextToken();
                if (token.equals("CD")){
                    // CD("Four","Led Zeppelin", 6, 55,23.95);
                    product = new Cpu();

//                    product.setsetTitle(st.nextToken());
//                    ((CD) product).setArtist(st.nextToken());
//                    ((CD) product).setNumberOfTracks(Integer.parseInt(st.nextToken()));
//                    product.setplayingTime(Integer.parseInt(st.nextToken()));
//                    product.setPrice(Float.parseFloat(st.nextToken()));
                }
                else if (token.equals("DVD")){
                    // DVD#Match Point#woody allen#Jonathan Rhys Meyers#90
//                    product = new DVD();
//                    product.setTitle(st.nextToken());
//                    ((DVD)product).setDirector(st.nextToken());
//                    ((DVD)product).setStar(st.nextToken());
//                    product.setplayingTime(Integer.parseInt(st.nextToken()));
//                    product.setPrice(Float.parseFloat(st.nextToken()));
                }

                shop.storeProduct (product);
                line = reader.readLine();

            } // while

            reader.close();
        } // try

        catch (IOException e){
            System.err.println("Error Reading File...");
        }
    }
}
