

public abstract class ComputerComponent extends Product {
    // Component discount
    public static final double COMPONENT_DISCOUNT = 0.25;

    protected ComputerComponent(String modelName) {
        super(modelName);
    }

    protected ComputerComponent(String modelName, int modelYear, String modelManufacturer, double modelPrice) {
        super(modelName, modelYear, modelManufacturer, modelPrice, COMPONENT_DISCOUNT);
    }

    //toString method for Component
    public String toString() {
        return super.toString();
    }
}// class ComputerComponent