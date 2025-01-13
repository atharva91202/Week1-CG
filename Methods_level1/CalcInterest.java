import java.util.Scanner;
public class CalcInterest{
	//Creating method to calculate simple interest
  public static double interst(double principle , double time , double rate){
  return (principle*time*rate)/100;
  }
  public static void main (String[] args){
	//Creating Scannner object to take user input 
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the principle Amount");  // Taking Principle amount as input 
  double principle = sc.nextDouble();
  
  System.out.println("Enter the Rate");             // Taking Rate as input 
  double rate = sc.nextDouble();
  
  System.out.println("Enter the time");             // Taking time as input 
  double time = sc.nextDouble();
  
  double SimpleInterest = interst(principle , time , rate); // calling the method to perform calculation
  
  System.out.println("The simple interest for given Principle" + principle + " rate " + rate + " and time " + time + " is " + SimpleInterest);
   }
 }