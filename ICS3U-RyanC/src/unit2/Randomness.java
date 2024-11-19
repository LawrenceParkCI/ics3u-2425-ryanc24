package unit2;

/**

https://www.geeksforgeeks.org/java-math-random-method-examples/

Description: Randomness with java
Date: Nov 18th, 2024
@author: Caden Ryan
*/


public class Randomness {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(Math.random());
    }

    //Run the program a few times. What do you think is the 
    //range of the numbers generated?
    //0.08796380573296969
    //0.37690177948952763
   // 0.8941634629228405
   // 0.600742684801104
   // 0.20189869492652446
   // 0.37782414828787536
   // 0.7369519723105368
    //0.8962046084230175
   // 0.5283464440693825
   // 0.36944795850321965

    //Read the demo program. Write the code so that the program 
    //will produce a random number between 100 and 1000.
    for (int i = 0; i < 10; i++) {
      
        double randomValue = 100 + (900 * Math.random());
        System.out.println(randomValue);
      }
    }
  
  }