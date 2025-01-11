import java.util.Scanner;
 public class MakeTable{
  public static void main(String[] args){

  //Creating Scanner object to take user input
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Number to generate table");
  int number = sc.nextInt();  

  //Defining array to store result 
  int [] table = new int[10];

  // storing results in the array
  for(int i=1; i<=10;i++){
	table[i-1] = number * i;
  }

  // Display the table 
  for(int i =1; i<=10 ; i++){
	System.out.println(number + " * "+ i + " = " + table[i-1]);
    }
 } 

}
 