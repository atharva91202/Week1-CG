import java.util.Scanner;

public class CheckSubString {
    // Method to create a substring using charAt()
    public static String substringbyCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i)); // Append characters one by one
        }
        return substring.toString(); // Convert to String and return
    }

    // Method to compare two strings character by character
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings are not equal if their lengths differ
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any character doesn't match
            }
        }
        return true; // Strings are equal
    }

    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking user input for the full string
        System.out.println("Enter the full string:");
        String text = sc.nextLine();

        // Taking user input for start and end indices
        System.out.println("Enter the starting index:");
        int start = sc.nextInt();

        System.out.println("Enter the ending index:");
        int end = sc.nextInt();

        // Ensure indices are valid
        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Invalid indices. Please enter a valid range.");
            sc.close();
            return;
        }

        // Create substring using charAt()
        String substringByCharAt = substringbyCharAt(text, start, end);

        // Create substring using built-in substring() method
        String substringFromBuiltIn = text.substring(start, end);

        // Compare the substrings
        boolean result = compareStringsUsingCharAt(substringByCharAt, substringFromBuiltIn);

        // Display the results
        System.out.println("\nSubstring using charAt(): " + substringByCharAt);
        System.out.println("Substring using built-in substring(): " + substringFromBuiltIn);
        System.out.println("Are the substrings equal? " + result);

        sc.close(); // Close the Scanner resource
    }
}
