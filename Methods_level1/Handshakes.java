import java.util.Scanner;
class Handshakes {
public static int numbers(int students){
      // Calculate the maximum number of possible handshakes
        return  (students * (students - 1)) / 2;
	}
    public static void main(String[] args) {
        
        // Creating Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompting the user to enter the number of students
        System.out.print("Enter the number of students: ");
        
        // Taking the number of students as input
        int students = input.nextInt();
        
       int handshakes = numbers(students);
        
        // Print the result
        System.out.println("The number of handshakes is " + handshakes + " for " + students + " given number of students "); 
    }
}
