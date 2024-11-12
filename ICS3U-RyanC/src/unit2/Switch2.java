package unit2;
/**
Description: using switch blocks
Date:Nov 12th, 2024
@author Caden Ryan
*/

import java.util.Scanner;

public class Switch2 {
  public static void main(String[] args) {

    /*Create a program that asks for a month, and print out how many days there are in that month. (For "February", just put 28). This will be a part of your portfolio.

    Challenge: Ask for the year, and change "February" to 29 if the year is a leap year (divisible by 4)
    */

    //Can you create it such that you can remove some breaks?
	  Scanner in = new Scanner(System.in);

	    
	    System.out.println("Enter the month (e.g., January, February, etc.): ");
	    String month = in.nextLine().toLowerCase();  

	    System.out.println("Enter the year: ");
	    int year = in.nextInt();

	   
	    boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

	    int daysInMonth = 0;  
	    switch (month) {
	      case "january":
	      case "march":
	      case "may":
	      case "july":
	      case "august":
	      case "october":
	      case "december":
	        daysInMonth = 31;
	        break;
	      case "april":
	      case "june":
	      case "september":
	      case "november":
	        daysInMonth = 30;
	        break;
	      case "february":
	        if (isLeapYear) {
	          daysInMonth = 29; 
	        } else {
	          daysInMonth = 28; 
	        }
	        break;
	      default:
	        System.out.println("Invalid month entered!");
	        return;  
	    }

	    
	    System.out.println("The month of " + month.substring(0, 1).toUpperCase() + month.substring(1) + " has " + daysInMonth + " days.");
	  }
	
  }

