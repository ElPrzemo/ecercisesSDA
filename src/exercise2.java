import java.util.Scanner;

public class exercise2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj wagę w kilogramach: ");
            float weight = scanner.nextFloat();

            System.out.println("Podaj wzrost w centymetrach: ");
            int height = scanner.nextInt();
            float heightInMeters = height / 100.0f;

            float BMIindex = weight / (heightInMeters * heightInMeters);

            System.out.println("Twoje BMI to: " + BMIindex);

            if (BMIindex >= 18.5 && BMIindex <= 24.9) {
                System.out.println("Twoje BMI jest optymalne");
            } else {
                System.out.println("Twoje BMI nie jest optymalne");
            }
        }


}







