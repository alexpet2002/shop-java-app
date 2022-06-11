/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/
public class GraphicsCard extends ComputerComponent {

    // Constants
    public static final String NAME = "GraphicsCard";
    public static final String CEXX_12_13 = "CEXX-12-13";
    public static final String NVIDIA = "nVIDIA";
    public static final String AMD = "AMD";
    public static final String MEM6 = "6";
    public static final String MEM8 = "8";
    public static final String MEM12 = "12";
    static int numOfGraphicsCards = 0;
    private String chipset;
    private String cardMemory;


    //Constructors for GraphicsCard

    public GraphicsCard(String modelName, int modelYear, String modelManufacturer, double modelPrice, String chipset, String cardMemory) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (chipset.equals("nVIDIA"))
            setChipset(NVIDIA);
        else
            setChipset(AMD);
        if (cardMemory.equals("6"))
            setCardMemory(MEM6);
        else if (cardMemory.equals("8"))
            setCardMemory(MEM8);
        else
            setCardMemory(MEM12);
        numOfGraphicsCards++;
        super.setModel(CEXX_12_13);
    }

    public GraphicsCard() {
        numOfGraphicsCards++;
    }


    //Getters and Setters for GraphicsCard
    public String getChipset() {
        return chipset;
    }

    public void setChipset(String Type) {
        if (Type.equals(NVIDIA))
            chipset = NVIDIA;
        else
            chipset = AMD;
    }

    public String getCardMemory() {
        return cardMemory;
    }

    public void setCardMemory(String Type) {
        if (Type.equals(MEM6))
            cardMemory = MEM6;
        else if (Type.equals(MEM8))
            cardMemory = MEM8;
        else
            cardMemory = MEM12;
    }

    @Override
    public String returnStringOfAllProperties() {
        return super.returnStringOfAllProperties() + getChipset() + getCardMemory();
    }


    //Method for comparing two objects using its characteristics
    @Override
    public boolean sameProductAs(Product obj) {
        try {
            GraphicsCard newObj = (GraphicsCard) obj;
            return (newObj.getChipset().equals(this.getChipset()))
                    && (newObj.getCardMemory().equals(this.getCardMemory()))
                    && (newObj.getModelName().equals(this.getModelName()))
                    && (newObj.getModelYear() == this.getModelYear())
                    && (newObj.getModelManufacturer().equals(this.getModelManufacturer()));
        } catch (Exception exception) {
            return false;
        }
    }

    // toString method

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nChipset Type:\t\t\t" + getChipset()
                + "\nGraphics card memory size:\t" + getCardMemory() + " GB"
                + "\n----------------------------------------------------------------";

    }
}// class GraphicsCard