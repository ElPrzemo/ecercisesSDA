
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.util.Collections.sort;


public class exercise11 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Set<String> words = new TreeSet<>();

            System.out.println("Wpisuj słowa aż wypełni się lista, napisz \"starczy\" żeby zakończyć: ");
            String userWord = scanner.nextLine();

            while (!userWord.equalsIgnoreCase("starczy")) {
                words.add(userWord);
                userWord = scanner.nextLine();
            }


            System.out.println("Lista wprowadzonych słów: ");
            for (String word : words) {
                System.out.println(word);
            }
            System.out.println();

            if (!words.isEmpty()) {

                System.out.println("Najdłuższy element listy to: " + ((TreeSet<String>) words).last());
            } else {
                System.out.println("Lista jest pusta.");
            }
        }

}
