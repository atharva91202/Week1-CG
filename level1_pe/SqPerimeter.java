import java.util.Scanner;
 public class SqPerimeter{
    public static void main(String[] args){
		//Creating Scanner object for user input 
	  Scanner sc = new Scanner(System.in);
         
	   // Taking user input for perimeter
	   System.out.println("Enter the perimeter");
	   double perimeter = sc.nextDouble();
    
	   //Finding out side using perimeter 
	   double side = perimeter / 4;

	System.out.println("The length of side is"+ " "+ side+ " " + "whose perimeter is "+" "+perimeter);   
	}
}
     