/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/
public class Mouse extends ComputerPeripheral {

    // Constants

    public static final String NAME = "Mouse";
    public static final String OPTICAL = "Optical";
    public static final String WIRED = "Wired";
    public static final String WIRELESS = "Wireless";
    static final String LASER = "Laser";
    static int numOfMice = 0;
    private String mouseTech;
    private String mouseConnect;

    //Constructors for Mouse

    public Mouse(String modelName, int modelYear, String modelManufacturer, double modelPrice, String mouseTech, String mouseConnect) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (mouseTech.equals("Laser")) setMouseTech(LASER);
        else setMouseTech(OPTICAL);
        if (mouseConnect.equals("Wired")) setMouseConnect(WIRED);
        else setMouseTech(WIRELESS);
        numOfMice++;
    }

    public Mouse() {
        numOfMice++;
    }

    //Getters and Setters for Mouse

    public String getMouseTech() {
        return mouseTech;
    }

    public void setMouseTech(String Type) {
        if (Type.equals(LASER)) mouseTech = LASER;
        else mouseTech = OPTICAL;
    }

    public String getMouseConnect() {
        return mouseConnect;
    }

    public void setMouseConnect(String Type) {
        if (Type.equals(WIRED)) mouseConnect = WIRED;
        else mouseConnect = WIRELESS;
    }

    @Override
    public String returnStringOfAllProperties() {
        return super.returnStringOfAllProperties() + getMouseTech() + getMouseConnect();
    }

    //Method for comparing two objects using its characteristics

    @Override
    public boolean sameProductAs(Product obj) {
        try {
            Mouse newObj = (Mouse) obj;
            return (newObj.getMouseTech().equals(this.getMouseTech())) &&
                    (newObj.getMouseConnect().equals(this.getMouseConnect())) &&
                    (newObj.getModelName().equals(this.getModelName())) &&
                    (newObj.getModelYear() == this.getModelYear()) &&
                    (newObj.getModelManufacturer().equals(this.getModelManufacturer()));
        } catch (Exception exception) {
            return false;
        }
    }

    // toString method

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nMouse Technology:\t\t" + getMouseTech()
                + "\nMouse Connection:\t\t" + getMouseConnect()
                + "\n----------------------------------------------------------------";
    }
} //class Mouse
