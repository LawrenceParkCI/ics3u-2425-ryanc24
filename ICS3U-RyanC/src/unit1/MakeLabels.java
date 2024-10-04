//*
 /* Description: Using string variables
 /* Date: Oct. 2nd, 2024
/ * @author: Caden Ryan
 */




 package unit1;
 

import java.util.Scanner;

public class MakeLabels {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		String subject;
		String name;
		
		System.out.println("Type in the subject");
		subject=sc.nextLine();
		System.out.println("Type in the name");
		name=sc.nextLine();
		
		System.out.println();
		System.out.println("***************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("***************************");
		sc.close();
	
	
	
	
	}

}
