import java.util.Scanner;
class MultiDimension{
	public static void main(String [] args){
		
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of row :");
		//user input row and col 
		int row =scan.nextInt();
		System.out.print("Enter the number of columns :");
		int col = scan.nextInt();
		
		//create an 2D array
		int multi[][] = new int[row][col];
		
		//first loop for row 
		for(int i=0;i<row;i++){
			//second loop for col 
			System.out.print("Enter " + (i+1) + " row elements :");
			for(int j=0;j<col;j++){
				multi[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		
		//create a 1D array of length row*col
		int array[] = new int[row*col];
		
		//index for 1D array
		int index = 0;
		
		System.out.print("Elements of 1D array : ");
		//for loop for copy the elements from 2D array to 1D array
		for(int i=0;i<row;i++){
			//second loop for col 
			for(int j=0;j<col;j++){
				array[index] = multi[i][j];
				System.out.print(array[index] + " ");
				index++;
			}
		}
	}
}