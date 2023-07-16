import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[a-zA-Z' ']*[a]+[' ']*[psik]+[a-zA-Z' ']*");

        System.out.println("Napisz coś sprawdzimy czy kichasz!");

        String userText = scanner.nextLine();

         if (pattern.matcher(userText).matches()){
             System.out.println("Tak sie kicha na kielicha!");
         }else {
             System.out.println("Jesteś zdrowy nie masz kataru.");
         }

    }
}
