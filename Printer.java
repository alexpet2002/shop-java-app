

public class Printer extends ComputerPeripheral {

    // Constants

    public static final String NAME = "Printer";
    public static final String LASER = "Laser";
    public static final String INKJET = "Inkjet";
    public static final String COLORED = "Colored";
    public static final String BLACK_WHITE = "Black_and_White";
    private static String printerTech;
    private static String printType;
    private static int numOfPrinters = 0;

    //Constructors for Printer

    public Printer() {
        super(NAME);
        printerTech = "";
        printType = "";
        numOfPrinters++;
    }

    public Printer(String modelName, int modelYear, String modelManufacturer, double modelPrice, String printerTech, String printType) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (printerTech.equals("Laser"))
            setPrinterTech(LASER);
        else
            setPrinterTech(INKJET);
        if (printType.equals("Colored"))
            setPrintType(COLORED);
        else
            setPrintType(BLACK_WHITE);
        numOfPrinters++;
    }

    public Printer(int modelYear, String modelManufacturer, double modelPrice, String printerTech, String printType) {
        super(NAME, modelYear, modelManufacturer, modelPrice);
        if (printerTech.equals("Laser"))
            setPrinterTech(LASER);
        else
            setPrinterTech(INKJET);
        if (printType.equals("Colored"))
            setPrintType(COLORED);
        else
            setPrintType(BLACK_WHITE);
        numOfPrinters++;
    }

    //Getters and Setters for Printer

    public String getPrinterTech() {
        return printerTech;
    }

    public static void setPrinterTech(String Type) {
        if (Type.equals(LASER))
            printerTech = LASER;
        else
            printerTech = INKJET;
    }

    public String getPrintType() {
        return printType;
    }

    public static void setPrintType(String Type) {
        if (Type.equals(COLORED))
            printType = COLORED;
        else
            printType = BLACK_WHITE;
    }

    @Override
    public String returnStringOfAllProperties() {
        return super.returnStringOfAllProperties() + getPrintType() + getPrinterTech();
    }

    //Method for comparing two objects using its characteristics

    @Override
    public boolean sameProductAs(Product obj) {
        try {
            Printer newObj = (Printer) obj;
            return (newObj.getPrinterTech().equals(this.getPrinterTech()))
                    && (newObj.getPrintType().equals(this.getPrintType()))
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
                + "\nPrinter Technology:\t\t" + getPrinterTech()
                + "\nPrinting Type:\t\t\t" + getPrintType()
                + "\n----------------------------------------------------------------";
    }
}// class Printer
