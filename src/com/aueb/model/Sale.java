package com.aueb.model;

import com.aueb.model.components.specificComponents.Cpu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sale {

    public static final LocalDate DEFAULT_DATE_OF_SALE = LocalDate.of(2022, 5, 11);
    static final DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    static int nextSalesNum = 0;
    Product soldProduct = new Cpu();
    Customer customer = new Customer();
    int salesNum;
    LocalDate dateOfSale = DEFAULT_DATE_OF_SALE;
    double finalCost = 0;

    public Sale() {
    }

    public Sale(Product soldProduct, Customer customer, LocalDate dateOfSale, double finalCost) {
        Sale.nextSalesNum++;
        this.salesNum = nextSalesNum;
        this.soldProduct = soldProduct;
        this.customer = customer;
        this.dateOfSale = dateOfSale;
        this.finalCost = finalCost;
    }


    public Sale(Product soldProduct, Customer customer) {
        Sale.nextSalesNum++;
        this.salesNum = nextSalesNum;
        this.soldProduct = soldProduct;
        this.customer = customer;
    }

    public Sale(Product soldProduct, Customer customer, double finalCost) {
        Sale.nextSalesNum++;
        this.salesNum = nextSalesNum;
        this.soldProduct = soldProduct;
        this.customer = customer;
        this.finalCost = finalCost;
    }

    public String toString() {
        return soldProduct.toString()
                + "\nCustomer name: " + customer.name + " "
                + "\nCustomer phoneumber: " + customer.phonenumber + " "
                + "\nOrder Number: " + salesNum + " "
                + "\nDate of the order: " + dateOfSale.format(myFormatObj) + " "
                + "\nFinal cost: " + finalCost + "\n";
    }

}// class Sale
