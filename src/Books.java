 class Books{
  
String authorName;
String location;
String country;
String editorName;
String publisher;
String genre;
String name;
String edition;
String selfLocation;
String laguage;


int totalCopies;
int availableCopies;
int soldCopies;
int chapters;
int volume;
int quantity;
int pages;
int series;
int bookNumber;
int perchases;



double price;
double ratings;


boolean colourBlack;
boolean ebook;
boolean hardcover;
boolean paperbook;
boolean available;


     public Books(String authorName, String location, String country, String editorName, String publisher, String genre, String name, String edition, String selfLocation, String laguage, int totalCopies, int availableCopies, int soldCopies, int chapters, int volume, int quantity, int pages, int series, int bookNumber, int perchases, double price, double ratings, boolean colourBlack, boolean ebook, boolean hardcover, boolean paperbook, boolean available) {
         this.authorName = authorName;
         this.location = location;
         this.country = country;
         this.editorName = editorName;
         this.publisher = publisher;
         this.genre = genre;
         this.name = name;
         this.edition = edition;
         this.selfLocation = selfLocation;
         this.laguage = laguage;
         this.totalCopies = totalCopies;
         this.availableCopies = availableCopies;
         this.soldCopies = soldCopies;
         this.chapters = chapters;
         this.volume = volume;
         this.quantity = quantity;
         this.pages = pages;
         this.series = series;
         this.bookNumber = bookNumber;
         this.perchases = perchases;
         this.price = price;
         this.ratings = ratings;
         this.colourBlack = colourBlack;
         this.ebook = ebook;
         this.hardcover = hardcover;
         this.paperbook = paperbook;
         this.available = available;
     }
 }
