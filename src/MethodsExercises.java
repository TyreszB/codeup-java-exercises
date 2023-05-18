import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        add(10,11);
//        subtract(11,5);
//        multiply(5,10);
//        divide(24,4);
//        modulus(99,3);
//        getInteger(1,10);
//        factorialThisNum();
        diceGame();
    }

    private static void modulus(int num1, int num2) {
        System.out.println(num1 % num2 == 0);
    }

    private static void multiply(int num1, int num2) {
        System.out.println(num1 *= num2);
    }

    private static void divide(int num1, int num2) {
        System.out.println(num1 / num2);

    }

    private static void subtract(int num1, int num2) {
        System.out.println(num1 -= num2);
    }

    public static void add(int num1, int num2) {
        System.out.println(num1 += num2);
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = sc.nextInt();
        if (userInput > min && userInput < max) {
            return userInput;
        }
        return getInteger(1, 10);
    }


    //-------------------------------------//

    public static int factorialThisNum() {

        String confirm = "y";

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer from 1 to 10:");
            int num = scanner.nextInt();
            if (num < 1 || num > 10) {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return factorialThisNum();
            }
            long result = factorial(num);
            System.out.println("The factorial of " + num + " is " + result + ".");
            System.out.println("Do you want to continue? (y/n)");
            confirm = scanner.next();
        } while (confirm.equalsIgnoreCase("y"));
        return 0;
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


//    ----------------------------------------------    //

public static int diceGame(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of sides for a pair of dice:");
    int sides = input.nextInt();
    String choice = "y";
    do {
        int roll1 = rollDice(sides);
        int roll2 = rollDice(sides);
        System.out.println("Roll 1: " + roll1);
        System.out.println("Roll 2: " + roll2);
        System.out.println("Roll again? (y/n)");
        choice = input.next();


    } while (choice.equalsIgnoreCase("y"));
    return 0;
}
    public static int rollDice(int sides) {
        int result = (int) (Math.random() * sides) + 1;
        return result;
    }


}
