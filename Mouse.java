

public class Mouse extends ComputerPeripheral {
    public static final String NAME = "Mouse";
    public static final String OPTICAL = "Optical";
    public static final String WIRED = "Wired";
    public static final String WIRELESS = "Wireless";
    static final String LASER = "Laser";
    private static String mouseTech;
    private static String mouseConnect;
    private static int numOfMice = 0;

    public Mouse() {
        super(NAME);
        mouseTech = "";
        mouseConnect = "";
        numOfMice++;
    }

    public Mouse(String modelName, int modelYear, String modelManufacturer, double modelPrice, String mouseTech, String mouseConnect) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (mouseTech.equals("Laser"))
            setMouseTech(LASER);
        else
            setMouseTech(OPTICAL);
        if (mouseConnect.equals("Wired"))
            setMouseConnect(WIRED);
        else
            setMouseTech(WIRELESS);
        numOfMice++;
    }

    public Mouse(int modelYear, String modelManufacturer, double modelPrice, String mouseTech, String mouseConnect) {
        super(NAME, modelYear, modelManufacturer, modelPrice);
        if (mouseTech.equals("Laser"))
            setMouseTech(LASER);
        else
            setMouseTech(OPTICAL);
        if (mouseConnect.equals("Wired"))
            setMouseConnect(WIRED);
        else
            setMouseTech(WIRELESS);
        numOfMice++;
    }

    public String getMouseTech() {
        return mouseTech;
    }

    public static void setMouseTech(String Type) {
        if (Type.equals(LASER))
            mouseTech = LASER;
        else
            mouseTech = OPTICAL;
    }

    public String getMouseConnect() {
        return mouseConnect;
    }

    public static void setMouseConnect(String Type) {
        if (Type.equals(WIRED))
            mouseConnect = WIRED;
        else
            mouseConnect = WIRELESS;
    }

    @Override
    public String returnStringOfAllProperties() {
        return super.returnStringOfAllProperties() + getMouseTech() + getMouseConnect();
    }

    @Override
    public boolean sameProductAs(Product obj) {
        try {
            Mouse newObj = (Mouse) obj;
            return (newObj.getMouseTech().equals(this.getMouseTech()))
                    && (newObj.getMouseConnect().equals(this.getMouseConnect()))
                    && (newObj.getModelName().equals(this.getModelName()))
                    && (newObj.getModelYear() == this.getModelYear())
                    && (newObj.getModelManufacturer().equals(this.getModelManufacturer()));
        } catch (Exception exception) {
            return false;
        }
    }

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nMouse Technology:\t\t" + getMouseTech()
                + "\nMouse Connection:\t\t" + getMouseConnect()
                + "\n----------------------------------------------------------------";
    }
} //class Mouse
