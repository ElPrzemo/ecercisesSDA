import java.util.Scanner;

public class Ecercise24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę którą będziemy mieli potęgować: ");
        int userNumber = scanner.nextInt();

        System.out.println("Podaj do której potęgi mamy policzyć liczbę: ");
        int powDigit = scanner.nextInt();

        System.out.println(exponent(userNumber, powDigit));

    }

    public static int exponent(int userNumber, int powDigit) {
        if (powDigit == 0) {
            return 1;
        } else {
            return userNumber * exponent(userNumber, powDigit - 1);
        }
    }
}

