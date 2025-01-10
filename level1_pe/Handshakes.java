import java.util.Scanner;

class Handshakes {
    public static void main(String[] args) {
        
        // Creating Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompting the user to enter the number of students
        System.out.print("Enter the number of students: ");
        
        // Taking the number of students as input
        int noStudent = input.nextInt();
        
        // Calculate the maximum number of possible handshakes
        int handshakes = (noStudent * (noStudent - 1)) / 2;
        
        // Print the result
        System.out.println("The number of possible handshakes is " + handshakes + 
                           " if the number of students is " + noStudent + ".");
    }
}
