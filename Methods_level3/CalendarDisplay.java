//importing Scanner class from util pkg for taking input 
import java.util.Scanner;

//making a class for displaying calendar
class CalendarDisplay {

    public static String getMonthName(int month) {
        String[] months = { "January", "February", "March", "April", "May", "June", 
                            "July", "August", "September", "October", "November", "December" };
        return months[month - 1];
    }

    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m / 12) % 7;
    }

    public static void displayCalendar(int month, int year) {
        int firstDay = getFirstDayOfMonth(month, year);
        int numDays = getNumberOfDays(month, year);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int day = 1;

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        while (day <= numDays) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
            day++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();
        
        System.out.println(getMonthName(month) + " " + year);
        displayCalendar(month, year);
    }
}
