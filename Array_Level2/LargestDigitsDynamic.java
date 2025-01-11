import java.util.Scanner;

class LargestDigitsDynamic {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return; // Exit program if input is invalid
        }

        // Define an array to store the digits
        int maxDigit = 10; // Initial size of the array
        int[] digits = new int[maxDigit];

        // Variables to keep track of the array index
        int index = 0;

        // Extract digits from the number and store them in the array
        while (number != 0) {
            // If the index reaches the max size, increase the array size
            if (index == maxDigit) {
                maxDigit += 10; // Increase maxDigit by 10
                int[] temp = new int[maxDigit]; // Create a temporary array
                System.arraycopy(digits, 0, temp, 0, digits.length); // Copy data
                digits = temp; // Assign the new array to digits
            }

            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++;
        }

        // Variables to store the largest and second-largest digits
        int largest = -1; // Initialize to a small value
        int secondLargest = -1; // Initialize to a small value

        // Loop through the array to find the largest and second-largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Digits stored in the array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Largest digit: " + largest);

        if (secondLargest == -1) {
            System.out.println("No second largest digit found (all digits might be the same).");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }
    }
}
