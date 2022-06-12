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
    String randomDateOfSale = "";
    public Sale(Product soldProduct, Customer customer, double finalCost) {
        Sale.nextSalesNum++;
        this.salesNum = nextSalesNum;
        this.soldProduct = soldProduct;
        this.customer = customer;
        this.finalCost = finalCost;
    }

    public Sale(Product soldProduct, Customer customer, String randomDateOfSale, double finalCost) {
        Sale.nextSalesNum++;
        this.soldProduct = soldProduct;
        this.customer = customer;
        this.salesNum = nextSalesNum;
        this.randomDateOfSale = randomDateOfSale;
        this.finalCost = finalCost;

    }

    public static void setNextSalesNum(int nextSalesNum) {
        Sale.nextSalesNum = nextSalesNum;
    }

    public void setSoldProduct(Product soldProduct) {
        this.soldProduct = soldProduct;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setSalesNum(int salesNum) {
        this.salesNum = salesNum;
    }

    public void setDateOfSale(LocalDate dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public void setFinalCost(double finalCost) {
        this.finalCost = finalCost;
    }

    public void setRandomDateOfSale(String randomDateOfSale) {
        this.randomDateOfSale = randomDateOfSale;
    }

    public Product getSoldProduct() {
        return soldProduct;
    }
//Constructors for Sale


    public Sale() {
        Sale.nextSalesNum++;
    }

    public int getSalesNum() {
        return salesNum;
    }

    // toString method

    public String toString() {
        return soldProduct.toString()
                + "\nCustomer name: " + customer.name + " "
                + "\nCustomer phonenumber: " + customer.phonenumber + " "
                + "\nSale Number: " + salesNum + " "
                + "\nDate of the sale: " + dateOfSale.format(myFormatObj) + " "
                + "\nFinal cost: " + finalCost + "\n";
    }

    public String getRandomDateOfSale() {
        return randomDateOfSale;
    }


    public Customer getCustomer() {
        return customer;
    }
}// class Sale
