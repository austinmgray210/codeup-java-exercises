// TODO: Create a program that outputs "Hello, World!" to the console.

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");


// TODO: Run the application using the "Run" menubar item in IntelliJ (Note there are many ways to run a Java file). IntelliJ will first compile your HelloWorld.java file, then execute the compiled code.

// TODO: Look at your project structure. You should notice a new directory named out. This is where IntelliJ puts the compiled Java files, to keep them separate from the source code.

// TODO: Try renaming the main method. What happens when you try to run the program?

// It disables the class name and doesn't allow the program to run

// TODO: System.out.println is used to output information to the console with a newline. System.out.print can be used to output information without a newline. Refactor your code to use two System.out.print statements without changing the output.

//        System.out.print("Hello, World!");

// TODO: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

//        int myFavoriteNumber = 7;
//        System.out.println(myFavoriteNumber);

// TODO: Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//
//        String myString = "Negativity breeds negativity";
//        System.out.println(myString);

// TODO: Change your code to assign a character value to myString. What do you notice?

//        String myString = 'Negativity breeds negativity';
//        System.out.println(myString); // Unclosed Character literal error

// TODO: Change your code to assign the value 3.14159 to myString. What happens?

//        String myString = 3.14159;
//        System.out.println(myString); // incompatible types error because it can't be converted

// TODO: Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

//    long myNumber = ;
//    System.out.println(myNumber); // Illegal start of expression error

// TODO: Change your code to assign the value 3.14 to myNumber. What do you notice?

//    long myNumber = 3.14;
//    System.out.println(myNumber); // Incompatable Types error

// TODO: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

//    long myNumber = 123L;
//    System.out.println(myNumber); // Prints 123

// TODO: Change your code to assign the value 123 to myNumber.

//    long myNumber = 123;
//    System.out.println(myNumber); // Prints 123

// TODO: Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

// Because long only accepts an integer, not a decimal.

// TODO: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

//    float myNumber = (float) 3.14;
//    System.out.println(myNumber); // Incompatible types

//        float myNumber = (float) 3.14;
//        double myNumber = 3.14;

// TODO: Uncomment the following code blocks one at a time and execute them

//int x = 5;
//System.out.println(x++);
//System.out.println(x);

// prints 5 and 6

//int x = 5;
//System.out.println(++x);
//System.out.println(x);

// prints 6 and 6

// TODO: What is the difference between the above code blocks? Explain why the code outputs what it does.

// The first one is incrementing after
// The second one is incrementing before

// TODO: Try to create a variable named class. What happens?

//var class = something;
        // class is a reserved word

// TODO: Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//String theNumberThree = "three";
//Object o = theNumberThree;
//int three = (int) o;

// TODO: Uncomment the code above and then run it. Does the result match with your expectation?

// I'm not sure

// TODO: How is the above example different from the code block below?

// int three = (int) "three";

// TODO: What are the two different types of errors we are observing?



// TODO: Rewrite the following expressions using the relevant shorthand assignment operators:

//int x = 4;
//x = x + 5;    // Prints 9

//    int x = 4;
//    x += 5;   // prints 9
//        System.out.println(x);

//int x = 3;
//int y = 4;
//y = y * x;  // Prints 12

//    int x = 3;
//    int y = 4;
//    y *= x;   // Prints 12
//        System.out.println(y);

//int x = 10;
//int y = 2;
//x = x / y;
//y = y - x;  // Prints -3

//    int x = 10;
//    int y = 2;
//    x /= y;
//    y -= x;   // Prints -3
//        System.out.println(y);

// TODO: What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

        // If I add 1 to an value of 127 with type of byte (-128 to 127) it jumps from 127 to -128
        // It loops from the so if  1,2,3...127, -128,-127,-126

// Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

//    byte someNumber = (byte) -128;
//    --someNumber;
//    System.out.println(someNumber);

//        byte someNumber = (byte) 0;
//        --someNumber;
//            System.out.println(someNumber);





    }
}
