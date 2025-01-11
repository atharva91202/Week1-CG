import java.util.Scanner;

class FindBMI2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();

        // Define a 2D array for storing height, weight, and BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Loop to take input for each person's height and weight
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            
            // Take weight input
            double weight;
            do {
                System.out.print("Enter weight in kg (positive value): ");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Invalid input! Weight must be positive.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;

            // Take height input
            double height;
            do {
                System.out.print("Enter height in meters (positive value): ");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Invalid input! Height must be positive.");
                }
            } while (height <= 0);
            personData[i][1] = height;

            // Calculate BMI and store it
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the details of each person
        System.out.println("\nDetails of all persons:");
        System.out.println("Person\tHeight (m)\tWeight (kg)\tBMI\t\tWeight Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", 
                              (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
