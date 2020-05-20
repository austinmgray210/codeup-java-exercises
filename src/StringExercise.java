/**
 * Exercises
 * <p>
 * String Basics.
 */


public class StringExercise {

    /**
     * For each of the following output examples: create a String variable that contains the
     * desired output and print it out to the console, you can do this with only one String
     * variable and one print statement for each output example.
     *
     * We don't need no thought control
     *
     * Check "this" out!, "s inside of "s!
     *
     * In windows, the main drive is usually C:\
     *
     * I can do backslashes \, double backslashes \\,
     * and the amazing triple backslash \\\!
     */
    public static void main(String[] args) {
        StringExercise se = new StringExercise();
        String string = new String();
        string = "We don't need no thought control\n";
        System.out.println(string);
        string = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(string);
        string = "In windows, the main drive is usually C:\\\n";
        System.out.println(string);
        string = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n";
        System.out.println(string);
    }
}