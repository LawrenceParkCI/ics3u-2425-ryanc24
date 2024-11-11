package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author 
*/

public class StringChallenge {
  public static void main(String[] args) {
    //This is for the portfolio

    /*
    Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.

    Also, include an example of explicit and implicit casting.

    Comment to explain:
      -when you use the different String functions
      -when you are casting and how the value is changed
    */
	  {
	    

	      Scanner scanner = new Scanner(System.in);

	      // Example of String comparison using .equals(), .equalsIgnoreCase(), .compareTo()
	      System.out.println("Please enter the name of a city:");
	      String userInput = scanner.nextLine();
	      String correctAnswer = "Toronto";

	      // Using .equals() - compares the content of two strings (case-sensitive)
	      if (userInput.equals(correctAnswer)) {
	        System.out.println("You guessed correctly with .equals(): " + userInput);
	      } else {
	        System.out.println("Incorrect guess using .equals(). The correct answer is 'Toronto'.");
	      }

	      // Using .equalsIgnoreCase() - compares the content of two strings (case-insensitive)
	      if (userInput.equalsIgnoreCase(correctAnswer)) {
	        System.out.println("You guessed correctly with .equalsIgnoreCase(): " + userInput);
	      } else {
	        System.out.println("Incorrect guess using .equalsIgnoreCase(). The correct answer is 'Toronto'.");
	      }

	      // Using .compareTo() - compares strings lexicographically
	      int comparisonResult = userInput.compareTo(correctAnswer);
	      if (comparisonResult == 0) {
	        System.out.println("Using .compareTo(): The strings are equal.");
	      } else if (comparisonResult < 0) {
	    

  
