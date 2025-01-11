import java.util.Scanner;
public class VotingEligible{
  public static void main(String [] args){
    // Taking user input from Scanner object 
	Scanner sc = new Scanner(System.in);
	
	//Taking user input for age 
	System.out.println("Please enter the age ");
	int age = sc.nextInt();
	
	//If age is equal for above 18
	if(age>=18){
	System.out.println("Person's age is" + " "+ age +" "+ "and can vote");
	} 
	else
	System.out.println("Person's age is" + " "+ age +" "+ "and cannot vote");
	}
}	
	