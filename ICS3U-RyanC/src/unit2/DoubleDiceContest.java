package unit2;

package unit2;

/**
 * Description: Double Dice Contest
 * Date: Nov 19th 2024
 * @author Caden Ryan
 */
public class DoubleDiceContest {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */

		
		        int userDie1 = (int) (Math.random() * 6) + 1;
		        int userDie2 = (int) (Math.random() * 6) + 1;
		        int userTotal = userDie1 + userDie2;

		      
		        int computerDie1 = (int) (Math.random() * 6) + 1; 
		        int computerDie2 = (int) (Math.random() * 6) + 1;
		        int computerTotal = computerDie1 + computerDie2;

		       
		        System.out.println("User's roll: " + userDie1 + " and " + userDie2 + " (Total: " + userTotal + ")");
		        System.out.println("Computer's roll: " + computerDie1 + " and " + computerDie2 + " (Total: " + computerTotal + ")");

		       
		        if (userTotal > computerTotal) {
		            System.out.println("User wins!");
		        } else if (computerTotal > userTotal) {
		            System.out.println("Computer wins!");
		        } else {
		            System.out.println("It's a tie!");
		        }
		    }
		

	}


