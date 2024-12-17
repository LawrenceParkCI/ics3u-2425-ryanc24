package unit3;
/*
 * Description: Methods
 * Date: Dec, 17th 2024
 * @author: Caden Ryan
 */
public class Methods {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	  public static void main(String[] args) {
	    /**
	      Introduction
	    */
	      /*
	      Methods help you modularize a program by separating its tasks into self-contained units.

	      Pros:
	      - Written only once – no repeated code
	      - Methods can be reused (invoked, called) from several locations in a program
	      - Divide and conquer approach - Constructing programs from small, simple pieces
	      - Software reusability - Use existing methods/classes as building blocks to create new programs.
	      - Dividing a program into meaningful methods/classes makes the program easier to debug and maintain.
	      */
	    /*
	      Using Static Methods
	    */
	    //Print out a sentence about this school year

	    /*
	      You used a method! The println() method takes some information (parameter), and does something with it - in this case, it puts the text into the console.

	      You as the user don't know how it works, but because someone has made it, you can simply use it again and again.
	    */

	   
	    int myNum = 30;
	    myNum = doubleNumber(myNum);
	    System.out.println(myNum);

	  
	    System.out.println(doubleNumber(5));

	   
	    int a = 10;
	    int b = 20;
	    System.out.println("The larger number is: " + larger(a, b));

	
	  }



	  
	  public static int doubleNumber(int num) {
	    int returnValue = num * 2;
	    return returnValue;
	  }

	  /**
	    Part 3 - Create your method
	  */
	
	  /** 
	   * This method takes two integers and returns the larger one.
	   * @param num1 - the first integer
	   * @param num2 - the second integer
	   * @return int - the larger of the two input values
	   */
	  public static int larger(int num1, int num2) {
	    if (num1 > num2) {
	      return num1; // num1 is larger
	    } else {
	      return num2; // num2 is larger
	    }
	  }
	}

	
	