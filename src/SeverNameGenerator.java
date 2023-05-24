import java.util.Random;

public class SeverNameGenerator {
    public static String getRandomElement(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }

    public static void main(String[] args) {
        String[] adjectives = {"dedicated", "friendly", "brave", "clever", "eager", "fierce", "growing", "happy", "jolly", "kind"};
        String[] nouns = {"photon", "server", "database", "application", "program", "website", "network", "algorithm", "protocol", "firewall"};
        String serverName = getRandomElement(adjectives) + "-" + getRandomElement(nouns);
        System.out.println("Here is your server name: " + serverName);
    }

}
