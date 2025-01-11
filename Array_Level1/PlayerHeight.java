import java.util.Scanner;
public class PlayerHeight{
public static void main (String [] args){
	//Creating Scanner object to take user input
Scanner sc = new Scanner(System.in);

   // Double Array to store the height of players 
   double[] height = new double[11];
   
   // Variable to store mean
   double heightSum = 0.0;
   
   // Taking user input for heights via for loop 
     System.out.println("Enter the height of players:");
	  for(int i = 0; i<height.length;i++){
		  height[i] = sc.nextDouble();
		  heightSum += height[i];     // adding heights in the variable
	  }
	  //Calculating mean of the heights
    double mean = heightSum/11 ;

    System.out.println("The mean height of the football team is :" + mean);
   }
}   