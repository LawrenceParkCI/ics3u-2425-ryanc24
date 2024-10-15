package unit1;

import java.util.Scanner;

/**
* Description: Casting 1
* Date: Oct. 15th, 2024
* @author Caden Ryan
*/
public class Casting1 {
	
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
  public static void main(String[] args) {
    /*
    *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
    */

    System.out.println("Part 1");

    int intNum;
    intNum = 10;

    double doubleNum;
    
    //implicit casting
    doubleNum = intNum;

    //What type of data is printed here? Why?
    System.out.println(doubleNum);
     //floating point, because the integer is being converted to a double
    //can you explain what is happening in this code?
    doubleNum = doubleNum + 2.2;
     //2.2 was added to doubleNum
    //explicit casting
    intNum = (int) doubleNum;

    //What type of data is printed here? Why?
    System.out.println(intNum);
    	// The number 12 was printed out becuase doubleNum12.2 was converted to a int
    /*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double double = int
      double to int intNum= int*double
      int to long long = int
      long to int intNum= int*long

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
    */
    //when you convert smaller data to bigger data its implicit and bigger to smaller is explicit
    System.out.println("Part 2");

    //understanding what you can do with casting, can you round the following variable to the nearest 10th?
    double myNum;
    
    Scanner in = new Scanner(System.in);
    //declare variable
  
    System.out.println("Give me decimal number up to the hundredth");
    myNum = in.nextDouble();
    
    
    System.out.print("Rounding down to the nearest tenth, it is: ");
    myNum = myNum * 100;
    myNum = Math.rint(myNum);
    myNum = myNum / 10;
    System.out.println(myNum);
    
  }
}