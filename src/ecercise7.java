import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ecercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wypisz którą liczbę ciągu Fibonnaciego mamy Ci wypisać: ");
        int fibonnaciIndex = scanner.nextInt();

        int n1=0,n2=1,n3;

        List<Integer> fibonnaciList = new ArrayList<>();
        fibonnaciList.add(n1);
        fibonnaciList.add(n2);



        for(int i=2;i<fibonnaciIndex;++i)//
        {
            n3=n1+n2;
            fibonnaciList.add(n3);
            n1=n2;
            n2=n3;
        }
        System.out.println(fibonnaciList.get(fibonnaciIndex-1));
    }
}
