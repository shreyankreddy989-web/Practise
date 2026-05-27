public class LakeInfo {

    
    String lakeName;
    String country;
    String state;
    String waterType;
    String nearbyCity;
    String color;
    String season;
    String riverName;

   
    int depth;
    int length;
    int width;
    int area;
    

   
    double temperature;
    double altitude;
    double volume;

    
    boolean isNatural;
    boolean isPolluted;
    boolean isTouristPlace;
    boolean isFreshWater;
    boolean fishAvailabality;

    public LakeInfo(String lakeName, String country, String state, String waterType, String nearbyCity, String color, String season, String riverName, int depth, int length, int width, int area, double temperature, double altitude, double volume, boolean isNatural, boolean isPolluted, boolean isTouristPlace, boolean isFreshWater, boolean fishAvailabality) {
        this.lakeName = lakeName;
        this.country = country;
        this.state = state;
        this.waterType = waterType;
        this.nearbyCity = nearbyCity;
        this.color = color;
        this.season = season;
        this.riverName = riverName;
        this.depth = depth;
        this.length = length;
        this.width = width;
        this.area = area;
        this.temperature = temperature;
        this.altitude = altitude;
        this.volume = volume;
        this.isNatural = isNatural;
        this.isPolluted = isPolluted;
        this.isTouristPlace = isTouristPlace;
        this.isFreshWater = isFreshWater;
        this.fishAvailabality = fishAvailabality;
    }
}
