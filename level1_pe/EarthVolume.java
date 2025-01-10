public class EarthVolume {
    public static void main(String[] args) {
        // Radius of the Earth in kilometers
        double radiusKm = 6378;

        // Conversion factor from kilometers to miles
        double kmToMiles = 0.621371;

        // Volume of a sphere formula: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Convert the volume from km^3 to miles^3
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);

        // Print the result
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3);
        System.out.println("The volume of Earth in cubic miles is " + volumeMiles3);
    }
}

