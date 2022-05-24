import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    static int numOfAvailableProducts = 0;

    private final ArrayList<Product> availableProducts = new ArrayList<Product>();
    private final ArrayList<Order> orders = new ArrayList<Order>();
    private final ArrayList<Sale> sales = new ArrayList<Sale>();

    /* The productNames HashMap contains increment integers as keys and modelNames as values */
    private final HashMap<Integer, String> productNames = new HashMap<Integer, String>();    // new

    /* The productStock HashMap contains modelNames as keys and stock of specific model as values */
    private final HashMap<String, Integer> productStock = new HashMap<String, Integer>(); // new

    ////////////////////// Methods for HashMap productNames ///////////////////////

    // initialize HashMap ProductNames and put keys(increment number) and values(modelNames) witch exists in products list

    public String displayOrders() {
        return orders.toString();
    }

    public int totalAmountOfOrders() {
        return Order.nextOrderNum;
    }

    public String displaySales() {
        return sales.toString();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String displayTotalStock() {
        return availableProducts.toString();
    }

    public void displayUniqueStock() {
        ArrayList<Product> arrayList = (ArrayList<Product>) availableProducts.clone();
        HashMap<Product, Integer> hashMap = new HashMap<Product, Integer>();


        for (Product p : availableProducts) {
            int count = (int) arrayList.stream().filter(product -> p.sameProductAs(product)).count();
            hashMap.put(p, count);
        }

        for (Map.Entry<Product, Integer> entry : hashMap.entrySet()) {
            Product key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key);
            System.out.println("The amount of this product in stock is: " + value);

        }


    }

    public void addSale(Sale sale) {
        sales.add(sale);
    }

    public void setProductNames(ArrayList<Product> products) {
        int i = 0;
        for (Product product : products) {
            productNames.put(i, product.getModelName());
            i++;
        }
    }

    // remove from HashMap ProductNames
    public void removeProductName(Integer number) {
        productNames.remove(number);
    }

    ///////////////////// Methods for HashMap productStock /////////////////////////

    // might not be needed
    public void setProductStock(Product product) {
        if (productStock.containsKey(product.getModelName())) {
            int value = productStock.get(product.getModelName()) + 1;
            productStock.replace(product.getModelName(), value);
        } else
            productStock.put(product.getModelName(), 1);
    }

    // decrease value of stock
    public void updateStock(String key, HashMap<String, Integer> stockMap) {
        int value = stockMap.get(key) - 1;
        stockMap.replace(key, value);
    }
    ///////////////////// Methods for ArrayList products///////////////////////////

    // stores the product to list products
    public void storeProduct(Product product) {
        availableProducts.add(product);
    }

    // prints the list of ArrayList<product> products
    public void showProducts() {
        int i = 0;
        for (Product product : availableProducts)
            System.out.println("list products at position[" + i++ + "] " + product);
    }

    // search a product in list products
    public void showProduct(int productNumber) {
        if (productNumber >= 0 && productNumber < totalAmountOfProductsInStock())
            System.out.println("[" + productNumber + "] " + availableProducts.get(productNumber));
        else System.out.println("Product not found");
    }

    // deletes a product from the list product and from the list stock
    public void removeProduct(int productNumber) {
        if (productNumber >= 0 && productNumber < totalAmountOfProductsInStock()) {
            availableProducts.remove(productNumber);
            //stock.remove(productNumber);
            System.out.println("Product deleted!");
        } else System.out.println("Product not found!");
    }

    // returns the position of a product in list products
    public int getIndexOfProduct(Product product) {
        if (availableProducts.contains(product)) {
            return availableProducts.indexOf(product);
        }
        return -1;
    }

    // returns the product
    public Product getProduct(int index) {
        if (index >= 0 && index < availableProducts.size())
            return availableProducts.get(index);
        return null;
    }

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