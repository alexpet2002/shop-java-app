


public class Keyboard extends ComputerPeripheral {
    public static final String NAME = "Keyboard";
    static final String WIRED = "Wired";
    static final String WIRELESS = "Wireless";
    private static String keyboardConnect;
    private static int numOfKeyboards = 0;

    public Keyboard() {
        super(NAME);
        keyboardConnect = "";
        numOfKeyboards++;
    }

    public Keyboard(String modelName, int modelYear, String modelManufacturer, double modelPrice, String keyboardConnect) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (keyboardConnect.equals("Wired"))
            setKeyboardConnect(WIRED);
        else
            setKeyboardConnect(WIRELESS);
        numOfKeyboards++;
    }

    public Keyboard(int modelYear, String modelManufacturer, double modelPrice, String keyboardConnect) {
        super(NAME, modelYear, modelManufacturer, modelPrice);
        if (keyboardConnect.equals("Wired"))
            setKeyboardConnect(WIRED);
        else
            setKeyboardConnect(WIRELESS);
        numOfKeyboards++;
    }

    public String getKeyboardConnect() {
        return keyboardConnect;
    }

    public static void setKeyboardConnect(String Type) {
        if (Type.equals(WIRED))
            keyboardConnect = WIRED;
        else
            keyboardConnect = WIRELESS;
    }

    @Override
    public String returnStringOfAllProperties() {
        return super.returnStringOfAllProperties() + getKeyboardConnect();
    }

    @Override
    public boolean sameProductAs(Product obj) {
        try {
            Keyboard newObj = (Keyboard) obj;
            return (newObj.getKeyboardConnect().equals(this.getKeyboardConnect()))
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
                + "\nKeyboard connection:\t\t" + getKeyboardConnect()
                + "\n----------------------------------------------------------------";
    }
}// class Keyboard
