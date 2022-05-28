/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/
public abstract class ComputerComponent extends Product {
    // Component discount
    public static final double COMPONENT_DISCOUNT = 0.25;

    //Constructors for ComputerComponent
    protected ComputerComponent(String modelName) {
        super(modelName);
    }

    protected ComputerComponent(String modelName, int modelYear, String modelManufacturer, double modelPrice) {
        super(modelName, modelYear, modelManufacturer, modelPrice, COMPONENT_DISCOUNT);
    }

    public ComputerComponent() {
    }

    //toString method for Component
    public String toString() {
        return super.toString();
    }
}// class ComputerComponent