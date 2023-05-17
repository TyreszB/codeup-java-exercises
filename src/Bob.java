import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Say something to bob.");
        String endMessage = sc.nextLine();
        if (endMessage.endsWith("!")) {
            System.out.println("Bob: Woah, chill out!");
        } else if (endMessage.endsWith("?")) {
            System.out.println("Bob: Sure.");
        } else if (endMessage.equals("")) {
            System.out.println("Bob: Fine. Be that way!");
        } else {
            System.out.println("Bob: Whatever.");
        }
        ;


    }
}
