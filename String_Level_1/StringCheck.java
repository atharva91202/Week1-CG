import java.util.Scanner;
// Creating method to check the Strings 
public class StringCheck{
 public static boolean checkString(String str1 , String str2){
  return str1.equals(str2);      // Using equals method 
 }
  public static void main(String [] args ){
  // Creating Scanner object to take user input
  Scanner sc = new Scanner(System.in);
  
  // Taking user input for both Strings
  System.out.println("Enter the String 1");
   String str1 = sc.nextLine();
   System.out.println("Enter the String 2");
   String str2 = sc.nextLine();
   
   //Check if both the result are equal or not 
   boolean result = checkString(str1,str2);
   
   //Giving out results 
   if (result) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        sc.close(); // Close the scanner
    }
}