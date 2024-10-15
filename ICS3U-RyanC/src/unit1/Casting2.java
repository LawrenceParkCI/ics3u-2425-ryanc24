package unit1;

/**
* Description: casting2
* Date: Oct. 15th, 2024
* @author Caden Ryan
*/
public class Casting2 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
  public static void main(String[] args) {
    /*
    Char and int
    */
    char myChar = 'a';
    System.out.println(myChar);
    System.out.println(myChar + 1);

    char myChar2 = (char) (myChar + 1);

    System.out.println(myChar2);

    //Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
    // //The code starts with defining "mychar" as "a". When 1 is added to mychar, java reads it as a number, resulting in 98. To convert it back to letters the code uses a new variable mychar2 as a letter "b". 
    //Why do you think this happens? //This happens because Java uses numeric values (ASCII) to represent characters. When you add to a character, it converts it to a number. You need explicit casting to turn the number back into a character afterward.

    //Investigate what is ASCII. What is it? A website used to create codes 
    //Can you find the number value for 'a'? Does it match with your findings above?   //ASCII (American Standard Code for Information Interchange) is a character encoding standard that assigns numeric values (0-127) to characters, including letters, digits, and symbols. For example, `'A'` is `65` and `'a'` is `97`. It enables consistent text representation in computers.
    //Yes the value for `'a'` in ASCII is `97`, which matches the information I wrote.


    //create a new character myCharCap, and transform myChar into a capital 'A' and print it

    /*
    Char and int
    */
 	  char myChar = 'a';
 	  char myCharCap = (char) (myChar - 32); // Transforming 'a' to 'A'
 	  System.out.println(myCharCap); // This will print 'A'

    

  }
}
