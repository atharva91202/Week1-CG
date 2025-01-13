//importing Random and Scanner class from util pkg for generating random numbers and taking input respectively 
import java.util.Random;
import java.util.Scanner;

//making a class for finding shortest tallest and mean height of the football players
public class FootballTeam {
    public static void main(String[] args) {
//making "input" as sScanner class object 
        Scanner input = new Scanner(System.in);
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < 11; i++) {
            heights[i] = rand.nextInt(101) + 150; // Random height between 150 and 250
        }

        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int sum, int length) {
        return (double) sum / length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}
