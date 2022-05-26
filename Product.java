public abstract class Product implements Model {

    public static final String INTEL = "Intel";
    public static final String AMD = "AMD";
    public static final String nVIDIA = "nVidia";
    public static final String CRUCIAL = "Crucial";
    public static final String VENGEANCE = "VENGEANCE";
    public static final String SAMSUNG = "Samsung";
    public static final String LG = "LG";
    public static final String HYPERX = "HYPERX";
    public static final String LOGITECH = "LOGITECH";
    public static final String RAZER = "RAZER";
    public static final String HP = "HP";
    public static final String SEAGATE = "SEAGATE";

    public static final int YEAR_2018 = 2018;
    public static final int YEAR_2019 = 2019;
    public static final int YEAR_2020 = 2020;
    public static final int YEAR_2021 = 2021;
    public static final int YEAR_2022 = 2022;

    static int nextProductNum = 0;
    int productNum;
    private String modelName = "modelName";
    private int modelYear = 0;
    private String modelManufacturer = "modelManufacturer";
    private double modelPrice = 0.0;
    private double discount = 0.2;
    private int productId;

    protected Product() {
        nextProductNum++;
    }

    protected Product(String modelName) {
        this.modelName = modelName;
    }

    protected Product(String modelName, int modelYear, String modelManufacturer, double modelPrice) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.modelManufacturer = modelManufacturer;
        this.modelPrice = modelPrice;
        this.productId = nextProductNum;
        nextProductNum++;
    }

    public Product(String modelName, int modelYear, String modelManufacturer, double modelPrice, double discount) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.modelManufacturer = modelManufacturer;
        this.modelPrice = modelPrice;
        this.discount = discount;
        this.productId = nextProductNum;
        nextProductNum++;
    }

    public static double priceBasedOnName(String model) {

        char[] c = model.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        return sum + 250.0;

    }

    public static int yearBasedOnName(String model) {

        char[] c = model.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        return sum + 2000;

    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelYear() {
        return this.modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getModelManufacturer() {
        return this.modelManufacturer;
    }

    public void setModelManufacturer(String modelManufacturer) {
        this.modelManufacturer = modelManufacturer;
    }

    public double getModelPrice() {
        return this.modelPrice;
    }

    public void setModelPrice(double modelPrice) {
        this.modelPrice = modelPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public double finalPrice() {
        return modelPrice - (modelPrice * discount);

    }

    public int getProductId() {
        return productId;
    }

    public String returnStringOfAllProperties() {
        return getModelName() + getModelManufacturer() + getModelYear();
    }

    public void setModelPriceToRandom() {
        modelPrice = priceBasedOnName(returnStringOfAllProperties());
    }

    public void setModelYearToRandom() {
        modelYear = yearBasedOnName(returnStringOfAllProperties());
    }

    public abstract boolean sameProductAs(Product obj);

    public String toString() {
        return "Model Name:\t\t\t" + getModelName() + " "
                + "\nModel productId:\t\t\t" + String.format("|%010d|", getProductId()) + " "
                + "\nModel Year:\t\t\t" + getModelYear() + " "
                + "\nModel Manufacturer:\t\t" + getModelManufacturer() + " "
                + "\nModel Price:\t\t\t" + getModelPrice();
    }
}// class Product