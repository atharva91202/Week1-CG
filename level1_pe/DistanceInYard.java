import java.util.Scanner;

class DistanceInYard {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = scan.nextDouble();

        // Convert feet to yards
        double yard = feet / 3.0;

        // Convert yards to miles
        double miles = yard / 1760.0;

        // Print distance in feet, yards, and miles
        System.out.println("Distance in feet is " + feet + 
                           ", in yards is " + yard + 
                           ", and in miles is " + miles);
    }
}
