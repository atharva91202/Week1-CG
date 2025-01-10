public class FindAverage{
public static void main(String[] args){
int marksinPhysics = 95;  //Sam's marks in Physics
int marksinMaths = 94;  //Sam's marks in Maths
int marksinChemistry = 95;  //Sam's marks in Chemistry

// For average we must add the marks sam got in each subject and divide it from total marks which are avaialble

int average = (marksinPhysics + marksinMaths + marksinChemistry) / 3;      // As total of all subjects was 300 so we divide by it 
System.out.println("Sam's average mark in PCM is :" + average);
}}