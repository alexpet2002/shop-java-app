

public class Motherboard extends ComputerComponent {
    public static final String NAME = "Motherboard";
    public static final String TYPE_INTEL = "TYPE_INTEL";
    public static final String TYPE_AMD = "TYPE_AMD";
    public static final String MEM32 = "32";
    public static final String MEM64 = "64";
    public static final String MEM128 = "128";
    public static final String SATA4 = "4";
    public static final String SATA6 = "6";
    public static final String SATA8 = "8";
    static String processorType;
    static String memoryType;
    static String numOfPortsSataType;
    static int numOfMotherboards = 0;

    public Motherboard() {
        super(NAME);
        setProcessorType("");
        setMemoryType("");
        setNumOfPortsSataType("");
        numOfMotherboards++;
    }

    public Motherboard(String modelName, int modelYear, String modelManufacturer, double modelPrice) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
    }

    //Compare products of Motherboard

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
        numOfMotherboards++;
    }

    public Motherboard(int modelYear, String modelManufacturer, double modelPrice, String processorType, String memoryType, String numOfPortsSataType) {
        super(NAME, modelYear, modelManufacturer, modelPrice);
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
        numOfMotherboards++;
    }

    public static int getNumOfMotherboards() {
        return numOfMotherboards;
    }

    public static void setNumOfMotherboards(int numOfMotherboards) {
        Motherboard.numOfMotherboards = numOfMotherboards;
    }

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

    public String getProcessorType() {
        return processorType;
    }

    public static void setProcessorType(String Type) {
        if (Type.equals(TYPE_INTEL)) {
            processorType = TYPE_INTEL;
        } else
            processorType = TYPE_AMD;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public static void setMemoryType(String Type) {
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

    public static void setNumOfPortsSataType(String Type) {
        if (Type.equals(SATA4))
            numOfPortsSataType = SATA4;
        else if (Type.equals(SATA6))
            numOfPortsSataType = SATA6;
        else
            numOfPortsSataType = SATA8;
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

