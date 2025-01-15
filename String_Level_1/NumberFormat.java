import java.util.Scanner;
 public class NumberFormat{
    public static void GenerateException(String Text){
      System.out.println("Method to Generate Number Format Exception:" + Integer.parseInt(Text));
	}

    public static void HandlingException(String	Text){
	    try{
		    GenerateException(Text);
		}catch(NumberFormatException e){
		    System.out.println("Number Format Exception caught: String is not Valid");
		}catch(RuntimeException e){
            System.out.println("Runtime Exception occured : Runtime Error occured");
		}
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string with numerical values");
        String userinput = sc.nextLine();

        try{
		    //Calling the method that generates exception
			System.out.println("Attempting to generate NumberFormat Exception");
			GenerateException(userinput);
		}catch(Exception e){
		    //Calling the method to handle exception
            System.out.println("Now handling the exception");
			HandlingException(userinput);
		}
    }
}	
  		
        		