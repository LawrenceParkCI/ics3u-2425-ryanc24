package unit2;

import java.util.Scanner;

/**
Description: Using switch blocks
Date: nOIv 12th, 2024
@author Caden Ryan
*/

public class Switch1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("What number day is it?");
    int day = in.nextInt();

    switch(day) {
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("We don't have that day yet");
        break;
    }

    //Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result?
    // It prints out the corresponding day
    //What do you think default means?
    //Used handle unexpected/invalid input for example the number 0 or 8 
    //What do you think break means? What happens when you remove a break?
//Break is used to exit the switch block so it does'nt end up in a loop

     System.out.println("What day is it today? (e.g., Monday, Tuesday, etc.)");
    String day = in.nextLine().toLowerCase(); 
  
    int daysUntilWeekend = 0;

    switch (day) {
      case "monday":
        daysUntilWeekend = 5; 
        break;
      case "tuesday":
        daysUntilWeekend = 4; 
        break;
      case "wednesday":
        daysUntilWeekend = 3;  
        break;
      case "thursday":
        daysUntilWeekend = 2;  
        break;
      case "friday":
        daysUntilWeekend = 1; 
        break;
      case "saturday":
        daysUntilWeekend = 0;  
        break;
      case "sunday":
        daysUntilWeekend = 0;  
        break;
      default:
        System.out.println("Invalid day! Please enter a valid day of the week.");
        return;  
    }

   
    if (daysUntilWeekend == 0) {
      System.out.println("It's already the weekend!");
    } else {
      System.out.println("There are " + daysUntilWeekend + " days left until the weekend.");
    }
  }

  }

