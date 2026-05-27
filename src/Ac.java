class AC {

    String company;
    String model;
    String manager;
    String salePerson;
    String location;
    String year;
    String date;
    String day;
    String waranty;

    int price;
    int quantity;
    int user;
    int temperature;

    int users;

    double ratings;
    double weight;
    

     boolean inverter;
    boolean smartControl;
    boolean fourWaySwing;
    boolean wifiEnabled;
    boolean colorBlack;
    boolean colourWhite;
    boolean coolingFast;


    public AC(String company, String model, String manager, String salePerson, String location, String year, String date, String day, String waranty, int price, int quantity, int user, int temperature, int users, double ratings, double weight, boolean inverter, boolean smartControl, boolean fourWaySwing, boolean wifiEnabled, boolean colorBlack, boolean colourWhite, boolean coolingFast) {
        this.company = company;
        this.model = model;
        this.manager = manager;
        this.salePerson = salePerson;
        this.location = location;
        this.year = year;
        this.date = date;
        this.day = day;
        this.waranty = waranty;
        this.price = price;
        this.quantity = quantity;
        this.user = user;
        this.temperature = temperature;
        this.users = users;
        this.ratings = ratings;
        this.weight = weight;
        this.inverter = inverter;
        this.smartControl = smartControl;
        this.fourWaySwing = fourWaySwing;
        this.wifiEnabled = wifiEnabled;
        this.colorBlack = colorBlack;
        this.colourWhite = colourWhite;
        this.coolingFast = coolingFast;
    }
}
