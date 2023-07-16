import java.util.Scanner;

public class exerciseN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę policzymy dla niej silnie");

        int n = scanner.nextInt();

        int nn = 1;

        for (int i = 1; i <= n; i++) {

            nn *= i;
        }
        System.out.println(nn);
    }
}
