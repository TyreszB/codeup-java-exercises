import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while(i <= 15){
//            System.out.printf("current number is: %d %n", i);
//            i++;
//        }
//        long i = 2;
//        do{
//            System.out.println(i);
//            i = i *= i;
//        }while (i < 1000000);
//        for(int i = 5; i <= 15; i++){
//            System.out.printf("current number is %d %n", i);
//        }
//        for(long i = 2; i < 1000000; i*=i){
//            System.out.println(i);
//        }
//        for(int i = 0; i < 100; i++){
//            if(i % 5 == 0 && i % 3 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            }else {
//                System.out.println(i);
//            }
//        }
        Scanner sc = new Scanner(System.in);
//        boolean confirm = true;
//        do {
//            System.out.println("What number would you like to go up to? (1-5)");
//            int num = sc.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= num; i++) {
//                System.out.printf("%d      |", i);
//                System.out.printf(" %d       |", i * i);
//                System.out.printf(" %d     %n", i * i * i);
//
//            }
//            System.out.println("Would you like to continue? [y/n]");
//            String result = sc.next();
//            confirm = result.equals("y");
//        } while (confirm);
        boolean confirm = true;
        do{
            System.out.println("What is the students grade? (1-100)");
            int grade = sc.nextInt();
            if(grade >= 88){
                char letter = 'A';
                System.out.printf("The students grade is %s.%n", letter);
            } else if (grade < 88 && grade >= 80) {
                char letter = 'B';
                System.out.printf("The students grade is %s.%n", letter);
            } else if (grade < 80 && grade >= 67) {
                char letter = 'C';
                System.out.printf("The students grade is %s.%n", letter);
            } else if (grade < 67 && grade >= 60) {
                char letter = 'D';
                System.out.printf("The students grade is %s.%n", letter);
            } else if (grade < 60) {
                char letter = 'F';
                System.out.printf("The students grade is %s.%n", letter);
            }
            System.out.println("Would you like to continue? [y/n]");
            String result = sc.next();
            confirm = result.equals("y");
        }while (confirm);

    }


}
