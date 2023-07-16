import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

public class Exercise22 {
    public static void main(String[] args) {


        String[] stringTable = new String[]{"jeden", "dwa", "trzy", "cztery", "pięć", "sześć", "siedem", "osiem"};

        Arrays.sort(stringTable, Comparator.comparingInt(String::length));

        for (String name : stringTable
        ) {
            System.out.print(name + ", ");

        }

        System.out.println();
        System.out.println("Najmniejszy obiekt tablicy to: " + stringTable[0]);
        System.out.println("Największy obiekt tablicy to: " + stringTable[stringTable.length - 1]);


        int sum1 = 0;

        for (int i = 0; i < stringTable.length - 1; i++) {
            sum1 += stringTable[i].length();
        }

        double averege = (double) sum1 / (stringTable.length - 1);

        System.out.println("Średnia ilość znaków w tablicy to: " + averege);


        Pattern pattern = Pattern.compile("[AaEeIiOoUuÓóYyĄąIiĘę]+");


        for (int j = 0; j < stringTable.length - 1; j++) {
            boolean matches = pattern.matcher(stringTable[j].substring(2, 3)).matches();
            System.out.println(matches + " " + stringTable[j]);
        }

    }
}
