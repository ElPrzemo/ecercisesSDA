import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Wpisz swoją liczbę: policzymy sumę szeregu harmonicznego: ");

            int num = scanner.nextInt();
            double result = 0.0;
            double sum = 0.0;

            System.out.println("Ciąg harmoniczny to: ");

            for (int i = 1; i <= num; i++) {

                result = (double) 1 / i;
                sum +=result;

                System.out.print(result + ", ");


            }
        System.out.println();
        System.out.println("Suma ciągu harmonicznego to: " + sum);
        }
    }

