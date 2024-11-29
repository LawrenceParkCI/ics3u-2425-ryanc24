package unit1;

import java.text.NumberFormat;
import java.util.Scanner;
/*
 * Description: Number formatting
 * Date: Oct, 17th. 2024
 * @author Caden Ryan
 */
public class NFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));
		
		//How can you change how your value is displayed?
		//You can change how your value is displayed by using money.format or decimal format to display the output like "10.00" and percent.format or number format to display the output like this "1000%"
		//What other formats does NumberFormat offer?
		//NumberFormat.getInstance()
		//NumberFormat.getAvailableLocales()
		//NumberFormat.getNumberInstance()

		sc.close();
	}

}
