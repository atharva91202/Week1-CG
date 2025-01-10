import java.util.Scanner;
public class Triangle{
 public static void main(String [] args){
 
 //Creating Scanner object for user input
  Scanner sc = new Scanner(System.in);
  
  //taking user input for Base and height 
  System.out.println("Enter the base length for Triangle");
    int base = sc.nextInt();
	
   System.out.println("Enter the height for Triangle");
    int height = sc.nextInt();
	
  //Finding Area using the formula 
  
  int area = 1/2 *(base*height);
  
  System.out.println("Area of triangle is"+ " "+ area);
  }
}  
