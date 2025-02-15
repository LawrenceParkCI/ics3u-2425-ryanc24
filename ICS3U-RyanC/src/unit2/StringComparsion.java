package unit2;

import java.util.Scanner;

/**
 * Description: String comparison
 * Date: Nov, 11th 2024
 * @author Caden Ryan
*/

class StringComparison {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    String answer;

    System.out.println("What is the capital of Ontario?");
    answer = in.nextLine();

    if (answer == "Toronto") {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that's incorrect.");
    }
    
    //Run the code. What happens when you type the correct answer? The incorrect answer?
    //When you type the correct answer it prints out Correct! and wrong answer prints Sorry, that's incorrect.
    /*
      Strings are objects, not primitives and as such are a 
      *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo() //0 if the strings are equal.
A negative integer if the calling string is lexicographically less than the string passed as an argument.
A positive integer if the calling string is lexicographically greater than the string passed as an argument.
        .equals()The .equals() method compares two strings for exact content equality (case-sensitive).
It returns true if the two strings are equal, and false otherwise.
        .equalsIgnoreCase()The .equals() method compares two strings for exact content equality (case-sensitive).
It returns true if the two strings are equal, and false otherwise.
    */


    //What values does compareTo() return? How can we 
    //interpret the value?

    //what value does equals() and equalsIgnoreCase() return? 
    //What is the difference between these two functions?
  }
}