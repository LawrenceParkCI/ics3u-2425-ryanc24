package unit1;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*
 * Desciption: Grocery Shopping with coding
 * Date: Oct 18th, 2024
 * @author Caden Ryan
 */
public class GroceryShopping {
    
    // Constant for tax rate
    public static final double TAX_RATE = 0.13;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Title bar
        System.out.println("|| $$$ \\\\ ========== \"Caden's Grocery\" ========== /// $$$ ||");
        System.out.println();

        // Asking for the first product details
        System.out.print("What would you like to buy? ");
        String product1 = input.nextLine();
        System.out.print("How much does it cost? ");
        double price1 = input.nextDouble();
        System.out.print("How many are you buying? ");
        int quantity1 = input.nextInt();
        System.out.println("Very good.\n");

        // Asking for the second product details
        input.nextLine();  // Consumes leftover newline
        System.out.print("What would you like to buy? ");
        String product2 = input.nextLine();
        System.out.print("How much does it cost? ");
        double price2 = input.nextDouble();
        System.out.print("How many are you buying? ");
        int quantity2 = input.nextInt();
        System.out.println("Very good.\n");

        // Calculating the total costs
        double totalPrice1 = price1 * quantity1;
        double totalPrice2 = price2 * quantity2;
        double subtotal = totalPrice1 + totalPrice2;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        // Printing the receipt
        System.out.println("This is your receipt:\n");
        System.out.println("           Caden's Grocery");
        
        // Print current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm");
        System.out.println(now.format(formatter));
        
        System.out.println();
        System.out.printf("%-10s | %-7s | %-6s | %-12s\n", "Item", "Price", "Quant.", "Total Price");
        System.out.println("------------------------------------------");
        System.out.printf("%-10s | $%6.2f | %6d | $%10.2f\n", product1, price1, quantity1, totalPrice1);
        System.out.printf("%-10s | $%6.2f | %6d | $%10.2f\n", product2, price2, quantity2, totalPrice2);
        System.out.println("------------------------------------------");
        System.out.printf("%28s: $%10.2f\n", "Subtotal", subtotal);
        System.out.printf("%28s: $%10.2f\n", "Tax", tax);
        System.out.printf("%28s: $%10.2f\n", "Total", total);

        // Rounding the total to nearest dollar and nearest 5 cents
        long totalRounded = Math.round(total);
        double totalRounded5Cents = Math.round(total * 20) / 20.0;

        // Printing the approximate values
        System.out.println();
        System.out.printf("This is approximately $%d.\n", totalRounded);
        System.out.printf("Rounded to the nearest 5 cents: $%.2f\n", totalRounded5Cents);

        System.out.println();
        System.out.println("Have a good day!");
        System.out.println("Thank you for shopping at Caden's Grocery!");

	}

}
//If you used print() in your program:
//I used print() instead of println() in lines 19, 21, and 23 when prompting the user for product details. I used print() to keep the cursor on the same line as the user's input, making it more natural for the user to type after the prompt without moving to a new line.
//Variables created for the program:
//String product1, product2: These are used to store the names of the products. String is used because product names are text.
//double price1, price2: These store the prices of the products. double is chosen for precision in decimal values.
//int quantity1, quantity2: These store the quantities of each product purchased. int is used because the quantity is a whole number.
//double totalPrice1, totalPrice2: These calculate the total cost for each product (price * quantity). double is used for precision in monetary values.
//double subtotal, tax, total: These are used to calculate and store the subtotal, tax, and total values. double is used for precision.
//long totalRounded: This is used to store the total rounded to the nearest dollar. long is used because we are working with whole numbers.
//double totalRounded5Cents: This stores the total rounded to the nearest 5 cents. double is used to maintain precision for monetary values.
//Data types not used:
//I did not use char in the program. char is used to store single characters, which were not required in this program as we were dealing with text, numbers, and calculations.
//Constants:
//Constants are fixed values in a program that do not change. They are considered good practice because they make the code easier to maintain and understand, as well as prevent accidental modifications. In this program, TAX_RATE is a constant because the tax rate is a fixed value that should not change throughout the program.
//Use of constants in the program:
//The TAX_RATE constant is used to calculate the tax. By defining it as a constant, it is easy to adjust the tax rate in the future without needing to modify multiple parts of the code.

