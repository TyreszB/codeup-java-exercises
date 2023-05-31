package util;

import java.util.Scanner;

public class Input extends Exception {
    private Scanner sc;

    public String getString() {
        this.sc = new Scanner(System.in);
        System.out.println("Give me a string: ");
        String stringInput = sc.nextLine();
        return stringInput;
    }

    public boolean yesNo() {
        this.sc = new Scanner(System.in);
        System.out.println("Give me Yes or no: ");
        String yesNoInput = sc.next();
        boolean confirm = yesNoInput.equalsIgnoreCase("y");
        return confirm;
    }

    public int getInt(int min, int max){
        this.sc = new Scanner(System.in);
        System.out.println("Give me an integer between " + min + " and " + max + ": ");
        try {
            String input = getString();
            int num = Integer.valueOf(input);
            if (num > min && num < max) {
                return num;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        return getInt(min,max);
    }

    public int getInt(){
        this.sc = new Scanner(System.in);
        System.out.println("Give me an integer: ");
        int num = sc.nextInt();
        return num;
    }

    public double getDouble(double min, double max){
        this.sc = new Scanner(System.in);
        System.out.println("Give me a double between " + min + " and " + max + ": ");
        try {
            String input = getString();
            double num = Double.valueOf(input);
            if (num > min && num < max) {
                return num;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid double.");
        }
        return getDouble(min,max);
    }

    public double getDouble(){
        this.sc = new Scanner(System.in);
        System.out.println("Give me a double: ");
        double num = sc.nextDouble();
        return num;
    }
    public int getBinary() {
        this.sc = new Scanner(System.in);
        System.out.println("Give me a binary number: ");
        try {
            String input = getString();
            int num = Integer.valueOf(input, 2);
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid binary number.");
        }
        return getBinary();
    }

    public int getHex() {
        this.sc = new Scanner(System.in);
        System.out.println("Give me a hexadecimal number: ");
        try {
            String input = getString();
            int num = Integer.valueOf(input, 16);
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid hexadecimal number.");
        }
        return getHex();
    }
}

