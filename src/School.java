public class School {

 
    String schoolName;
    String founderName;
    String principalName;
    String address;
    String city;
    String state;
    String country;
    String boardType;
    String medium;
    String email;
    String website;

    int schoolId;
    int totalStudents;
    int totalTeachers;
    int totalClasses;
    int totalComputers;
    int totalBuses;
    int libraryBooks;

    double ratings;
    double annualFee;
    double schoolArea;
    double passPercentage;
    double averageMarks;
    double busFee;

    boolean raging;
    boolean hasLibrary;
    boolean hasPlayground;
    boolean hasComputerLab;
    boolean hasHostel;
    boolean hasWifi;
    boolean isCoEducation;

    public School(String schoolName, String founderName, String principalName, String address, String city, String state, String country, String boardType, String medium, String email, String website, int schoolId, int totalStudents, int totalTeachers, int totalClasses, int totalComputers, int totalBuses, int libraryBooks, double ratings, double annualFee, double schoolArea, double passPercentage, double averageMarks, double busFee, boolean raging, boolean hasLibrary, boolean hasPlayground, boolean hasComputerLab, boolean hasHostel, boolean hasWifi, boolean isCoEducation) {
        this.schoolName = schoolName;
        this.founderName = founderName;
        this.principalName = principalName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.boardType = boardType;
        this.medium = medium;
        this.email = email;
        this.website = website;
        this.schoolId = schoolId;
        this.totalStudents = totalStudents;
        this.totalTeachers = totalTeachers;
        this.totalClasses = totalClasses;
        this.totalComputers = totalComputers;
        this.totalBuses = totalBuses;
        this.libraryBooks = libraryBooks;
        this.ratings = ratings;
        this.annualFee = annualFee;
        this.schoolArea = schoolArea;
        this.passPercentage = passPercentage;
        this.averageMarks = averageMarks;
        this.busFee = busFee;
        this.raging = raging;
        this.hasLibrary = hasLibrary;
        this.hasPlayground = hasPlayground;
        this.hasComputerLab = hasComputerLab;
        this.hasHostel = hasHostel;
        this.hasWifi = hasWifi;
        this.isCoEducation = isCoEducation;
    }
}
