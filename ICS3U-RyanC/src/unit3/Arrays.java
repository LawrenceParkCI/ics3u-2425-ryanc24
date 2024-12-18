package unit3;

/**
* Description:
    - Declaring and Initializing a pre-filled array
    - Using an element
    - Assigning a value in an element
    - Declaring and Initializing an empty array
    - Initializing the elements of the array
    - Printing an array
* Date: Dec 18th, 2024
* @author Caden Ryan
*/
public class Arrays {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
  public static void main(String[] args) {
	  /**
      Introduction
    */
    /*
    Sometimes we want to store many values, but we don't want to
    create so many variables

    For example, we have almost 30 students in the class. It would
    take a long time to write the variables for all the students,
    let alone keeping their marks.
    */

    /*
      This is why we can use an array - this allows us to refer to
      many of the same datatype using one name (identifier), and a number (index) for which one to use.

      To declare an array, we need the [] to indicate it is an array.
      The type of array needs to be stated as well.
    */

    /**
      Declaring and Initializing a pre-filled array
    */
    System.out.println("---------------------------------------------");
    System.out.println("Declaring and Initializing a pre-filled array");
    System.out.println("---------------------------------------------");
    //Declares and initializes an array with 3 values, or 3 *elements*
    String [] fruits = {"Apple","Banana","Lemon"};

    //Modify the array above by adding 2 more fruits to it
    fruits = new String[]{"Apple", "Banana", "Lemon", "Mango", "Orange"};

    //Declare and initialize an array of 3 marks (double data type)
    double[] marks = {85.5, 90.0, 72.5};

    /**
      Using an element
    */
    System.out.println();
    System.out.println("----------------");
    System.out.println("Using an element");
    System.out.println("----------------");
    //To use an element, we use the name(identifier) of the array,
    //and the numbered index of the elements.
    System.out.println(fruits[1]); 
    //What does it print out? Did it match what you think it 
    //should print?
    //It should print: Banana

    //Try printing out the first and last fruit in the array
    System.out.println("First fruit: " + fruits[0]);
    System.out.println("Last fruit: " + fruits[fruits.length - 1]);

    //Create a new variable called sum. Add the values of the marks
    //array to it, and print it out.
    double sum = 0;
    for (double mark : marks) {
      sum += mark;
    }
    System.out.println("Sum of marks: " + sum);

    /**
      Assigning a value in an element
    */
    System.out.println();
    System.out.println("-------------------------------");
    System.out.println("Assigning a value in an element");
    System.out.println("-------------------------------");
    //To assign a value to a specific element, it is the same as for
    //when you use a variable
    //you need the variable name(identifier), and the index
    fruits[0] = "Mangosteen";
    System.out.println("Updated first fruit: " + fruits[0]);

    //Assign the 3rd mark to be 0
    marks[2] = 0;
    System.out.println("Updated third mark: " + marks[2]);

    /**
      Declaring and Initializing an empty array
    */
    System.out.println();
    System.out.println("-----------------------------------------");
    System.out.println("Declaring and Initializing an empty array");
    System.out.println("-----------------------------------------");
    //When declaring an array, it works just like any other variable.
    boolean [] isPassing;

    //When initializing the array, you are simply creating the space
    //in computer memory to store the values. The actual elements may not be
    //initialized, depending on the language.

    //this initializes the array to hold 5 elements
    isPassing = new boolean[5];

    System.out.println("First value of isPassing: " + isPassing[0]);

    //Declare and initialize an array of 3 student names
    String[] students = new String[3];
    students[0] = "John";
    students[1] = "Mary";
    students[2] = "Paul";
    
    //print out the first element. What does it say?
    System.out.println("First student: " + students[0]);

    /*
      Initializing the elements of the array
    */
    System.out.println();
    System.out.println("--------------------------------------");
    System.out.println("Initializing the elements of the array");
    System.out.println("--------------------------------------");
    //same as above
    //you need the variable name(identifier), and the index
    isPassing[0] = true;
    isPassing[1] = true;
    isPassing[2] = false;
    isPassing[3] = true;
    isPassing[4] = false;

    //Initialize the elements of the student names. Print them out.
    System.out.println("Students: ");
    for (String student : students) {
      System.out.println(student);
    }

    /**
      Printing an array
    */
    System.out.println();
    System.out.println("-----------------");
    System.out.println("Printing an array");
    System.out.println("-----------------");

    System.out.println(isPassing);
    //What do you see printed? Is it useful for us?
    //It will print something like "[Z@15db9742", which is the default toString() representation.
    //We need to loop through the array to print the actual values.

    //How do you think we can print out each element of the array?
    System.out.println("Printing elements of isPassing array:");
    for (boolean passing : isPassing) {
      System.out.println(passing);
    }
  }
}	