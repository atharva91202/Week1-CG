import java.util.Scanner;
public class KMtoMiles{
public static void main(String[] args ){
// defining km in double datatype
double km;

//Creating Scanner object to take user input 
Scanner input = new Scanner(System.in);

System.out.println("Enter the distance in kms");

// Taking user input  
km = input.nextInt();

//Converting from km to miles with factor of 1 Mile = 1.6 km 
double inMiles = km * 1.6;

System.out.println("The total miles is " + inMiles + "for the given " + km + "km");
}
}