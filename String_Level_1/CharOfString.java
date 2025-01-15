import java.util.Scanner;
public class CharOfString{

//Creating Method to Convert String to Char-Array by user defined methods
  public static char [] getCharacters(String text){
     char [] characters = new char[text.length()];  
      for(int i = 0; i < text.length();i++){
        characters[i] = text.charAt(i);           // using charAt method 
      }
    return characters;
}

// Creating Method to compare the arrays
   public static boolean compareCharArrays(char[] array1 , char [] array2 ){
       if(array1.length != array2.length){
             return false;
           }
     for(int i =0; i<array1.length ;i++){
           if(array1[i] != array2[i]){
        return false;
      }
    }
  return true;
}  

public static void main (String [] args){
// Creating Scanner object to take user input 
 Scanner sc = new Scanner(System.in);
 
 // Taking input of String
 System.out.println("Enter the string:");
 String text = sc.nextLine();

//Getting char-array by user defined method
 char[] userdefined = getCharacters(text);
 
 //Getting charAt by built-in method
 char [] built_in = text.toCharArray();
 
 //Comparing both the arrays
 boolean areEquals = compareCharArrays(userdefined , built_in);
 
 System.out.println("Are the arrays identical?" + areEquals);
   sc.close();
 }
} 
