import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SILab1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
    }
 HEAD
    System.out.println(SILab1_1.filterOddLengthStrings(list));
=======
System.out.println(SILab1_2.makeBigStringFrom(list));
>>>>>>> fa5062a (Call method makeBigStringForm in main class)
}
