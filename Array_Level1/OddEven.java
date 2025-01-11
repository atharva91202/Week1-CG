import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return; // Exit the program
        }

        // Calculate the maximum possible size for odd and even arrays
        int maxSize = number / 2 + 1;

        // Initialize arrays to store odd and even numbers
        int[] oddNumbers = new int[maxSize];
        int[] evenNumbers = new int[maxSize];

        // Index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop through numbers from 1 to the given number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Even number
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                // Odd number
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print the odd numbers array
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print the even numbers array
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
