public class TrainInfo {

   
    String trainName;
    String trainNumber;
    String trainType;
    String railwayZone;
    String sourceStation;
    String destinationStation;
    String currentStation;
    String nextStation;
    String departureTime;
    String arrivalTime;
    String journeyDuration;
    String runningDays;
    String coachType;
    String trainStatus;

   
    int numberOfStops;
    int totalSeats;
    int availableSeats;
    int bookedSeats;
    int speed;

   
    double ticketPrice;
    double distance;

    
    boolean isActive;
    boolean isExpress;
    boolean isSuperfast;

    public TrainInfo(String trainName, String trainNumber, String trainType, String railwayZone, String sourceStation, String destinationStation, String currentStation, String nextStation, String departureTime, String arrivalTime, String journeyDuration, String runningDays, String coachType, String trainStatus, int numberOfStops, int totalSeats, int availableSeats, int bookedSeats, int speed, double ticketPrice, double distance, boolean isActive, boolean isExpress, boolean isSuperfast) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.trainType = trainType;
        this.railwayZone = railwayZone;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.currentStation = currentStation;
        this.nextStation = nextStation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.journeyDuration = journeyDuration;
        this.runningDays = runningDays;
        this.coachType = coachType;
        this.trainStatus = trainStatus;
        this.numberOfStops = numberOfStops;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.bookedSeats = bookedSeats;
        this.speed = speed;
        this.ticketPrice = ticketPrice;
        this.distance = distance;
        this.isActive = isActive;
        this.isExpress = isExpress;
        this.isSuperfast = isSuperfast;
    }
}
