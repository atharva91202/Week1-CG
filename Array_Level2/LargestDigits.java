import java.util.Scanner;

class LargestDigits {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take the number as input from the user
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive number.");
            return;
        }

        // Define an array to store digits and set maxDigit
        int maxDigit = 10; // Maximum 10 digits can be stored
        int[] digits = new int[maxDigit];
        int index = 0; // Array index for digits

        // Extract digits and store in the array
        while (number != 0) {
            if (index >= maxDigit) {
                System.out.println("Warning: Number has more than 10 digits. Only first 10 digits are considered.");
                break;
            }
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++;
        }

        // Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }

        // Display the results
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
    }
}
