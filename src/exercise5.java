import java.util.Scanner;
import java.util.regex.Pattern;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoją liczbę, wypiszemy wszystkie liczby pierwsze większe od 1 i mniejsze od podanej liczby: ");

        int userNumber = scanner.nextInt();

        for (int i = 2; i < userNumber; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static class Exercise18 {
        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            Pattern pattern = Pattern.compile("[a]*psik");

            System.out.println("Podaj tekst: ");
            String userWord = scanner.nextLine();

            if (pattern.matcher(userWord).matches()){
                System.out.println("Użytkownik kichnął bo wpisał: "+ userWord);
            }else {
                System.out.println("Użytkownik nie kichnął.");
            }
        }
    }
}