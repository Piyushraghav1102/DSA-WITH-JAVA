import java.util.*;

public class bit {

    public static void bitevenodd(int n) {
        int bit = 1;

        if ((n & bit) == 1) {
            System.out.print("its its odd --");
        } else {
            System.out.print("its is even ");
        }
    }

    public static int checkithbit(int n, int i) {

        int bit = 1 << i;
        if ((n & bit) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Give the no :-");
        // int n = sc.nextInt();

        // bitevenodd(n);
        System.out.println(checkithbit(10, 2));
    }
}
