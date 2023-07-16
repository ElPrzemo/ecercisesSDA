import java.util.Scanner;
import java.util.regex.Pattern;

public class exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        String b;

        Pattern pattern = Pattern.compile("[a-z]+");

        System.out.println("Podaj pierwszą literkę: ");
        do {
            a = scanner.nextLine();
        } while (a.length() != 1 || !pattern.matcher(a).matches());

        System.out.println("Podaj drugą literkę: ");
        do {
            b = scanner.nextLine();
        } while (b.length() != 1 || !pattern.matcher(b).matches());

        char aa = a.charAt(0);
        char bb = b.charAt(0);

        int ascii1 = (int) aa;
        int ascii2 = (int) bb;

        System.out.println("Pierwsza litera to: " + aa + ", wartość ASCII dla pierwszej litery to: " + ascii1);
        System.out.println("Druga litera to: " + bb + ", wartość ASCII dla drugiej litery to: " + ascii2);
        System.out.println();
        System.out.println("Różnica znaków pomiędzy literkami to: " + (ascii1 - ascii2));
    }
}
