public class NullPointer{

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Initialize the string to null

        // Attempt to call a String method on the null object
        System.out.println("The length of the text is: " + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null; // Initialize the string to null

        try {
            // Attempt to call a String method on the null object
            System.out.println("The length of the text is: " + text.length());
        } catch (NullPointerException e) {
            // Handle the exception and display a meaningful message
            System.out.println("NullPointerException caught: Cannot call methods on a null object.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating NullPointerException...");
        try {
            generateException(); // Call the method that generates the exception
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("Handling NullPointerException...");
        handleException(); // Call the method that handles the exception
    }
}
