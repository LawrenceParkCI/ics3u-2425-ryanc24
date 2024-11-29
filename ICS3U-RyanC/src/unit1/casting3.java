package unit1;

/**
* Description: Casting 3
* Date: Oct, 15th. 2024
* @author Caden Ryan
*/
public class casting3 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
 public static void main(String[] args) {
    /* 
    * Strings and Back Again
    */
    //Recall:
    System.out.println("Part 1");
    System.out.println("1 + 2 + 3" + 4 + 5);
    //why did it print out this way?
    //The numbers 1, 2, 3 are strings and 4, 5 are intergers therefore they don't add and are shown as they are
    //Demonstrate casting a double value to a String in this way
    double myDouble = 12.34;
    String doubleStr = String.valueOf(myDouble);
    System.out.println(doubleStr);  // Outputs "12.34"
    //Demonstrate casting a boolean value to a String in this way
    boolean myBool = true;
    String boolStr = String.valueOf(myBool);
    System.out.println(boolStr);  // Outputs "true"

    //Demonstrate casting a char value to a String in this way
    char myChar = 'A';
    String charStr = String.valueOf(myChar);
    System.out.println(charStr);  // Outputs "A"


    System.out.println("Part 2");
    //In order to change a String into an integer, we need another set of code

    String strNum = "-5";
    int myNum = Integer.parseInt(strNum);
    System.out.println(strNum + " x 2 = " + (myNum + myNum));  // Outputs "25 x 2 = 50"


    System.out.println(strNum + " x 2 = " + (myNum + myNum));

    /*Change strNum to the following values, and see if they work:
     * "25.2" ERROR
     * "23c" ERROR
     * "2 3" ERROR
     * "Lol23" ERROR
     * "-5"  = -10
    */
    //What can you say about how we can use the function, Integer.parseInt()?
    //Integer.parseInt() can only convert valid integer strings. If the string cannot be parsed into a valid integer (like those listed above), it will throw a NumberFormatException

    // What do you think the code to change a String to double would look like?
    String strDouble = "25.5";
    double myDouble1 = Double.parseDouble(strDouble);
    System.out.println(myDouble1);  // Outputs 25.5

    //Similarly, test out the code and write down what instructions
  
   //-25.5

    //When do you think it might be necessary to change a string value into an integer value/double value?
    //User input, Data processing, and calculations
 }
}