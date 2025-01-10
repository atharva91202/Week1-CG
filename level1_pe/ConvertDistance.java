public class ConvertDistance {
    public static void main(String[] args) {
        // Define the distance in kilometers
        double distanceInKilometers = 10.8;

        // Conversion factor: 1 kilometer = 1.6 miles
        double conversionFactor = 1.6;

        // Convert kilometers to miles
        double distanceInMiles = distanceInKilometers / conversionFactor;

        // Print the result
        System.out.println("The distance " + distanceInKilometers + " km in miles is " + distanceInMiles);
    }
}

