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
        System.out.println("|| $$$ \\\\ ========== \"Your Name's Grocery\" ========== /// $$$ ||");
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
        System.out.println("           Your Name's Grocery");
        
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
        System.out.println("Thank you for shopping at Your Name's Grocery!");

	}

}
