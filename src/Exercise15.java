import java.util.*;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 liczb.");

        List<Integer> numbers = new ArrayList();

        for (int i = 0; i < 10; i++) {
            System.out.println("Wpisz liczbę: ");
            int x = scanner.nextInt();
            numbers.add(x);
        }

        System.out.println("Oto wypisane liczby : ");
        for (int z : numbers) {
            System.out.print(z + ", ");
        }

        System.out.println();

        Set<Integer> s = new HashSet<Integer>();

        for (int num : numbers) {
            if (s.add(num) == false)
                System.out.println(num + " is duplicated");
        }
    }
}



