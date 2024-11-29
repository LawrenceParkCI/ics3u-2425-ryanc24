package unit1;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		//declare variables
		int length, width, depth;
		
		//get the user input
		System.out.println("AREA PROGRAM");
		System.out.print("Type in the length of the rectangle");
		length = sc.nextInt();
		
		System.out.print("Type in the width of the rectangle");
		width = sc.nextInt();
		
		System.out.print("Type in the depth of the rectangle");
		depth = sc.nextInt();
		
		//calculate the volume
		int volume = length * width * depth;
		
		//print the output
		System.out.println("The volume of your rectangle is" + volume);
		sc.close();
	
	
	
	
	}

}
