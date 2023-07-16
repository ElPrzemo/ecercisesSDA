package Exercise199;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

       Poem illiada = new Poem("Homer", "Grecka", 765);
       Poem panTadeusz = new Poem("Mickiewicz", "Polska", 543);
       Poem wierszJanusza = new Poem("Januszowa", "Januszowa narodowość", 378);


       Poem[] poems = new Poem[3];

       poems[0]=illiada;
       poems[1]=panTadeusz;
       poems[2]=wierszJanusza;

       sortedByStropheNumbers(poems);


       System.out.println(poems[0].getNationality());

    }

   private static void sortedByStropheNumbers(Poem[] poems) {
      Arrays.sort(poems, (o1, o2) -> Integer.compare(o2.getStropheNumbers(), o1.getStropheNumbers()));
   }
}
