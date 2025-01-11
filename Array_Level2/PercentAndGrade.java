import java.util.Scanner;

class PercentAndGrade {
    public static void main(String[] args) {

        // Creating Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Asking for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Creating arrays to store marks, percentages, and grades
        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Taking marks as input
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Input for Physics marks (validation included)
            do {
                System.out.print("Enter Physics marks (0-100): ");
                physics[i] = input.nextInt();
                if (physics[i] < 0 || physics[i] > 100) {
                    System.out.println("Invalid input! Marks must be between 0 and 100.");
                }
            } while (physics[i] < 0 || physics[i] > 100);

            // Input for Chemistry marks (validation included)
            do {
                System.out.print("Enter Chemistry marks (0-100): ");
                chemistry[i] = input.nextInt();
                if (chemistry[i] < 0 || chemistry[i] > 100) {
                    System.out.println("Invalid input! Marks must be between 0 and 100.");
                }
            } while (chemistry[i] < 0 || chemistry[i] > 100);

            // Input for Maths marks (validation included)
            do {
                System.out.print("Enter Maths marks (0-100): ");
                maths[i] = input.nextInt();
                if (maths[i] < 0 || maths[i] > 100) {
                    System.out.println("Invalid input! Marks must be between 0 and 100.");
                }
            } while (maths[i] < 0 || maths[i] > 100);

            // Calculate percentage
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

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
                grades[i] = "R"; // Remedial
            }
        }

        // Displaying results for each student
        System.out.println("\nDetails of each student:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + physics[i]);
            System.out.println("Chemistry Marks: " + chemistry[i]);
            System.out.println("Maths Marks: " + maths[i]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);

            // Remarks based on grade using switch statement
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
