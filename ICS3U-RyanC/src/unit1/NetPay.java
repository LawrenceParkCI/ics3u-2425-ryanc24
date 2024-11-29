package unit1;

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//define variables
		
		double hours, wage, insurance, tax;
		
		//get info
		
		System.out.println("Type in your hours");
		hours = sc.nextDouble();
		System.out.println("Type in your hourly wage");
		wage = sc.nextDouble();
		System.out.println("Type in how much you pay for insurance");
		insurance = sc.nextDouble();
		System.out.println("Type in the percentage you are taxed");
		tax = sc.nextDouble();
		
		//calculate
		
		double netPay = (hours*wage-insurance) - tax*(hours*wage-insurance);
		
		System.out.println("Your net pay is $" + netPay);
		
		
		
		

	}

}
