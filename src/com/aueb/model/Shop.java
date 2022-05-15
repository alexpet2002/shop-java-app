package com.aueb.model;

import com.aueb.model.components.specificComponents.*;
import com.aueb.model.peripherals.specificPeripherals.Keyboard;
import com.aueb.model.peripherals.specificPeripherals.Monitor;
import com.aueb.model.peripherals.specificPeripherals.Mouse;
import com.aueb.model.peripherals.specificPeripherals.Printer;

import java.util.ArrayList;

public class Shop {

    static int numOfAvailableProducts = 0;
    //    double discount;
    //    Product[] availableItems; // don't need it, because we created ArrayList instead
    //    int numOfAvailableProducts;
    //    Sale[] soldItems; // must create with ArrayList too
    //    Order[] orderedItems; // must create with ArrayList too
    //    int numOfItems;
    //    Order order;
    //    Sale sale;

    // Product product = new Product(); // possible initialize arrayList of products with code in test main

    private ArrayList<Product> products = new ArrayList<Product>();

    void storeProduct(Product product) {
        products.add(product);
    }

    int numberOfProducts() {
        return products.size();
    }

    void showProducts() {
        int i = 0;
        for (Product product : products)
            System.out.println("[" + i++ + "] " + product);
    }

    void showProduct(int productNumber) {
        if (productNumber >= 0 && productNumber < numberOfProducts())
            System.out.println("[" + productNumber + "] " + products.get(productNumber));
        else System.out.println("Product not found");
    }

    void removeProduct(int productNumber) {
        if (productNumber >= 0 && productNumber < numberOfProducts()) {
            products.remove(productNumber);
            System.out.println("Product deleted!");
        } else System.out.println("Product not found!");
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

        Motherboard motherboard = new Motherboard();
        Cpu cpu = new Cpu();
        Ram ram = new Ram();
        GraphicsCard card = new GraphicsCard();
        HardDrive drive = new HardDrive();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();
        Printer printer = new Printer();

        shop.storeProduct(motherboard);
        shop.storeProduct(cpu);
        shop.storeProduct(ram);
        shop.storeProduct(card);
        shop.storeProduct(drive);
        shop.storeProduct(monitor);
        shop.storeProduct(keyboard);
        shop.storeProduct(mouse);
        shop.storeProduct(printer);

        shop.showProducts();
    }

}// class Shop