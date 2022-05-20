package com.aueb.model;

import com.aueb.model.components.specificComponents.Cpu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {

    static int nextOrderNum = 0;
    static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    int orderNum;
    ArrayList<Product> orderedProducts = new ArrayList<>();
    Customer customer = new Customer();
    LocalDate dateOfOrder = LocalDate.of(2010, 6, 15);
    LocalDate dateOfArrival = LocalDate.of(2010, 6, 15);
    double finalCost = 0;
    OrderStatus status = OrderStatus.EXPECTED;


    public Order(ArrayList<Product> orderedProducts, Customer customer, LocalDate dateOfOrder, LocalDate dateOfArrival, double finalCost, OrderStatus status) {
        Order.nextOrderNum++;
        this.orderNum = nextOrderNum;
        this.orderedProducts = orderedProducts;
        this.customer = customer;
        this.dateOfOrder = dateOfOrder;
        this.dateOfArrival = dateOfArrival;
        this.finalCost = finalCost;
        this.status = status;
    }


    public void setOrderedProducts(ArrayList<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public double getFinalCost() {
        return finalCost;
    }

    public void setFinalCost(double finalCost) {
        this.finalCost = finalCost;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public static int getNextOrderNum() {
        return nextOrderNum;
    }

    public static void setNextOrderNum(int nextOrderNum) {
        Order.nextOrderNum = nextOrderNum;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(LocalDate dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static DateTimeFormatter getMyFormatObj() {
        return myFormatObj;
    }

    public static void setMyFormatObj(DateTimeFormatter myFormatObj) {
        Order.myFormatObj = myFormatObj;
    }

    protected Order() {
    }

    @Override
    public String toString() {
        return "Ordered Products: " +
                orderedProducts
                        .toString()
                        .replaceFirst("\\[", "")
                        .replaceFirst("]", "")
                        .replaceAll(", \n", "") + " "
                + "\nCustomer name: " + customer.name + " "
                + "\nCustomer phoneumber: " + customer.phonenumber + " "
                + "\nOrder Number: " + orderNum + " "
                + "\nDate of the order: " + dateOfOrder.format(myFormatObj) + " "
                + "\nDate of the arrival: " + dateOfArrival.format(myFormatObj) + " "
                + "\nFinal cost: " + finalCost + " "
                + "\nOrder status: " + status;
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

        Order order01 = new Order(lp, c, LocalDate.of(2010, 6, 15), LocalDate.of(2010, 6, 15), 0.0, OrderStatus.EXPECTED);
        System.out.println();
        System.out.println(order01);
        Order order02 = new Order(lp, c, LocalDate.of(2010, 6, 15), LocalDate.of(2010, 6, 15), 0.0, OrderStatus.EXPECTED);
        System.out.println();
        System.out.println(order02);
        Order order03 = new Order(lp, c, LocalDate.of(2010, 6, 15), LocalDate.of(2010, 6, 15), 0.0, OrderStatus.EXPECTED);
        System.out.println();
        System.out.println(order03);
        Order order04 = new Order(lp, c, LocalDate.of(2010, 6, 15), LocalDate.of(2010, 6, 15), 0.0, OrderStatus.EXPECTED);
        System.out.println();
        System.out.println(order04);
        Order order05 = new Order(lp, c, LocalDate.of(2010, 6, 15), LocalDate.of(2010, 6, 15), 0.0, OrderStatus.EXPECTED);
        System.out.println();
        System.out.println(order05);
        Order order06 = new Order(lp, c, LocalDate.of(2010, 6, 15), LocalDate.of(2010, 6, 15), 0.0, OrderStatus.EXPECTED);
        System.out.println();
        System.out.println(order06);


    }
}// class Order
