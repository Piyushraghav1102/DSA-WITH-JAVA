
import java.util.Scanner;
import java.util.*;

public class String2 {

    /*
     * public static void PrintLetter(String str) {
     * 
     * for (int i = 0; i < str.length(); i++) {
     * System.out.print(str.charAt(i) + " ");
     * }
     * }
     */

    /*
     * public static boolean Palindrome(String str) {
     * 
     * int n = str.length();
     * boolean flag = false;
     * 
     * for (int i = 0; i < str.length() / 2; i++) { // Loop will run at half of the
     * String length
     * 
     * if (str.charAt(i) == str.charAt(n - 1 - i)) {
     * return flag = true;
     * }
     * 
     * }
     * return flag;
     * }
     */

    public static float getshortest(String str) {
        int x = 0, y = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char direct = str.charAt(i);

            if (direct == 'N' || direct == 'n') {
                x++;
            } else if (direct == 'S' || direct == 's') {
                y--;
            } else if (direct == 'E' || direct == 'e') {
                x++;
            } else {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the newn String :- ");
        String fullname = sc.nextLine();

        // PrintLetter(fullname);
        // System.out.println("Is it palindrome ? :- " + Palindrome(fullname));
        // System.out.println(getshortest(fullname));

    }
}
