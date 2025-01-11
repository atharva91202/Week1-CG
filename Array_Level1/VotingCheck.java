import java.util.Scanner;
 public class VotingCheck{
  public static void main(String [] args){
  
  //Create an array to store 10 ages
  int [] ages = new int [10];
  
   // Creating Scanner object to take user input
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the Age of 10 Students");
   for(int i=0 ; i< ages.length ; i++){
     System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
	 System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                // Invalid age
                System.out.println("Invalid age entered for student " + (i + 1) + ": " + ages[i]);
            } else if (ages[i] >= 18) {
                // Can vote
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                // Cannot vote
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
    }
}
