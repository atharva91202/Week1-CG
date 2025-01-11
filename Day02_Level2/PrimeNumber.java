import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get number as input
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check if the number is greater than 1
        if (num > 1) {
            boolean isPrime = true; // Flag to check if the number is prime

            // Loop from 2 to num-1 to check divisibility
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // Set flag to false if divisible
                    break; // Break out of loop as we found a divisor
                }
            }

            // Print result based on isPrime
            if (isPrime) {
                System.out.println(num + " is a Prime Number.");
            } else {
                System.out.println(num + " is not a Prime Number.");
            }
        } else {
            System.out.println(num + " is not a Prime Number.");
        }

        // Close the Scanner
        input.close();
    }
}
