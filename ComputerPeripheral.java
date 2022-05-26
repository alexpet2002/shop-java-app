
public abstract class ComputerPeripheral extends Product {
    // Peripheral discount
    public static final double PERIPHERAL_DISCOUNT = 0.1;

    protected ComputerPeripheral(String modelName, int modelYear, String modelManufacturer, double modelPrice) {
        super(modelName, modelYear, modelManufacturer, modelPrice, PERIPHERAL_DISCOUNT);
    }

    //toString method for Peripheral
    public String toString() {
        return super.toString();
    }
} // class ComputerPeripheral

