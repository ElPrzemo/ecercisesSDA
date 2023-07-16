import java.util.Scanner;

public class exercise10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz liczbę a policzymy sumę jej cyfr: ");
        int userNumber = scanner.nextInt();


        int suma = 0;

        while (userNumber > 0) {
            int cyfra = userNumber % 10;
            suma += cyfra;
            userNumber /= 10;
        }

        System.out.println("Suma cyfr podanej liczby wynosi: " + suma);
    }
}


