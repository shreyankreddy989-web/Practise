class TV {

    String founder;
    String companyName;
    String brand;
    String model;
    String screenType;
    String resolution;
    String displayType;
    String operatingSystem;
    String processor;
    String color;
    String country;
    String sellerName;

    int screenSizeInches;
    int yearOfManufacture;
    int stock;
    int speakers;
    int hdmiPorts;
    int usbPorts;
    int volumeLevel;
    int brightnessLevel;

    double price;
    double rating;
    double discount;

    boolean smartTv;
    boolean wifiEnabled;
    boolean bluetoothEnabled;
    boolean wallMounted;
    boolean voiceControl;
    boolean androidTv;

    public TV(String founder, String companyName, String brand, String model, String screenType, String resolution, String displayType, String operatingSystem, String processor, String color, String country, String sellerName, int screenSizeInches, int yearOfManufacture, int stock, int speakers, int hdmiPorts, int usbPorts, int volumeLevel, int brightnessLevel, double price, double rating, double discount, boolean smartTv, boolean wifiEnabled, boolean bluetoothEnabled, boolean wallMounted, boolean voiceControl, boolean androidTv) {

        this.founder = founder;
        this.companyName = companyName;
        this.brand = brand;
        this.model = model;
        this.screenType = screenType;
        this.resolution = resolution;
        this.displayType = displayType;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.color = color;
        this.country = country;
        this.sellerName = sellerName;
        this.screenSizeInches = screenSizeInches;
        this.yearOfManufacture = yearOfManufacture;
        this.stock = stock;
        this.speakers = speakers;
        this.hdmiPorts = hdmiPorts;
        this.usbPorts = usbPorts;
        this.volumeLevel = volumeLevel;
        this.brightnessLevel = brightnessLevel;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
        this.smartTv = smartTv;
        this.wifiEnabled = wifiEnabled;
        this.bluetoothEnabled = bluetoothEnabled;
        this.wallMounted = wallMounted;
        this.voiceControl = voiceControl;
        this.androidTv = androidTv;
    }
}
