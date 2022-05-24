

public class Ram extends ComputerComponent {
    public static final String NAME = "Ram";
    public static final String DDR3 = "DDR3";
    public static final String DDR4 = "DDR4";
    public static final String DDR5 = "DDR5";
    public static final String SIZE4 = "4";
    public static final String SIZE8 = "8";
    public static final String SIZE16 = "16";
    public static final String FREQUENCY1600 = "1600";
    public static final String FREQUENCY2666 = "2666";
    public static final String FREQUENCY3200 = "3200";
    static int numOfRams = 0;
    private static String ramType;
    private static String ramSize;
    private static String ramFrequency;

    public Ram() {
        super(NAME);
        setRamType("");
        setRamSize("");
        setRamFrequency("");
        numOfRams++;
    }

    public Ram(String modelName, int modelYear, String modelManufacturer, double modelPrice, String ramType, String ramSize, String ramFrequency) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (ramType.equals("DDR3"))
            setRamType(DDR3);
        else if (ramType.equals("DDR4"))
            setRamType(DDR4);
        else
            setRamType(DDR5);
        if (ramSize.equals("4"))
            setRamSize(SIZE4);
        else if (ramSize.equals("8"))
            setRamSize(SIZE8);
        else
            setRamSize(SIZE16);
        if (ramFrequency.equals("1600"))
            setRamFrequency(FREQUENCY1600);
        else if (ramFrequency.equals("2666"))
            setRamFrequency(FREQUENCY2666);
        else
            setRamFrequency(FREQUENCY3200);
        numOfRams++;
    }

    public Ram(int modelYear, String modelManufacturer, double modelPrice, String ramType, String ramSize, String ramFrequency) {
        super(NAME, modelYear, modelManufacturer, modelPrice);
        if (ramType.equals("DDR3"))
            setRamType(DDR3);
        else if (ramType.equals("DDR4"))
            setRamType(DDR4);
        else
            setRamType(DDR5);
        if (ramSize.equals("4"))
            setRamSize(SIZE4);
        else if (ramSize.equals("8"))
            setRamSize(SIZE8);
        else
            setRamSize(SIZE16);
        if (ramFrequency.equals("1600"))
            setRamFrequency(FREQUENCY1600);
        else if (ramFrequency.equals("2666"))
            setRamFrequency(FREQUENCY2666);
        else
            setRamFrequency(FREQUENCY3200);
        numOfRams++;
    }

    public String getRamType() {
        return ramType;
    }

    public static void setRamType(String Type) {
        if (Type.equals(DDR3))
            ramType = DDR3;
        else if (Type.equals(DDR4))
            ramType = DDR4;
        else
            ramType = DDR5;
    }

    public String getRamSize() {
        return ramSize;
    }

    public static void setRamSize(String Type) {
        if (Type.equals(SIZE4))
            ramSize = SIZE4;
        else if (Type.equals(SIZE8))
            ramSize = SIZE8;
        else
            ramSize = SIZE16;
    }

    public String getRamFrequency() {
        return ramFrequency;
    }

    public static void setRamFrequency(String Type) {
        if (Type.equals(FREQUENCY1600))
            ramFrequency = FREQUENCY1600;
        else if (Type.equals(FREQUENCY2666))
            ramFrequency = FREQUENCY2666;
        else
            ramFrequency = FREQUENCY3200;
    }

    @Override
    public String returnStringOfAllProperties() {
        return super.returnStringOfAllProperties() + getRamType() + getRamSize() + getRamFrequency();
    }

    @Override
    public boolean sameProductAs(Product obj) {
        try {
            Ram newObj = (Ram) obj;
            return (newObj.getRamType().equals(this.getRamType()))
                    && (newObj.getRamSize().equals(this.getRamSize()))
                    && (newObj.getRamFrequency().equals(this.getRamFrequency()))
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
                + "\nRam Type:\t\t\t" + getRamType()
                + "\nRam size:\t\t\t" + getRamSize() + " GB"
                + "\nRam frequency:\t\t\t" + getRamFrequency() + " GHz\n"
                + "\n----------------------------------------------------------------";
    }

}// class Ram

