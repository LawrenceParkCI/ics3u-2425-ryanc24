package unit2;
/*
 * Description: Checking if an integer is positive or negative and checking if its divisibe by 7
 * Date: Nov, 4th 2024
 * @author Caden Ryan
 */
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.print(number + " is positive.");
        } else if (number < 0) {
            System.out.print(number + " is negative.");
        } else {
            System.out.print(number + " is zero.");
        }

        // Check if the number is divisible by 7
        if (number % 7 == 0) {
            System.out.print(" It is also divisible by 7.");
        } else {
            System.out.print(" It is not divisible by 7.");
        }
    }}
    