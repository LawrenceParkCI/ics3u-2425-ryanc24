package unit2;

import java.util.Scanner;

/**
* Description: If challenge
* Date: Nov 11th, 2024
* @author Caden Ryan
*/

public class IfChallenge {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    /*

    (IF)

    ask for the user's favourite number.
    if the number is negative, say that they need to look on
    the bright side.  If their number is odd, say that it's a 
    bit strange.

    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
    */
  {
      {

        // Ask for the user's favorite number
        System.out.println("What is your favorite number?");
        int favoriteNumber = in1.nextInt();

        // Check if the number is negative
        if (favoriteNumber < 0) {
          System.out.println("Look on the bright side!");
        }

        // Check if the number is odd
        if (favoriteNumber % 2 != 0) {
          System.out.println("It's a bit strange.");
        }

        // Check if the number is divisible by both 3 and 2
        if (favoriteNumber % 3 == 0 && favoriteNumber % 2 == 0) {
          System.out.println("You should really consider thinking about 6.");
        } else {
          System.out.println("You can keep wholesome.");
        }

        // Check the ones digit of the number
        int onesDigit = favoriteNumber % 10;
        if (onesDigit == 8) {
          System.out.println("You too are full.");
        } else if (onesDigit == 9) {
          System.out.println("Canada is a nice country.");
        } else {
          System.out.println("Don't count on it.");
        }
      }
    }


  }
}
