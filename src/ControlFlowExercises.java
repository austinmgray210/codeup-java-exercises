import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//TODO: Loop Basics

//A: While
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//B: Do While
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i<=100);

        //Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//        do{
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//C: For
        //Refactor the previous two exercises to use a for loop instead.

//        for (int i = 100; i >= -10; i -=5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

// TODO: Write a program that prints the numbers from 1 to 100.

//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);

// TODO: For multiples of three: print “Fizz” instead of the number.

//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }

// TODO: For the multiples of five: print “Buzz”.

//            if ( i % 5 == 0) {
//                System.out.println("Buzz");
//            }

// TODO: For numbers which are multiples of both three and five: print “FizzBuzz”.

//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz!");
//            }
//        }


//TODO: Display a table of powers.

//        // Prompt the user to enter an integer.
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int userNumber = input.nextInt();
//
//        // Ask if the user wants to continue.
//
//        Scanner userConfirmPrompt = new Scanner(System.in);
//        System.out.println("Continue? [y/N]");
//        String userConfirm = userConfirmPrompt.next();
//        boolean userHasConfirmed = userConfirm.equals("y");
//
//        // Assume that the user will enter valid data.
//        // Only continue if the user agrees to.
//
//        if (userHasConfirmed) {
//
//
//            // Display a table of squares and cubes from 1 to the value entered.
//
//            String number = "number";
//            String squared = "squared";
//            String cubed = "cubed";
//
//            System.out.printf("%-5s | %-5s | %-5s %n", number, squared, cubed);
//            System.out.printf("------ | ------- | ----- %n");
//            for (int i = 1; i <= userNumber; i++) {
//                System.out.printf("%-7s| %-8s| %-6s%n", i, i * i, i * i * i);
//            }
//        } else {
//            System.out.println("Cancelling");
//        }

// TODO: Convert given number grades into letter grades.
        // Prompt the user for a numerical grade from 0 to 100.
//        Scanner numericalGradeInput = new Scanner(System.in);
//        System.out.println("Enter a numerical Grade from 0 to 100");
//        int numericalGrade = numericalGradeInput.nextInt();
//
//        // Prompt the user to continue.
//        Scanner userConfirmPrompt = new Scanner(System.in);
//        System.out.println("Continue? [y/N]");
//        String userConfirm = userConfirmPrompt.next();
//        boolean userHasConfirmed = userConfirm.equals("y");
//
//        if (userHasConfirmed) {
//            if (numericalGrade >= 88 && numericalGrade <= 100) {
//                System.out.printf("Your grade of %d is an A.", numericalGrade);
//            } else if (numericalGrade >= 80 && numericalGrade <= 87) {
//                System.out.printf("Your grade of %d is a B.", numericalGrade);
//            } else if (numericalGrade >= 67 && numericalGrade <= 79) {
//                System.out.printf("Your grade of %d is a C.", numericalGrade);
//            } else if (numericalGrade >= 60 && numericalGrade <= 66) {
//                System.out.printf("Your grade of %d is a D.", numericalGrade);
//            } else if (numericalGrade >= 0 && numericalGrade <= 59) {
//                System.out.printf("Your grade of %d is an F.", numericalGrade);
//            }
//        }


    }
}
