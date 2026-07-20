import java.util.*;

public class allpatterns {
    public static void main(String main[]) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the patterns rows");
        // int row=sc.nextInt();
        int n = 5;
        char ch = 'A';
        // for(int i=1; i<=5; i++){

        // for(int j=5; j>=i; j--){ //Inverted star print
        //
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {

                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
