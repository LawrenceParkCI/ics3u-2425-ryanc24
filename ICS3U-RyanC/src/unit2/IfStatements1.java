package unit2;

/**
* Description: using if statements
* Date:Nov, 5th 2024
* @author Caden Ryan
*/

public class IfStatements1 {
  public static void main(String[] args) {
    int firstNum = 10;
    int secondNum = 30;

    System.out.println("Part 1: If");
    System.out.println("----------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGLUL");
    }    

    //What prints out? Why?
      //Nothing because firstNum is not greater than secondNum
    System.out.println("\nPart 2: If, Else");
    System.out.println("----------------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else {
      System.out.println("XQCL");
    }

    //What prints out? Why?
     //XQCL prints because firstNum is not greater than secondNum so the else statement prints XQCL
    System.out.println("\nPart 3: If, Else if, Else");
    System.out.println("-------------------------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    } else {
      System.out.println("XQCL");
    }

    //What prints out? Why?
     //sykSHY will print
    System.out.println("\nPart 4: What's the difference?");
    System.out.println("------------------------------");
    System.out.println(1);
    if (firstNum < secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    } else {
      System.out.println("XQCL");
    }

    System.out.println(2);
    if (firstNum < secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    }

    if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    }

    if (!(firstNum < secondNum)) {
      System.out.println("XQCL");
    }

    //What prints out? Why?
    //What is the difference between the first and second part?
    //It could print KEKW and OMEGALUL or XQCL depending on the conditions
    //In the first part only 1 block will print while in the second part 2 or more blocks can print depending on conditions
  }
  
}