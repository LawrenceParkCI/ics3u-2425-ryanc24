package unit2;

import java.util.Scanner;

/*
 * Description: Testing numbers for odd or even
 * Date: Nov, 4th 2024
 * @author Caden Ryan
 */
public class OddEven {
    private int number;

    public OddEven(int number) {
        this.number = number;
    }

    public void check() {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        OddEven oddEvenChecker = new OddEven(num);
        oddEvenChecker.check();
        
    }
}