/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/
public class Motherboard extends ComputerComponent {

    // Constants

    public static final String NAME = "Motherboard";
    public static final String AEXX_12_13 = "AEXX-12-13";
    public static final String TYPE_INTEL = "TYPE_INTEL";
    public static final String TYPE_AMD = "TYPE_AMD";
    public static final String MEM32 = "32";
    public static final String MEM64 = "64";
    public static final String MEM128 = "128";
    public static final String SATA4 = "4";
    public static final String SATA6 = "6";
    public static final String SATA8 = "8";
    static int numOfMotherboards = 0;
    private String processorType;
    private String memoryType;
    private String numOfPortsSataType;

    //Constructors for Motherboard

    public Motherboard() {
        numOfMotherboards++;
    }

    public Motherboard(String modelName, int modelYear, String modelManufacturer, double modelPrice) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
    }


    public Motherboard(String modelName, int modelYear, String modelManufacturer, double modelPrice, String processorType, String memoryType, String numOfPortsSataType) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (processorType.equals("TYPE_INTEL"))
            setProcessorType(TYPE_INTEL);
        else
            setProcessorType(TYPE_AMD);
        if (memoryType.equals("32"))
            setMemoryType(MEM32);
        else if (memoryType.equals("64"))
            setMemoryType(MEM64);
        else
            setMemoryType(MEM128);
        if (numOfPortsSataType.equals("4"))
            setNumOfPortsSataType(SATA4);
        else if (numOfPortsSataType.equals("6"))
            setNumOfPortsSataType(SATA6);
        else
            setNumOfPortsSataType(SATA8);
        super.setModel(AEXX_12_13);
        numOfMotherboards++;
    }

    //Getters and Setters for Motherboard

    public static int getNumOfMotherboards() {
        return numOfMotherboards;
    }

    public static void setNumOfMotherboards(int numOfMotherboards) {
        Motherboard.numOfMotherboards = numOfMotherboards;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String Type) {
        if (Type.equals(TYPE_INTEL)) {
            processorType = TYPE_INTEL;
        } else
            processorType = TYPE_AMD;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String Type) {
        if (Type.equals(MEM32))
            memoryType = MEM32;
        else if (Type.equals(MEM64))
            memoryType = MEM64;
        else
            memoryType = MEM128;
    }

    @Override
    public String returnStringOfAllProperties() {
        return super.returnStringOfAllProperties() + getProcessorType() + getMemoryType() + getNumOfPortsSataType();
    }

    public String getNumOfPortsSataType() {
        return numOfPortsSataType;
    }

    public void setNumOfPortsSataType(String Type) {
        if (Type.equals(SATA4))
            numOfPortsSataType = SATA4;
        else if (Type.equals(SATA6))
            numOfPortsSataType = SATA6;
        else
            numOfPortsSataType = SATA8;
    }

    //Method for comparing two objects using its characteristics

    public boolean sameProductAs(Product obj) {
        try {
            Motherboard newObj = (Motherboard) obj;
            return (newObj.getProcessorType().equals(this.getProcessorType()))
                    && (newObj.getMemoryType().equals(this.getMemoryType()))
                    && (newObj.getNumOfPortsSataType().equals(this.getNumOfPortsSataType()))
                    && (newObj.getModelName().equals(this.getModelName()))
                    && (newObj.getModelYear() == this.getModelYear())
                    && (newObj.getModelManufacturer().equals(this.getModelManufacturer()));
        } catch (Exception ignored) {
            return false;
        }
    }

    public String toString() {
        return "\n----------------------------------------------------------------\n"
                + super.toString()
                + "\nProcessor Type:\t\t\t" + getProcessorType()
                + "\nMemory size:\t\t\t" + getMemoryType() + " GB"
                + "\nNumber of sata ports:\t\t" + getNumOfPortsSataType() + " ports"
                + "\n----------------------------------------------------------------";
    }
}// class Motherboard

