
public abstract class ComputerPeripheral extends Product {

    public static final double PERIPHERAL_DISCOUNT = 0.1;

    public ComputerPeripheral(String modelName) {
        super(modelName);
    }

    protected ComputerPeripheral() {
    }

    protected ComputerPeripheral(String modelName, int modelYear, String modelManufacturer, double modelPrice) {
        super(modelName, modelYear, modelManufacturer, modelPrice, PERIPHERAL_DISCOUNT);
    }

    public String toString() {
        return super.toString();
    }
} // class ComputerPeripheral

