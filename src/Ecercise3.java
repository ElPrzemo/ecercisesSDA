import java.util.Scanner;

public class Ecercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę A: ");
        int a = scanner.nextInt();

        System.out.println("Podaj liczbę B: ");
        int b = scanner.nextInt();

        System.out.println("Podaj liczbę C: ");
        int c = scanner.nextInt();

        double delta = b*b - 4*(a*c);

        double x1 = (-b - Math.sqrt(delta)) / (2*a);
        double x2 = (-b - Math.sqrt(delta)) / (2*a);

        System.out.println("To jest delta: " + delta);

    }
}
