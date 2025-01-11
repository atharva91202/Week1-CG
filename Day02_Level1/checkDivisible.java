import java.util.Scanner;

class checkDivisible {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner sc = new Scanner(System.in);

      // Get the number input
      int number = sc.nextInt();

      // Check if the number is divisible by 5
      boolean isDivisible = (number % 5 == 0);

      // Print the result
      System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

      // Close the scanner stream
      sc.close();
   }
}
