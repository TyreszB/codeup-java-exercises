package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies by category");

        int choice = scanner.nextInt();

        while (choice != 0) {
            if (choice == 1) {
                Movie[] movies = MoviesArray.findAll();
                for (Movie movie : movies) {
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                }
            } else if (choice == 2) {
                System.out.println("Which category do you want to view?");
                String category = scanner.next();

                Movie[] movies = MoviesArray.findAll();
                for (Movie movie : movies) {
                    if (movie.getCategory().equalsIgnoreCase(category)) {
                        System.out.println(movie.getName());
                    }
                }
            }

            System.out.println("What would you like to do next?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies by category");

            choice = scanner.nextInt();
        }
    }
}
