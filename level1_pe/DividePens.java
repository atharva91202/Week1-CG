public class DividePens{
public static void main(String[]args){

// Defining number of pens available
int pensAvailable = 14;

// Defining number of students
int students = 3;

//Calculate pens per student and remaining Pens
int penPerstudent = pensAvailable / students; // division
int remainingPens = pensAvailable % students; // modulus for remainder

// Print the result in single statement
System.out.println("The Pen Per Student is " + penPerstudent + 
                           " and the remaining pen not distributed is " + remainingPens );
}}
