import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę policzymy dla niej ciąg Fibonnaciego: ");

        int fibonacci = scanner.nextInt();

        System.out.println("Podana liczba ciągu Fibonacciego to: " + countFibonnaci(fibonacci));

    }

    public static int countFibonnaci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        } else {
            return countFibonnaci(number - 1) + countFibonnaci(number - 2);
        }
    }
}
