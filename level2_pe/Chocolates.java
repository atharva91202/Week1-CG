import java.util.Scanner;
public class Chocolates{
public static void main(String[] args){

//Creating Scanner object to take user input
Scanner sc = new Scanner(System.in);

//Taking user inputs 
System.out.println("Enter Number of Chocolates");
int numberofchocolates = sc.nextInt();
System.out.println("Enter Number of Students");
int numberofstudents = sc.nextInt();

//Finding number of chocolates each student gets 
int chocolateperstudent = numberofchocolates / numberofstudents;

//Finding number of remaining chocolates
int remainingchocolates = numberofchocolates % numberofstudents;

System.out.println(" The number of chocolates each child gets is" + " "+ chocolateperstudent + " " + "and the number of remaining chocolates are" + " "+ remainingchocolates ); 
}
}
