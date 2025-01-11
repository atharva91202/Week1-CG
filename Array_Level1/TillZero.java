import java.util.Scanner;
public class TillZero{
 public static void main(String [] args ){
   // Define an array of new size 10
   double [] numbers = new double[10];
   double total = 0.0;    //Variable to store the sum of all numbers
   int index = 0;         // Index variable to track array
   
   //Create a Scanner object to take user input
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter numbers (0 or negative number to stop:");
   
   //Infinite loop to get user input
   while(true){
    System.out.println("Enter a number:");
	double number = sc.nextDouble();
	
	//Break the loop if the array is full
	if(number <= 0){
	  break;
	}
	
	//Store the number in the array and increment the index
	  numbers[index] = number;
	  index++;
	}
	
   // Calculate the total using a for loop
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i]; // Add each number to the total
        }

        // Display the total sum
        System.out.println("The total sum of the numbers is: " + total);
    }
}