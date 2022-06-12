/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
    public static final LocalDate DEFAULT_DATE_OF_ORDER = LocalDate.now();
    static int nextOrderNum = 0;
    static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    int orderNum;
    Product orderedProduct = new Cpu();
    Customer customer = new Customer();
    LocalDate dateOfOrder = DEFAULT_DATE_OF_ORDER;
    LocalDate dateOfArrival = LocalDate.now();
    double finalCost = 0;
    OrderStatus status = OrderStatus.EXECUTED;

    String randomDateOfOrder = "";


    public Order(Product orderedProduct, Customer customer, LocalDate dateOfArrival, double finalCost) {
        Order.nextOrderNum++;
        this.orderNum = nextOrderNum;
        this.orderedProduct = orderedProduct;
        this.customer = customer;
        this.dateOfArrival = dateOfArrival;
        this.finalCost = finalCost;
    }

    public Order() {
        Order.nextOrderNum++;
    }

    public Order(Product orderedProduct, Customer customer, String randomDateOfOrder, double finalCost) {
        this.orderNum = nextOrderNum++;
        this.orderedProduct = orderedProduct;
        this.customer = customer;
        this.finalCost = finalCost;
        this.randomDateOfOrder = randomDateOfOrder;
    }

    public static void setNextOrderNum(int nextOrderNum) {
        Order.nextOrderNum = nextOrderNum;
    }


    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public void setFinalCost(double finalCost) {
        this.finalCost = finalCost;
    }


    public void setRandomDateOfOrder(String randomDateOfOrder) {
        this.randomDateOfOrder = randomDateOfOrder;
    }


    @Override
    public String toString() {
        return orderedProduct.toString()
                + "\nCustomer name: " + customer.name + " "
                + "\nCustomer phone number: " + customer.phonenumber + " "
                + "\nOrder Number: " + orderNum + " "
                + "\nDate of the order: " + dateOfOrder.format(myFormatObj) + " "
                + "\nDate of the arrival: " + dateOfArrival.format(myFormatObj) + " "
                + "\nFinal cost: " + finalCost + " "
                + "\nOrder status: " + status + "\n";
    }

    public Object getOrderedProduct() {
        return orderedProduct;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getRandomDateOfOrder() {
        return randomDateOfOrder;
    }

    public String getModelName() {
        return orderedProduct.getModelName();
    }
}// class Order
