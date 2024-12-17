package unit3;
/**
 * Description: Methods challenge #1
 * Date: Dec 17th, 2024
 * @author Caden Ryan
*/

public class MethodChallenge1 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	    public static void main(String[] args) {
	        // Complete the function below. Don't forget to comment.
	        double d1 = distance(-2, 1, 1, 5);
	        System.out.println(" (-2,1) to (1,5) => " + d1);
	 
	        double d2 = distance(-2, -3, -4, 4);
	        System.out.println(" (-2,-3) to (-4,4) => " + d2);
	 
	        System.out.println(" (2,-3) to (-1,-2) => " + distance(2, -3, -1, -2));
	 
	        System.out.println(" (4,5) to (4,5) => " + distance(4, 5, 4, 5));
	    }

	    /**
	     * This method calculates the distance between two points (x1, y1) and (x2, y2) using the distance formula.
	     * 
	     * @param x1 -> the x-coordinate of the first point
	     * @param y1 -> the y-coordinate of the first point
	     * @param x2 -> the x-coordinate of the second point
	     * @param y2 -> the y-coordinate of the second point
	     * @return the distance between the two points
	     */
	    public static double distance(int x1, int y1, int x2, int y2) {
	        // Applying the distance formula
	        double dx = x2 - x1; // Difference in x-coordinates
	        double dy = y2 - y1; // Difference in y-coordinates
	        return Math.sqrt(dx * dx + dy * dy); // Calculating and returning the distance
	    }
	}

}
