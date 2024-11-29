package unit2;

import java.util.Scanner;

/**
* Description: using if statements
* Date: Nov 11th, 2024
* @author Caden Ryan
*/

public class IfStatements2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("What is your age?");
    int userAge = in.nextInt();
    /*
    if (userAge > 18) { //If they're over 18, they are titled an adult
      String title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    System.out.println(title);
    */
    //Looking at the logic above, why do you think the 
    //program won't work? //The variable title is declared in the If and Else blocks

    //Copy the code below, and try to find a solution.
    //Comment the code above to avoid compilation errors.
    {
        {
            Scanner in1 = new Scanner(System.in);

            System.out.println("What is your age?");
            int userAge1 = in1.nextInt();

            String title = ""; // Declare title variable outside the if-else blocks
            
            if (userAge1 >= 18) { // If they're over or equal to 18, they are titled an adult
                title = "Adult";
            } else {  // If they're under 18, they don't have the title
                System.out.println("Sorry, not quite yet.");
            }

            // Now we can safely print the title since it exists in the whole method scope
            if (!title.isEmpty()) {
                System.out.println("You are an " + title);
            }
        }
    }


  }
}