//importing arrays from util pkg 
import java.util.Arrays;

public class NumberCheckerthree {
    public static void main(String[] args) {
        int number = 121; // Example number

        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digits Array: " + Arrays.toString(storeDigits(number)));
        System.out.println("Reversed Digits: " + Arrays.toString(reverseDigits(storeDigits(number))));
        System.out.println("Is Palindrome: " + isPalindrome(storeDigits(number)));
    }

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - i - 1];
        }
        return reversed;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return Arrays.equals(digits, reversed);
    }
}
