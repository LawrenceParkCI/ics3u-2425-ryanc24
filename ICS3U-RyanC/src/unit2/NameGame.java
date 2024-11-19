package unit2;

import java.util.Scanner;

/**
 * Description: Name Game
 * Date:Nov 19th 2024
 * @author  Caden Ryan
 */
public class NameGame {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */
		Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        
        
        double randomValue = Math.random();
        
        
        if (randomValue < 0.7) {
            System.out.println(userName + ", your name is your favorite!");
        } else {
            System.out.println(userName + ", you hate your name!");
        }
        
       
        scanner.close();
    }


	}


