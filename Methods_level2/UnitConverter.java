public class UnitConverter {
   
    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmToMiles = 0.621371;
        return km * kmToMiles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesToKm = 1.60934;
        return miles * milesToKm;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersToFeet = 3.28084;
        return meters * metersToFeet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetToMeters = 0.3048;
        return feet * feetToMeters;
    }

    public static void main(String[] args) {
        // Test the conversion methods
        System.out.println("10 km is equal to " + convertKmToMiles(10) + " miles.");
        System.out.println("10 miles is equal to " + convertMilesToKm(10) + " kilometers.");
        System.out.println("10 meters is equal to " + convertMetersToFeet(10) + " feet.");
        System.out.println("10 feet is equal to " + convertFeetToMeters(10) + " meters.");
    }
}
