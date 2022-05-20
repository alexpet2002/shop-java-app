package com.aueb.model;

import com.aueb.model.components.specificComponents.Cpu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sale {

    static int nextSalesNum = 0;
    static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    ArrayList<Product> soldProducts = new ArrayList<>();
    Customer customer = new Customer();
    int salesNum;
    LocalDate dateOfSale = LocalDate.of(2010, 6, 15);
    double finalCost = 0;

    public Sale() {
    }

    public Sale(ArrayList<Product> soldProducts, Customer customer, LocalDate dateOfSale, double finalCost) {
        Sale.nextSalesNum++;
        this.salesNum = nextSalesNum;
        this.soldProducts = soldProducts;
        this.customer = customer;
        this.dateOfSale = dateOfSale;
        this.finalCost = finalCost;
    }


    public String toString() {
        return "Ordered Products: " + soldProducts.toString()
                .replaceFirst("\\[", "")
                .replaceFirst("]", "")
                .replaceAll(", \n", "") + " "
                + "\nCustomer name: " + customer.name + " "
                + "\nCustomer phoneumber: " + customer.phonenumber + " "
                + "\nOrder Number: " + salesNum + " "
                + "\nDate of the order: " + dateOfSale.format(myFormatObj) + " "
                + "\nFinal cost: " + finalCost;
    }

    public static void main(String[] args) {

        // Testing code
        Product p01 = new Cpu();
        Product p02 = new Cpu();
        Product p03 = new Cpu();
        Customer c = new Customer();
        ArrayList<Product> lp = new ArrayList<>();
        lp.add(p01);
        lp.add(p02);
        lp.add(p03);

        Sale order01 = new Sale(lp, c, LocalDate.of(2010, 6, 15), 0.0);
        System.out.println();
        System.out.println(order01);
        Sale order02 = new Sale(lp, c, LocalDate.of(2010, 6, 15), 0.0);
        System.out.println();
        System.out.println(order02);
        Sale order03 = new Sale(lp, c, LocalDate.of(2010, 6, 15), 0.0);
        System.out.println();
        System.out.println(order03);
        Sale order04 = new Sale(lp, c, LocalDate.of(2010, 6, 15), 0.0);
        System.out.println();
        System.out.println(order04);
        Sale order05 = new Sale(lp, c, LocalDate.of(2010, 6, 15), 0.0);
        System.out.println();
        System.out.println(order05);
        Sale order06 = new Sale(lp, c, LocalDate.of(2010, 6, 15), 0.0);
        System.out.println();
        System.out.println(order06);


    }
}// class Sale
