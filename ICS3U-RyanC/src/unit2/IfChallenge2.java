package unit2;


	import java.util.Scanner;

	/**
	 * Description: if AND Else challenge #2
	 * Date: Nov 11th, 2024
	 * @author CAden Ryan
	*/

	public class IfChallenge2 {
	  public static void main(String[] args) {
	    //This is for the portfolio

	    /*Create a program that asks for three numbers.
	    Tell the user if the numbers are strictly in order.
	    ie.  2 5 11 or 5 6 7 are strictly in order.
	    ie.  6 5 7 or 5 5 7 are not
	    */
		 {
		      Scanner in = new Scanner(System.in);

		      // Ask the user for three numbers
		      System.out.println("Please enter three numbers:");

		      System.out.print("First number: ");
		      int num1 = in.nextInt();

		      System.out.print("Second number: ");
		      int num2 = in.nextInt();

		      System.out.print("Third number: ");
		      int num3 = in.nextInt();

		      // Check if the numbers are strictly in increasing order
		      if (num1 < num2 && num2 < num3) {
		        System.out.println("The numbers are strictly in order.");
		      } else {
		        System.out.println("The numbers are not strictly in order.");
		      }
		    }
		  }

	  }
	

