class Pen {

String company;
String founderName;
String model;
String manufacturer;
String year;
String month;
String date;
String penType;
String refillType;
String contactNumber;

int stock;
int soldItems;
int units;
int quantity;

double ratings;
double price;
double discount;



boolean colourBlack;
boolean inkGelType;
boolean fountainTip;
boolean availability;
boolean schoolUse;
boolean waterproofInk;
boolean refillable;

    public Pen(String company, String founderName, String model, String manufacturer, String year, String month, String date, String penType, String refillType, String contactNumber, int stock, int soldItems, int units, int quantity, double ratings, double price, double discount, boolean colourBlack, boolean inkGelType, boolean fountainTip, boolean availability, boolean schoolUse, boolean waterproofInk, boolean refillable) {
        this.company = company;
        this.founderName = founderName;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.month = month;
        this.date = date;
        this.penType = penType;
        this.refillType = refillType;
        this.contactNumber = contactNumber;
        this.stock = stock;
        this.soldItems = soldItems;
        this.units = units;
        this.quantity = quantity;
        this.ratings = ratings;
        this.price = price;
        this.discount = discount;
        this.colourBlack = colourBlack;
        this.inkGelType = inkGelType;
        this.fountainTip = fountainTip;
        this.availability = availability;
        this.schoolUse = schoolUse;
        this.waterproofInk = waterproofInk;
        this.refillable = refillable;
    }
}
