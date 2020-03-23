import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        addition(9,3);
//
//        subtraction(9, 3);
//
//        multiplication(9,3);
//
//        division(9,3);
//
//        remainder(9,2);
//
//        System.out.println("Enter a number between 1 and 10: ");
//        getInteger(1, 10);
//
//        System.out.println("Enter a number between 1 and 10: ");
//        getFactorial(1, 10);

        diceRollerPrompt();

    }
// TODO: Create four separate methods. Each will perform an arithmetic operation:

// Addition

    public static int addition(int num1, int num2) {
        System.out.println(num1+num2);
        return (num1+num2);
    }

// Subtraction

    public static int subtraction(int num1, int num2) {
        System.out.println(num1-num2);
        return (num1-num2);
    }

// Multiplication

    public static int multiplication(int num1, int num2) {
        System.out.println(num1*num2);
        return(num1*num2);
    }

// Division

    public static int division(int num1, int num2) {
        System.out.println(num1/num2);
        return(num1/num2);
    }

// Modulus

    public static int remainder(int num1, int num2) {
        System.out.println(num1%num2);
        return(num1%num2);
    }

// TODO: Create a method that validates that user input is in a certain range

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if ((userInput < min) || (userInput > max)) {
            System.out.print("Enter a number between 1 and 10: ");
            getInteger(1, 10);
        } else {
            System.out.println("Your number is: " + userInput + ".");
        }
        return 0;
    }

// TODO: Calculate the factorial of a number.

    public static int getFactorial(int min, int max) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if ((userInput < min) || (userInput > max)) {
            System.out.print("Enter a number between 1 and 10: ");
            getFactorial(1, 10);
        } else {
            long counter = 1;
            long factorial = 1;
            for (long i = 1; i <= userInput; i++ ) {
                factorial *= counter;
                counter++;
            }
            System.out.printf("%s! = " + factorial + ".\n", userInput);
        }
        return 0;
    }


// TODO: Create an application that simulates dice rolling.

    public static void diceRollerPrompt() {
        Scanner playDiceGamePrompt = new Scanner(System.in);
        System.out.println("Do you want to roll some dice? [y/N]");
        String playDiceGameReply = playDiceGamePrompt.next();
        boolean userWantedToRollDice = playDiceGameReply.equals("y");
        if (userWantedToRollDice) {
            diceSimulator();
        }
    }

    public static void diceSimulator () {

        System.out.print("Enter number of sides for a die #1 ");
        Scanner inputOne = new Scanner(System.in);
        int dieOne = inputOne.nextInt();
        System.out.print("Enter number of sides for a die #2 ");
        Scanner inputTwo = new Scanner(System.in);
        int dieTwo = inputTwo.nextInt();
        Scanner userConfirmPrompt = new Scanner(System.in);
        System.out.println("Continue? [y/N]");
        String userConfirm = userConfirmPrompt.next();
        boolean userHasConfirmed = userConfirm.equals("y");

        if (userHasConfirmed) {
            rollDice(dieOne, dieTwo);
        }
    }
    public static void rollDice (int dieOne, int dieTwo){
        System.out.println("The dice have been rolled!");
        System.out.println("Die #1 rolls: " + (int) (Math.floor(Math.random() * dieOne) + 1));
        System.out.println("Die #2 rolls: " + (int) (Math.floor(Math.random() * dieTwo) + 1));
        diceReplayPrompt();
    }

    public static void diceReplayPrompt() {
        Scanner playDiceGamePrompt = new Scanner(System.in);
        System.out.println("Do you want to roll again? [y/N]");
        String playDiceGameReply = playDiceGamePrompt.next();
        boolean userWantedToRollDice = playDiceGameReply.equals("y");
        if (userWantedToRollDice) {
            diceSimulator();
        }
    }








}
