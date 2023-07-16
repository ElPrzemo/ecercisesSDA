import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 liczb.");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Wpisz liczbę: ");
            int x = scanner.nextInt();
            numbers.add(x);
        }

        System.out.println("Lista kolejnych liczb: ");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();

        Collections.sort(numbers);

        List<Integer> sequencedDigits = new ArrayList<>();

        for (int j = 0; j < numbers.size() - 1; j++) {
            if (numbers.get(j) < numbers.get(j + 1)) {
                sequencedDigits.add(numbers.get(j));
            }
        }

        System.out.println("Lista rosnących liczb: ");
        for (int k : sequencedDigits) {
            System.out.print(k + ", ");
        }
        System.out.println();
    }
}