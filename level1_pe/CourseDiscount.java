public class CourseDiscount{
public static void main(String[]args){
//Defining course fee
int fee = 125000;

// Defining discount percent 
int discountPercent = 10;

//We should find out the discount alloted by using discount formula
double discount = (fee * discountPercent) /100;

//Calculate the discounted price
double discountedFee = fee - discount;

System.out.println("the discount amount is INR " + discount);
System.out.println("the Discounted price student will pay is INR " + discountedFee);
}}