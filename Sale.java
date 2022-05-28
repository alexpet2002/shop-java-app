/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sale {

    public static final LocalDate DEFAULT_DATE_OF_SALE = LocalDate.now();
    static final DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    static int nextSalesNum = 0;
    Product soldProduct = new Cpu();
    Customer customer = new Customer();
    int salesNum;
    LocalDate dateOfSale = DEFAULT_DATE_OF_SALE;
    double finalCost = 0;

    //Constructors for Sale


    public Sale(Product soldProduct, Customer customer, double finalCost) {
        Sale.nextSalesNum++;
        this.salesNum = nextSalesNum;
        this.soldProduct = soldProduct;
        this.customer = customer;
        this.finalCost = finalCost;
    }

    public Sale() {
        Sale.nextSalesNum++;
    }

    // toString method

    public String toString() {
        return soldProduct.toString()
                + "\nCustomer name: " + customer.name + " "
                + "\nCustomer phonenumber: " + customer.phonenumber + " "
                + "\nOrder Number: " + salesNum + " "
                + "\nDate of the sale: " + dateOfSale.format(myFormatObj) + " "
                + "\nFinal cost: " + finalCost + "\n";
    }

}// class Sale
