public class Bike {

    String comapanyName;
    String bikeName; // bikeName = "honda"
    int model;
    String sellerName;
    String location;
    String country;
    String buyerName;
    String contactNumber;
    String dateofManufacture;
    String year;
    String fuelType;
    String colour;
    String registrationNumber;

    int topSpeed;
    int gears;
    int fuelTankCapacity;
    int quantity;
    int units;
    int spareParts;

    double price;
    double averageRatings;
    double users;

    boolean colourBlack;
    boolean available;
    boolean sportsMode;
    boolean electric;
    boolean manualGear;
    boolean discBrakes;
    boolean kickStart;
    boolean selfStart;
    boolean gpsEnabled;

    public Bike(String comapanyName, String bikeName, int model, String sellerName, String location, String country, String buyerName, String contactNumber, String dateofManufacture, String year, String fuelType, String colour, String registrationNumber, int topSpeed, int gears, int fuelTankCapacity, int quantity, int units, int spareParts, double price, double averageRatings, double users, boolean colourBlack, boolean available, boolean sportsMode, boolean electric, boolean manualGear, boolean discBrakes, boolean kickStart, boolean selfStart, boolean gpsEnabled) {
        this.comapanyName = comapanyName;
        this.bikeName = bikeName;
        this.model = model;
        this.sellerName = sellerName;
        this.location = location;
        this.country = country;
        this.buyerName = buyerName;
        this.contactNumber = contactNumber;
        this.dateofManufacture = dateofManufacture;
        this.year = year;
        this.fuelType = fuelType;
        this.colour = colour;
        this.registrationNumber = registrationNumber;
        this.topSpeed = topSpeed;
        this.gears = gears;
        this.fuelTankCapacity = fuelTankCapacity;
        this.quantity = quantity;
        this.units = units;
        this.spareParts = spareParts;
        this.price = price;
        this.averageRatings = averageRatings;
        this.users = users;
        this.colourBlack = colourBlack;
        this.available = available;
        this.sportsMode = sportsMode;
        this.electric = electric;
        this.manualGear = manualGear;
        this.discBrakes = discBrakes;
        this.kickStart = kickStart;
        this.selfStart = selfStart;
        this.gpsEnabled = gpsEnabled;
    }


   // public static void main (String[] args) {

       // Bike b = new Bike("honda","honda",2013,"",0.8,0.6f,);


       // System.out.println(b);
    //}



}