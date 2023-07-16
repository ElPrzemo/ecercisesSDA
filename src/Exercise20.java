import java.util.Random;
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int score = getScore(random);

        System.out.println("Podaj swoją liczbę :");
        int userScore = getUserScore(scanner);

        userScore = getUserScore(scanner, score, userScore);

        System.out.println("BINGO!");
        System.out.println();
        System.out.println("Podana przez Ciebie liczba to: " + userScore);
        System.out.println("Natomiast wylosowana liczba to: " + score);
    }

    private static int getScore(Random random) {
        int score = random.nextInt(100+1);
        return score;
    }

    private static int getUserScore(Scanner scanner) {
        int userScore = scanner.nextInt();
        return userScore;
    }

    private static int getUserScore(Scanner scanner, int score, int userScore) {
        while (userScore != score) {
            if (userScore < score) {
                System.out.println("Twoja liczba jest za mała, próbuj dalej");
            } else if (userScore > score) {
                System.out.println("Twoja liczba jest za duża, próbuj dalej");
            }

            userScore = scanner.nextInt();
        }
        return userScore;
    }
}