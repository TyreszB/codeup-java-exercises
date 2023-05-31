package grades;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Student, String> students = new HashMap<>();

        Student tyresz = new Student("Tyresz");
        tyresz.addGrade(88);
        tyresz.addGrade(100);
        tyresz.addGrade(88);
        students.put(tyresz, "tyreszIsCool");

        Student bob = new Student("Bob");
        bob.addGrade(100);
        bob.addGrade(60);
        bob.addGrade(90);
        students.put(bob, "bobIsCool");

        Student mark = new Student("Mark");
        mark.addGrade(75);
        mark.addGrade(84);
        mark.addGrade(90);
        students.put(mark, "markIsCool");

        Student sidney = new Student("Sidney");
        sidney.addGrade(99);
        sidney.addGrade(79);
        sidney.addGrade(69);
        students.put(sidney, "sidneyIsCool");


        System.out.println("Welcome!");
        System.out.println("Here are your Git Hub username of students: ");
        students.forEach((key, value) -> System.out.printf("|%s| ", value));
        String awnser = "y";



        while (awnser.equalsIgnoreCase("y") || awnser.equalsIgnoreCase("yes")) {
            System.out.printf("%nWhat student would you like to see more information on?%n");
            String personUsername = sc.next();
            {
                if (students.containsKey(personUsername)) {
                    System.out.printf("Name: %s - Github Username: %s%n Current Average: %2.2f", students.get(personUsername), personUsername, students.get(personUsername));
                } else {
                    System.out.println("invalid");
                }
            System.out.printf("%nWould you like to see another student?%n");
            awnser = sc.next();
        }
        System.out.println("Goodbye, and have a wonderful day!\n");


    }


}
}
