/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/
import java.util.*;

public class Shop {
    //////////////////////////Arraylists///////////////////////////////////////
    private final ArrayList<Product> availableProducts = new ArrayList<Product>();
    private final ArrayList<Order> orders = new ArrayList<Order>();
    private final ArrayList<Sale> sales = new ArrayList<Sale>();

    //Methods for orders
    public String displayOrders() {
        return orders.toString();
    }

    public int totalAmountOfOrders() {
        return Order.nextOrderNum;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    //Methods for sales
    public String displaySales() {
        return sales.toString();
    }

    public void addSale(Sale sale) {
        sales.add(sale);
    }

    //Methods for Stock
    public void displayUniqueStock() {
        ArrayList<Product> arrayList = (ArrayList<Product>) availableProducts.clone();
        HashMap<Product, Integer> hashMap = new HashMap<Product, Integer>();

        //Method that counts the occurence of a product in the arraylist of availableProducts

        for (Product p : availableProducts) {
            int count = (int) arrayList.stream().filter(product -> p.sameProductAs(product)).count();
            if (count !=0){
                hashMap.put(p, count);
            }
            else
                hashMap.put(p, 1);

        }

        for (Map.Entry<Product, Integer> entry : hashMap.entrySet()) {
            Product key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key);
            System.out.println("The amount of this product in stock is: " + value);

        }


    }
    ///////////////////// Methods for ArrayList products///////////////////////////


    // stores the product to list products
    public void storeProduct(Product product) {
        availableProducts.add(product);
    }

    //Checks if the product(created based on user's choice) matches any products in arraylist
    public Product findMatchingAvailableProduct(Product product) {
        for (Product p : availableProducts) {
            if (p.sameProductAs(product)) {
                return p;
            }
        }
        System.out.println("Couldn't find a match");
        return null;
    }

    public void removeTheProductFromStock(Product product) {
        availableProducts.remove(product);
    }

    public int totalAmountOfSales() {
        return Sale.nextSalesNum;
    }

    public int totalAmountOfProductsInStock() {
        return availableProducts.size();
    }
}// class Shop