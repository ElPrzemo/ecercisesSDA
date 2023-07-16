
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Podaj datę najbliższych zajęć w SDA w formacie dzień/miesiąc/rok");

        String date = scanner.nextLine();

        LocalDate localDateNow = LocalDate.now();
        LocalDate dateOfExercises = LocalDate.parse(date, formatter);

        long days = ChronoUnit.DAYS.between(localDateNow, dateOfExercises);

        System.out.println("Do następnych zajęć w SDA zostało dni: " + days);

    }
}
