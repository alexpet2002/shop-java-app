/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/
public abstract class ComputerPeripheral extends Product {
    // Peripheral discount
    public static final double PERIPHERAL_DISCOUNT = 0.1;

    // Constructors for ComputerPeripheral
    public ComputerPeripheral(String modelName, int modelYear, String modelManufacturer, double modelPrice) {
        super(modelName, modelYear, modelManufacturer, modelPrice, PERIPHERAL_DISCOUNT);
    }

    public ComputerPeripheral() {
    }

    //toString method for Peripheral
    public String toString() {
        return super.toString();
    }
} // class ComputerPeripheral

