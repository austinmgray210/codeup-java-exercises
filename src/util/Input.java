package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScan() {
        return scanner;
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        boolean value;
        System.out.print(prompt);
        String entry = scanner.next();
        if (entry.equalsIgnoreCase("y") || entry.equalsIgnoreCase("yes")) {
            value = true;
        } else {
            value = false;
        }
        return value;
    }


    public int getInt(int min, int max) {
        System.out.print("Please enter a value between " + min + " and " + max + ": ");
        int entry = scanner.nextInt();
        if (entry < min || entry > max) {
            return getInt(min, max);
        } else {
            return entry;
        }
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        String entry = scanner.next();
        try {
            return Integer.parseInt(entry);
        } catch (NumberFormatException e) {
            System.out.println("Bro, I was asking for an integer. Try again.");
            return getInt(prompt);
        }
    }

    public double getDouble(double min, double max) {
        System.out.print("Please enter a decimal between " + min + " and " + max + ": ");
        double entry = scanner.nextDouble();
        if (entry < min || entry > max) {
            return getDouble(min, max);
        } else {
            return entry;
        }
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        String entry = scanner.next();
        try {
            return Double.parseDouble(entry);
        } catch(NumberFormatException e) {
            System.out.println("Bro, please read the prompt and try again.");
            return getDouble(prompt);
        }
    }

    public int getHex(String prompt) {
        System.out.print(prompt);
        String entry = scanner.next();
        try {
            return Integer.valueOf(entry, 16);
        } catch(NumberFormatException e) {
            System.out.println("Bro, please read the prompt and try again.");
            return getHex(prompt);
        }
    }

    public int getBinary(String prompt) {
        System.out.println(prompt);
        String entry = scanner.next();
        try {
            return Integer.valueOf(entry, 2);
        } catch(NumberFormatException e) {
            System.out.println("Gotta read the prompt, yo.");
            return getBinary(prompt);
        }
    }
}