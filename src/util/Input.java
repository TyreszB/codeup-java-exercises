package util;

import java.util.Scanner;

public class Input {
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
        int num = sc.nextInt();
        if (num > min && num < max){
            return num;
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
        double num = sc.nextDouble();
        if (num > min && num < max){
            return num;
        }
        return getDouble(min,max);
    }

    public double getDouble(){
        this.sc = new Scanner(System.in);
        System.out.println("Give me a double: ");
        double num = sc.nextDouble();
        return num;
    }

}

