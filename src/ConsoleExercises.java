import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f",pi);
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter something: ");
//        int userInput = scanner.nextInt();
//        System.out.print(userInput);

//        System.out.print("Enter 3 words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.println(userInput1);
//        System.out.println(userInput2);
//        System.out.println(userInput3);

//        System.out.print("Enter a sentence: ");
//        String sentInput = scanner.nextLine();
//        System.out.printf(sentInput);
        scanner.useDelimiter("\n");
        System.out.print("Enter the width of the classroom: ");
        int width = scanner.nextInt();
        System.out.print("Enter the length of the classroom: ");
        int length = scanner.nextInt();
        System.out.print("Enter the height of the classroom: ");
        int height = scanner.nextInt();
        int volume = width * length * height;
        int perimeter = (width * 2) + (length * 2);
        int area = width *= length;
        System.out.printf("The total area of the classroom is: %d", area);
        System.out.printf("%nThe total perimeter of the classroom is: %d", perimeter);
        System.out.printf("%nThe total volume of the classroom is: %d", volume);


    }
}
