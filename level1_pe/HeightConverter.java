import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();

        // Conversion factors
        double cmToInches = 2.54; // 1 inch = 2.54 cm
        int inchesPerFoot = 12;   // 1 foot = 12 inches

        // Convert height to inches
        double totalInches = heightInCm / cmToInches;

        // Extract feet and remaining inches
        int feet = (int) (totalInches / inchesPerFoot);
        double remainingInches = totalInches % inchesPerFoot;

        // Print the result
        System.out.println("Your Height in cm is " + heightInCm + 
                           " while in feet is " + feet + 
                           " and inches is " + String.format("%.2f", remainingInches));
    }
}
