package com.aueb.model;

import com.aueb.model.components.specificComponents.*;

import java.util.ArrayList;

public class Shop {

    static int numOfAvailableProducts = 0;
    //    double discount;
    //    Product[] availableItems;
    //    int numOfAvailableProducts;
    //    Sale[] soldItems;
    //    Order[] orderedItems;
    //    int numOfItems;
    //    Order order;
    //    Sale sale;

    Product product = new Product();

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

        shop.storeProduct(motherboard);
        shop.storeProduct(cpu);
        shop.storeProduct(ram);
        shop.storeProduct(card);
        shop.storeProduct(drive);

        shop.showProducts();
    }

}// class Shop