/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/
public class Monitor extends ComputerPeripheral {

    // Constants

    public static final String NAME = "Monitor";
    public static final String MONITOR = "Monitor";
    public static final String PORTABLE_MONITOR = "Portable Monitor";
    public static final String TV_MONITOR = "TV Monitor";
    public static final String DIMENSION17 = "17";
    public static final String DIMENSION24 = "24";
    public static final String RESOLUTION1 = "1920 x 1080";
    public static final String RESOLUTION2 = "2048 x 1152";
    public static final String PORT1 = "Display Port";
    public static final String PORT2 = "HDMI";
    public static final String PORT3 = "USB-C";
    static int numOfMonitors = 0;
    private String monitorType;
    private String monitorDimensions;
    private String monitorResolution;
    private String monitorPort;

    //Constructors for Monitor

    public Monitor(String modelName, int modelYear, String modelManufacturer, double modelPrice, String monitorType, String monitorDimensions, String monitorResolution, String monitorPort) {
        super(modelName, modelYear, modelManufacturer, modelPrice);
        if (monitorType.equals("Monitor"))
            setMonitorType(MONITOR);
        else if (monitorType.equals("Portable Monitor"))
            setMonitorType(PORTABLE_MONITOR);
        else
            setMonitorType(TV_MONITOR);
        if (monitorDimensions.equals("17"))
            setMonitorDimensions(DIMENSION17);
        else
            setMonitorDimensions(DIMENSION24);
        if (monitorResolution.equals("1920 x 1080"))
            setMonitorResolution(RESOLUTION1);
        else
            setMonitorResolution(RESOLUTION2);
        if (monitorPort.equals("Display Port"))
            setMonitorPort(PORT1);
        else if (monitorPort.equals("HDMI"))
            setMonitorPort(PORT2);
        else
            setMonitorPort(PORT3);
        numOfMonitors++;
    }

    public Monitor() {
        numOfMonitors++;
    }

    //Getters and Setters for Monitor

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String Type) {
        if (Type.equals(MONITOR))
            monitorType = MONITOR;
        else if (Type.equals(PORTABLE_MONITOR))
            monitorType = PORTABLE_MONITOR;
        else
            monitorType = TV_MONITOR;
    }

    public String getMonitorDimensions() {
        return monitorDimensions;
    }

    public void setMonitorDimensions(String Type) {
        if (Type.equals(DIMENSION17))
            monitorDimensions = DIMENSION17;
        else
            monitorDimensions = DIMENSION24;
    }

    public String getMonitorResolution() {
        return monitorResolution;
    }

    public void setMonitorResolution(String Type) {
        if (Type.equals(RESOLUTION1))
            monitorResolution = RESOLUTION1;
        else
            monitorResolution = RESOLUTION2;
    }

    public String getMonitorPort() {
        return monitorPort;
    }

    public void setMonitorPort(String Type) {
        if (Type.equals(PORT1))
            monitorPort = PORT1;
        else if (Type.equals(PORT2))
            monitorPort = PORT2;
        else
            monitorPort = PORT3;
    }

    @Override
    public String returnStringOfAllProperties() {
        return super.returnStringOfAllProperties() + getMonitorPort() + getMonitorDimensions() + getMonitorResolution() + getMonitorType();
    }

    //Method for comparing two objects using its characteristics

    @Override
    public boolean sameProductAs(Product obj) {
        try {
            Monitor newObj = (Monitor) obj;
            return (newObj.getMonitorType().equals(this.getMonitorType()))
                    && (newObj.getMonitorDimensions().equals(this.getMonitorDimensions()))
                    && (newObj.getMonitorResolution().equals(this.getMonitorResolution()))
                    && (newObj.getMonitorPort().equals(this.getMonitorPort()))
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
                + "Monitor Type:\t\t\t" + getMonitorType() + "\n"
                + "Monitor Dimensions:\t\t" + getMonitorDimensions() + " inches\n"
                + "Monitor Resolution:\t\t" + getMonitorResolution() + "\n"
                + "Monitor Port:\t\t\t" + getMonitorPort()
                + "\n----------------------------------------------------------------";
    }
}// class Monitor



