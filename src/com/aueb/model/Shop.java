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

    /* The stock list contains in each position an array of 2 positions.
    The first position stores the position where the product is in the list
    of products and the second position stores the stock of the specific product.
    */
    private ArrayList<int[]> stock = new ArrayList<int[]>(); // new

    ///////////////////// Methods for ArrayList products///////////////////////////

    // stores the product to list products
    void storeProduct(Product product) {
        products.add(product);
    }

    // returns size of list products
    int numberOfProducts() {
        return products.size();
    }

    // prints the list of ArrayList<product> products
    void showProducts() {
        int i = 0;
        for (Product product : products)
            System.out.println("list products at position[" + i++ + "] " + product);
    }

    // search a product in list products
    void showProduct(int productNumber) {
        if (productNumber >= 0 && productNumber < numberOfProducts())
            System.out.println("[" + productNumber + "] " + products.get(productNumber));
        else System.out.println("Product not found");
    }

    // deletes a product from the list product and from the list stock
    void removeProduct(int productNumber) {
        if (productNumber >= 0 && productNumber < numberOfProducts()) {
            products.remove(productNumber);
            stock.remove(productNumber);
            System.out.println("Product deleted!");
        } else System.out.println("Product not found!");
    }

    // returns the position of a product in list products
    int getIndexOfProduct(Product product) {
        if (products.contains(product)) {
            return products.indexOf(product);
        }
        return -1;
    }

    // returns the product
    Product getProduct(int index) {
        if (index >= 0 && index < products.size())
            return products.get(index);
        return null;
    }

    /////////// Methods for ArrayList stock////////////

    // updates the array for one product
    int[] updateStockOfProduct(Product product, int numOfProductStock) {
        int[] stockOfProduct = new int[2];
        if (products.contains(product)) {
            stockOfProduct[0] = products.indexOf(product);
            stockOfProduct[1] = numOfProductStock;
            return stockOfProduct;
        }
        return null;
    }

    // updates the list stock
    void updateStock(int[] stockOfProduct) {
        stock.add(stockOfProduct);
    }

    // prints the ArrayList<int[]> stock of the store's products
    void showStock() {
        int i = 0;
        for (int[] item : stock) {
            System.out.println("\nlist stock at position[" + i++ + "]" + products.get(item[0]) + "Stock: " + item[1] + "\n----------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

		/*Values for all kind of Product
		//these 4 arguments before the others//
		modelName: String anyName
		modelYear: int anyYear
		modelManufacturer: String anyManufacurer
		double modelPrice: double anyPrice
		*/

		/*Values for Motherboard:
		//with this order//
		processorType: "TYPE_INTEL", "TYPE_AMD"
		memoryType: "32", "64", "128"
		numOfPortsSataType: "4", "6", "8"
		*/
        Motherboard motherboard = new Motherboard("name_of_Motherboard", 0, "manufacturer", 0.0, "TYPE_INTEL", "32", "6");
        //System.out.println(motherboard);
		/*Values for Cpu:
		//with this order//
		cpuSpeed: "2.8", "3.3", "4.1"
		numOfCores: "6", "8", "16"
		cpuGraphics: true, false
		*/
        Cpu cpu = new Cpu("name_of_Cpu", 0, "manufacturer", 0.0, "2.8", "8", true);
        //System.out.println(cpu);

		/*Values of Ram:
		//with this order//
		ramType: "DDR3", "DDR4", "DDR5"
		ramSize: "4", "8", "16"
		ramFrequency: "1600", "2666", "3200"
		*/
        Ram ram = new Ram("name_of_Ram", 0, "manufacturer", 0.0, "DDR3", "8", "2666");
        //System.out.println(ram);

		/*Values of Printer
		//with this order//
		printerTech: "Laser", "Inkjet"
		printType: "Colored", "Black and White"
		*/
        Printer printer = new Printer("name_of_Printer", 0, "manufacturer", 0.0, "Laser", "Colored");
        //System.out.println(printer);

		/*Values of Mouse
		//with this order
		mouseTech: "Laser", "Optical"
		mouseConnect: "Wired", "Wireless"
		*/
        Mouse mouse = new Mouse("name_of_Mouse", 0, "manufacturer", 0.0, "Laser", "Wired");
        //System.out.println(mouse);

		/*Values of Monitor
		//with this order//
		monitorType: "Monitor", "Portable Monitor", "TV Monitor"
		monitorDimensions: "17", "24"
		monitorResolution: "1920 x 1080", "2048 x 1152"
		monitorPort: "Display Port", "HDMI", "USB-C"
		*/
        Monitor monitor = new Monitor("name_of_Monitor", 0, "manufacturer", 0.0, "Portable Monitor", "17", "1920 x 1080", "Display Port");
        //System.out.println(monitor);

		/*Values of Keyboard
		keyboardConnect: "Wired","Wireless"
		*/
        Keyboard keyboard = new Keyboard("name_of_Keyboard", 0, "manufacturer", 0.0, "Wired");
        //System.out.println(keyboard);

		/*Values of HardDrive
		//with this order//
		driveType: "HDD", "SSD"
		driveSize: "1.8", "2.5", "3.5"
		driveCapacity: "256 GB", "512 GB", "1 TB", "2 TB"
		*/
        HardDrive drive = new HardDrive("name_of_HardDrive", 0, "manufacturer", 0.0, "HDD", "1.8", "256 GB");
        //System.out.println(drive);

		/*Values of GraphicsCard
		//with this order//
		chipset: "nVIDIA", "AMD"
		cardMemory: "6", "8", "12"
		*/
        GraphicsCard card = new GraphicsCard("name_of_GraphicsCard", 0, "manufacturer", 0.0, "nVIDIA", "AMD");
        //System.out.println(card);

		/* next code puts the products into ArrayList<Product> products
		and updates the ArrayList<int[]> stock with products's stock in the Shop
		*/
        shop.storeProduct(motherboard);
        int[] stock = shop.updateStockOfProduct(motherboard, 2);
        shop.updateStock(stock);

        shop.storeProduct(cpu);
        stock = shop.updateStockOfProduct(cpu, 3);
        shop.updateStock(stock);

        shop.storeProduct(ram);
        stock = shop.updateStockOfProduct(ram, 2);
        shop.updateStock(stock);

        shop.storeProduct(card);
        stock = shop.updateStockOfProduct(card, 0);
        shop.updateStock(stock);

        shop.storeProduct(drive);
        stock = shop.updateStockOfProduct(drive, 5);
        shop.updateStock(stock);

        shop.storeProduct(monitor);
        stock = shop.updateStockOfProduct(monitor, 7);
        shop.updateStock(stock);

        shop.storeProduct(keyboard);
        stock = shop.updateStockOfProduct(keyboard, 0);
        shop.updateStock(stock);

        shop.storeProduct(mouse);
        stock = shop.updateStockOfProduct(mouse, 10);
        shop.updateStock(stock);

        shop.storeProduct(printer);
        stock = shop.updateStockOfProduct(printer, 4);
        shop.updateStock(stock);

        //shop.showProducts();
        shop.showStock();
    }
}// class Shop