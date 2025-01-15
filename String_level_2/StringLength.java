import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userinput = scanner.next();

        int customLength = GetLength(userinput);
        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + input.length());
    }

    public static int GetLength(String str) {
        int count = 0;
        try {
            while (true) { // Loop through characters till exception occurs
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception indicates end of string
        }
        return count; // Return the counted length
    }
}
