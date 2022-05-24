import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
    public static final LocalDate DEFAULT_DATE_OF_ORDER = LocalDate.of(2022, 5, 11);
    static int nextOrderNum = 0;
    static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    int orderNum;
    Product orderedProduct = new Cpu();
    Customer customer = new Customer();
    LocalDate dateOfOrder = DEFAULT_DATE_OF_ORDER;
    LocalDate dateOfArrival = LocalDate.of(2022, 5, 12);
    double finalCost = 0;
    OrderStatus status = OrderStatus.EXPECTED;


    public Order(Product orderedProduct, Customer customer, LocalDate dateOfArrival, double finalCost) {
        Order.nextOrderNum++;
        this.orderNum = nextOrderNum;
        this.orderedProduct = orderedProduct;
        this.customer = customer;
        this.dateOfArrival = dateOfArrival;
        this.finalCost = finalCost;
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

}// class Order
