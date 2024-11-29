package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * Description: Decimal formatting
 * Date: Oct, 17th. 2024
 * @author Caden Ryan
 */
public class DFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Run the following program with a cost of 10.00.
		//What value is displayed in the output?
		//The cost of your item with tax is 11.3
		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		
		System.out.println("The cost of your item with tax is " + money.format(total));
		

		//Change the above print statement on line 19 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why?
		//The output is 11.30 rather then 11.3 because "money.format" allows for two decimal places
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different?
		//The output is $11.30 because Decimal format has a "$" symbol
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different?
		//The output is $11.3 because the decimal place was replaced by a "#" symbol
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = 11.87
		//Run the program again with the cost of 10.50, what is happening?
		//the output is $11.87. the program did 10.50*1.13 and displayed the output
		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed?
		//The cost of your item with tax is $139505.28
		
		
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.
		//The cost of your item is #139,505.28 This is because the decimal format is made to display the digits with commas after every 3
		
		
		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE?
		System.out.println("The tax rate is " + percent.format(total));
		// the value for the tax rate is 0.13
		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the TAX_RATE displayed differently?
		//The tax rate is displayed as a percentage of the total, for example the input "10.00" displayed a 1130% tax rate

		sc.close();
	}

}
