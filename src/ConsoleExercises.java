import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

// TODO: Copy this code into your main method: double pi = 3.14159;

//         double pi = 3.14159;

// TODO: Write some Java code that uses the variable pi to output the following:
// The value of pi is approximately 3.14.

//        System.out.format("The value of pi is approximately %.2f%n", pi);

// TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner input = new Scanner(System.in);

//        System.out.println("Please enter an integer");
//
//        int userInt = input.nextInt();
//
//        System.out.printf("User input number: %d.", userInt);

// TODO: What happens if you input something that is not an integer?
// It throws an error for mismatched input

// TODO: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//        System.out.println("Please enter 3 words");

//        String firstWord = input.next();
//        String secondWord = input.next();
//        String thirdWord = input.next();
//
//        System.out.printf("\nHere's your first word: %s.\n Here's your second word: %s.\n Here's your third word: %s.\n", firstWord, secondWord, thirdWord);


//        What happens if you enter less than 3 words? It doesn't stop scanning until three are entered.
//        What happens if you enter more than 3 words? It stops recording inputs after the first 3 are entered.

// TODO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//        System.out.println("Please type a sentence.");

//        String sentence = input.next();
//        System.out.print(sentence);

//        do you capture all of the words? No, it only captures the first word before a white space.

// TODO: Rewrite the above example using the nextLine method.

//        String sentence = input.nextLine();
//        System.out.print(sentence);

// TODO: Calculate the perimeter and area of Codeup's classrooms.
// TODO: Prompt the user to enter values of length and width of a classroom at Codeup.
        // Use the nextLine method to get user input and [parse]
        System.out.println("Enter the Length of the classroom");
        String length = input.nextLine();
        System.out.println("Enter the Width of the classroom");
        String width = input.nextLine();

      int lengthFixed = Integer.parseInt(length);
      int widthFixed = Integer.parseInt(width);

      System.out.printf("The perimeter of the classroom is %d feet.\n", ((widthFixed*2) + (lengthFixed*2)));
      System.out.printf("The area of the classroom is %d square feet.\n", (widthFixed * lengthFixed));



// TODO: BONUS
// TODO: Accept decimal entries.

//      double lengthFixed = Double.parseDouble(length);
//      double widthFixed = Double.parseDouble(width);
//
//      System.out.printf("The perimeter of the classroom is %.2f feet.\n", ((widthFixed*2) + (lengthFixed*2)));
//      System.out.printf("The area of the classroom is %.2f square feet.\n", (widthFixed * lengthFixed));


// TODO: Calculate the volume of the rooms in addition to the area and perimeter.

//        System.out.println("Enter the Height of the classroom");
//        String height = input.nextLine();
//
//        int lengthFixed = Integer.parseInt(length);
//        int widthFixed = Integer.parseInt(width);
//        int heightFixed = Integer.parseInt(height);
//
//      System.out.printf("The perimeter of the classroom is %d feet.\n", ((widthFixed*2) + (lengthFixed*2)));
//      System.out.printf("The area of the classroom is %d square feet.\n", (widthFixed * lengthFixed));
//      System.out.printf("The volume of the classroom is %d square feet.\n", ((widthFixed * lengthFixed) * heightFixed));



    }

    private static void parseInt(String width) {
    }
}
