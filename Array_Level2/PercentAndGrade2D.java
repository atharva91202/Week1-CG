import java.util.Scanner;

class PercentAndGrade2D {
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Asking for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create a 2D array to store marks for Physics, Chemistry, and Maths
        int[][] marks = new int[numStudents][3]; // rows = number of students, columns = 3 subjects

        // Arrays to store percentages and grades
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Taking marks as input for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1));

            // Input marks for Physics
            System.out.print("Enter Physics marks (0-100): ");
            marks[i][0] = input.nextInt();
            while (marks[i][0] < 0 || marks[i][0] > 100) {
                System.out.print("Invalid input. Enter Physics marks (0-100): ");
                marks[i][0] = input.nextInt();
            }

            // Input marks for Chemistry
            System.out.print("Enter Chemistry marks (0-100): ");
            marks[i][1] = input.nextInt();
            while (marks[i][1] < 0 || marks[i][1] > 100) {
                System.out.print("Invalid input. Enter Chemistry marks (0-100): ");
                marks[i][1] = input.nextInt();
            }

            // Input marks for Maths
            System.out.print("Enter Maths marks (0-100): ");
            marks[i][2] = input.nextInt();
            while (marks[i][2] < 0 || marks[i][2] > 100) {
                System.out.print("Invalid input. Enter Maths marks (0-100): ");
                marks[i][2] = input.nextInt();
            }

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Assign grades based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display results for each student
        System.out.println("\nDetails of each student:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);

            // Display remarks based on grade
            switch (grades[i]) {
                case "A":
                    System.out.println("Remarks: Level 4, Above agency-normalized standards");
                    break;
                case "B":
                    System.out.println("Remarks: Level 3, At agency-normalized standards");
                    break;
                case "C":
                    System.out.println("Remarks: Level 2, Below agency-normalized standards");
                    break;
                case "D":
                    System.out.println("Remarks: Level 1, Well below agency-normalized standards");
                    break;
                case "E":
                    System.out.println("Remarks: Level 1-, Too below agency-normalized standards");
                    break;
                case "R":
                    System.out.println("Remarks: Remedial standards");
                    break;
            }
        }
    }
}
