import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
		//Defining numbers in float data types
	float number1;     
	float number2;
	 //Scanner object to take user input
	Scanner input = new Scanner(System.in);
	// Taking user input for number1
	System.out.println("Enter first Number");
	number1 = input.nextFloat();

	// Taking user input for number2
	System.out.println("Enter Second Number");
	number2 = input.nextFloat();

	// Performing different airthmetic operations
	float add = number1 + number2;
	float sub = number1 - number2;
	float mul = number1 * number2;
    float div = number1 / number2;
System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers" + number1 + "and " + number2 + "is" + add + sub + mul + "and" + div);	
input.close();
  }
}