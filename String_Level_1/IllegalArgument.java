import java.util.Scanner;
public class IllegalArgument{
	//Creating Method to generate exception
    public static void GenerateException(String text){
        System.out.println("Method to generate IllegalArgument Exception :" + text.substring(5,2));
	}
	
	//Creating method to handle exception
	public static void HandleException(String text){
	   try{
	   System.out.println("Generating Illegal Argument Exception :" + text.substring(5,2));
	  }catch(IllegalArgumentException e){
        System.out.println("IllegalArgumentException found :"	+ e.getMessage());
      }catch(RuntimeException e){
        System.out.println("RuntimeException occured" + e.getMessage());
    	}
    }
  
    public static void main(String [] args ){
		//Creating Scanner object to take user input 
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the String");
      String userinput = sc.nextLine();
       
	   // Demonstrating generating exception
      try{
         GenerateException(userinput);
      }catch( IllegalArgumentException e){
         System.out.println("Caught exception in main :" + e.getMessage());
      }
	    // Demonstrating Handling Exception
	  System.out.println("Demonstrating IllegalArgument Handling Exception:");
        HandleException(userinput);
		sc.close();
	}
}