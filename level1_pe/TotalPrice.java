import java.util.Scanner;
class TotalPrice{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the unit price");
		
		//taking unit price as input from user
		int unitPrice = input.nextInt();
		
		System.out.println("Enter your Quantity");
		
		//taking Quantity as input from user
		int quantity = input.nextInt();
		
		// total price = unit price * quantity
		
		int total = unitPrice*quantity;
		System.out.println("the total purchase price is INR "+ total +" if the quantity "+ quantity +" and unit price is INR "+unitPrice);
	}
}