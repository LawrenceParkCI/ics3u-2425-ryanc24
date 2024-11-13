package unit2;

import java.util.Scanner;

/**
 * Description:Using if and else statements to make a quiz
 * Date: Nov 12th, 2024
 * @author Caden Ryan
*/

public class IfChallenge3 {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
  public static void main(String[] args) {
    //This is for the portfolio
	  Scanner scanner = new Scanner(System.in);
      int rightAnswers = 0;
      
	  System.out.println("\nQ1) How many oxygens are needed to bond with lithium");
      System.out.println("  1) 1");
      System.out.println("  2) 2");
      System.out.println("  3) 3");
      System.out.print("> ");
      int answer1 = scanner.nextInt();
      
      if (answer1 ==1) {
          System.out.println("That's right.");
          rightAnswers++;
      } else {
          System.out.println("That's wrong");
      }

    
      System.out.println("\nQ2) Is sulphur a metal? (true/false)");
      System.out.print("> ");
      boolean answer2 = scanner.nextBoolean();
      
      if (answer2 == false) {
          System.out.println("That's right.");
          rightAnswers++;
      } else {
          System.out.println("That's wrong");
      }

     
      System.out.println("\nQ3) How many periods are there?");
      System.out.println("  1) 5");
      System.out.println("  2) 6");
      System.out.println("  3) 7");
      System.out.print("> ");
      int answer3 = scanner.nextInt();
      
      if (answer3 == 3) {
          System.out.println("That's right.");
          rightAnswers++;
      } else {
          System.out.println("Thats wrong");
      }

     
      System.out.println("\nYour score: " + (rightAnswers) + " out of 3.");
      if (rightAnswers == 3) {
          System.out.println("Perfect score!");
      } else {
          System.out.println("You got "+ (3- rightAnswers) + " wrong.");
      }

      scanner.close();
  }
    
	  
	  
	  
	  /*
    Write an interactive quiz. It should ask the user three 
    multiple-choice or true/false questions about something. 
    It must keep track of how many they get wrong, and print 
    out a "score" at the end.

    Sample:

    Are you ready for a quiz?  N
    Okay, here it comes!

    Q1) What is the capital of Alaska?
      1) Melbourne
      2) Anchorage
      3) Juneau

    > 3

    That's right!
    */
  }
