package unit2;

/**
* Description: using boolean 
* Date:Nov, 4th 2024
* @author Caden Ryan
*/

public class BasicBoolean {
  public static void main(String[] args) {
    //we've declared a variable called isPurple of boolean type
    //Recall: boolean holds either ____True____ or ______False____
    boolean isPurple = false;


    /*
      Boolean Operators, Expressions
    */

    //boolean expressions are ways we can "calculate" whether
    //something is true or false

    int firstNum = 5;
    int secondNum = 10;
    double thirdNum = 5.5;

    //this prints out ____True____ because ______secondNum is greater__________
    System.out.println("1: " + (firstNum < secondNum)); 

    //this prints out ______False__ because ________secondNum is greater________
    System.out.println("2: " + (firstNum > secondNum)); 

    //this prints out ____true____ because ______6 is greater than 5__________
    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
    //this prints out _____true___ because ____5.5 is greater than 5____________
    System.out.println("4: " + (firstNum <= thirdNum)); 

    /*Test out these boolean operators. Figure out the meaning
      * > means: Less than
      * < means: Greater than
      * <= means: less than or equal to
      * >= means: greater then or equal to
      * == means: equal
      * != means:Does not equal to
    */

  }
}