import java.util.Scanner;

class FizzBuzz{
	public static void main(String [] args){
		//create an scanner for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number = scan.nextInt();
		
		if(number > 0){
		//create a string array
		String[] results = new String[number + 1];

        // Loop from 0 to the input number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
				// Multiples of both 3 and 5
                results[i] = "FizzBuzz"; 
            } else if (i % 3 == 0) {
				// Multiples of 3
                results[i] = "Fizz"; 
            } else if (i % 5 == 0) {
				// Multiples of 5
                results[i] = "Buzz"; 
            } else {
                results[i] = String.valueOf(i); 
            }
        }

        // Display the results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
		}else{
			System.out.println("The number is not valid ");
		}
	}
}