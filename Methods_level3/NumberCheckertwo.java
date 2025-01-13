//importig hashmap from util pkg 
import java.util.HashMap;
import java.util.Map;

public class NumberCheckertwo {
    public static void main(String[] args) {
        int number = 21; // Example number

        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digit Sum: " + sumDigits(number));
        System.out.println("Sum of Squared Digits: " + sumSquaredDigits(number));
        System.out.println("Harshad Number: " + isHarshadNumber(number));
        System.out.println("Frequency of Digits: " + digitFrequency(number));
    }

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static double sumSquaredDigits(int number) {
        double sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 2);
            number /= 10;
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        return number % sumDigits(number) == 0;
    }

    public static Map<Integer, Integer> digitFrequency(int number) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        while (number != 0) {
            int digit = number % 10;
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
            number /= 10;
        }
        return frequencyMap;
    }
}
