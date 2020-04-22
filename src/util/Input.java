package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner;

    public static void setScanner(Scanner scanner) {
        Input.scanner = scanner;
    }

    // Ask user for input and make sure we get a string
    public static String getString(String prompt) throws Exception {
        if (scanner == null) {
            throw new Exception("Input Utility's scanner is not set");
        }

        String inputString;
        if (prompt != null) {
            System.out.println(prompt);
        }
        inputString = scanner.nextLine();
        return inputString;
    }

    public static String getString() throws Exception {
        return getString(null);
    }


    //

    public static boolean yesNo(String prompt) throws Exception {
        if (scanner == null) {
            throw new Exception("Input Utility's scanner is not set");
        }

        boolean response; // this will store the user's response and return true/false from this method
        if (prompt != null) {
            System.out.println(prompt);
        }
        response = scanner.nextLine().toLowerCase().contains("y");
        return response;
    }

    public static boolean yesNo() throws Exception { // Overloaded method for yesNo.
        return yesNo(null);
    }


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Input.setScanner(scanner);

        String quote = Input.getString("What's your favorite quote?");
        System.out.println(quote);

        boolean continueOrNot = Input.yesNo("Do you want to continue?");
        if (continueOrNot) {
            System.out.println("User wants to continue");
         } else {
            System.out.println("User does not want to continue");
         }
        }


}