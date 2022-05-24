

public class HardDrive extends ComputerComponent {
    public static final String NAME = "HardDrive";
    public static final String HDD = "HDD";
    public static final String SSD = "SSD";
    public static final String DRIVE_SIZE18 = "1.8";
    public static final String DRIVE_SIZE25 = "2.5";
    public static final String DRIVE_SIZE35 = "3.5";
    public static final String CAPACITY256 = "256 GB";
    public static final String CAPACITY512 = "512 GB";
    public static final String CAPACITY_1TB = "1 TB";
    public static final String CAPACITY_2TB = "2 TB";
    private static String driveType;
    private static String driveSize;
    private static String driveCapacity;
    private int numOfHardDrives = 0;

    public HardDrive() {
        super(NAME);
        setDriveType("");
        setDriveSize("");
        setDriveCapacity("");
        numOfHardDrives++;
    }

    public HardDrive(String modelName, int modelYear, String modelManufacturer, double modelPrice, String driveType, String driveSize, String driveCapacity) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (driveType.equals("HDD"))
            setDriveType(HDD);
        else
            setDriveType(SSD);
        if (driveSize.equals("1.8"))
            setDriveSize(DRIVE_SIZE18);
        else if (driveSize.equals("2.5"))
            setDriveSize(DRIVE_SIZE25);
        else
            setDriveSize(DRIVE_SIZE35);
        switch (driveCapacity) {
            case "256 GB":
                setDriveCapacity(CAPACITY256);
                break;
            case "512 GB":
                setDriveCapacity(CAPACITY512);
                break;
            case "1 TB":
                setDriveCapacity(CAPACITY_1TB);
                break;
            default:
                setDriveCapacity(CAPACITY_2TB);
                break;
        }
        numOfHardDrives++;
    }

    public HardDrive(int modelYear, String modelManufacturer, double modelPrice, String driveType, String driveSize, String driveCapacity) {
        super(NAME, modelYear, modelManufacturer, modelPrice);
        if (driveType.equals("HDD"))
            setDriveType(HDD);
        else
            setDriveType(SSD);
        if (driveSize.equals("1.8"))
            setDriveSize(DRIVE_SIZE18);
        else if (driveSize.equals("2.5"))
            setDriveSize(DRIVE_SIZE25);
        else
            setDriveSize(DRIVE_SIZE35);
        switch (driveCapacity) {
            case "256 GB":
                setDriveCapacity(CAPACITY256);
                break;
            case "512 GB":
                setDriveCapacity(CAPACITY512);
                break;
            case "1 TB":
                setDriveCapacity(CAPACITY_1TB);
                break;
            default:
                setDriveCapacity(CAPACITY_2TB);
                break;
        }
        numOfHardDrives++;
    }

    @Override
    public String returnStringOfAllProperties() {
        return super.returnStringOfAllProperties() + getDriveType() + getDriveSize() + getDriveCapacity();
    }

    public String getDriveType() {
        return driveType;
    }

    public static void setDriveType(String Type) {
        if (Type.equals(HDD))
            driveType = HDD;
        else
            driveType = SSD;
    }

    public String getDriveSize() {
        return driveSize;
    }

    public static void setDriveSize(String Type) {
        if (Type.equals(DRIVE_SIZE18))
            driveSize = DRIVE_SIZE18;
        else if (Type.equals(DRIVE_SIZE25))
            driveSize = DRIVE_SIZE25;
        else
            driveSize = DRIVE_SIZE35;
    }

    public String getDriveCapacity() {
        return driveCapacity;
    }

    public static void setDriveCapacity(String Type) {
        if (Type.equals(CAPACITY256))
            driveCapacity = CAPACITY256;
        else if (Type.equals(CAPACITY512))
            driveCapacity = CAPACITY512;
        else if (Type.equals(CAPACITY_1TB))
            driveCapacity = CAPACITY_1TB;
        else
            driveCapacity = CAPACITY_2TB;
    }

    @Override
    public boolean sameProductAs(Product obj) {
        try {
            HardDrive newObj = (HardDrive) obj;
            return (newObj.getDriveType().equals(this.getDriveType()))
                    && (newObj.getDriveSize().equals(this.getDriveSize()))
                    && (newObj.getDriveCapacity().equals(this.getDriveCapacity()))
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
                + "\nHard drive type:\t\t" + getDriveType()
                + "\nHard drive size:\t\t" + getDriveSize() + " inches"
                + "\nHard drive capacity:\t\t" + getDriveCapacity()
                + "\n----------------------------------------------------------------";
    }
}// class HardDrive