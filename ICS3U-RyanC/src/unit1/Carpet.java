package unit1;

import java.util.Scanner;

public class Carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// declare variables
		double length, width, cost;
		double total;
		
		//receive user input
		System.out.println("State the length of your futurecarpet (m)");
		length = sc.nextDouble();
		
		System.out.println("State the width of your future carpet (m)");
		width = sc.nextDouble();
		
		System.out.println("State the cost of your future carpet per sqm");
		cost = sc.nextDouble();
		
		//print output
		System.out.println("\nThe cost of your future carpet is: " + (total = cost*length*width) + "dollars.");
		sc.close();
		
		
		
		
		
		
		
	}

}
