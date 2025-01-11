import java.util.Scanner;

class checkSmallestNumber {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Get three number inputs
	  System.out.println("Enter the 3 numbers");
      int number1 = input.nextInt();
      int number2 = input.nextInt();
      int number3 = input.nextInt();

      // Check if the first number is the smallest
      boolean isSmallest = (number1 < number2) && (number1 < number3);

      // Print the result
      System.out.println("Is the first number the smallest? " + isSmallest);

      // Close the scanner stream
      input.close();
   }
}
