package movies;

import java.util.Scanner;

public class MoviesApplication {
    final static String[] categories = {"none", "all", "animated", "drama", "horror", "scifi", "musical", "comedy"};

    public static void main(String[] args) {
        Input scanner = new Input();
        Movie[] movieList = MoviesArray.findAll();

        int choice = 1;

        do {
            System.out.println();
            System.out.println("\t What would you like to do?");
            System.out.println("");
            System.out.println("\t 0 - exit");
            System.out.println("\t1 - view all movies");
            System.out.println("\t2 - view movies in the animated category");
            System.out.println("\t3 - view movies in the drama category");
            System.out.println("\t4 - view movies in the horror category");
            System.out.println("\t5 - view movies in the scifi category");
            System.out.println("\t6 - view movies in the musical category");
            System.out.println("\t7 - view movies in the comedy category");
            System.out.println("\t8- Add a movie");
            System.out.println("");
            System.out.println("\tEnter your choice:");

           choice = scanner.getInt(0, 8, "Enter your Choice: ");

           if(choice != 0 && choice != 8) {
               // Iterate through all movies and print them out based on user input choice
               for(Movie movie : movieList) {
                   switch (choice) {
                       case 1:
                           System.out.printf("\t%s -- %S\n", movie.getName(), movie.getCategory());
                           break;
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 7:
                           if (movie.getCategory().equalsIgnoreCase(categories[choice])) {
                               System.out.printf("\t%s -- %S\n", movie.getName(), movie.getCategory());
                           }
                           break;
                       default:
                           break;
                   }
               }
           }
           if(choice == 8) {
               movieList = addMovie(movieList, scanner);
           }
    } while( choice != 0);

        private static Movie[] addMovie(Movie[] movieList, Input scanner) {
            // if the user wants to add a movie, get the title and category and add to the MovieList array.
        String name = scanner.getString("Enter the movie name: ");
        String category = scanner.getString("Enter the movie category ");

        // create a new Movie object
            Movie newMovie = new Movie(name, category);
            Movie[] newList = null;
            int length = 0;

            if(movieList != null) {
                length = movieList.length;
                newList = Arrays.copyOf(movieList, length + 1);
            } else {
                newList = new Movie[1]; // empty list was passed in, so return list will only have one new movie in it.
            }
            // add the new Movie to our MovieList array
            newList[length] = newMovie;

            return newList;

        }
}







// try {
//        choice = scanner.getInt("Enter your choice: ");
//    } catch (NumberFormatException nfe) {
//        break;
//    }
//} while ();