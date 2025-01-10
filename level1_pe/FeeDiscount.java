import java.util.Scanner;
public class FeeDiscount{
public static void main(String[] args ){
int fee;       // Defining fee variable 

int discountPercent; // Defining Discount variable

int total_discount; // It will contain final discount

Scanner input = new Scanner(System.in); //Scanner object to take user input

// Taking user input for fee
System.out.println("Enter Your Fee");
fee = input.nextInt();

// Taking user input for discount percentage
System.out.println("Enter the discount percent ");
discountPercent = input.nextInt();

// Calculating final payable using the formula
total_discount = (fee * discountPercent) / 100;

System.out.println("The discount amount is INR:" + total_discount + "  " + "and final discounted fee is INR :" + (fee - total_discount) );
}
}
