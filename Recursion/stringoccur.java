
import java.util.Scanner;

class stringoccur {

    static void Removeoccur(String s, int ind) {
        if (ind == s.length()) {
            return;
        }

        if (s.charAt(ind) != 'a') {
            System.out.print(s.charAt(ind));
        }

        Removeoccur(s, ind + 1);
    }

    static String ReverseStr(String s, int ind) {
        if (ind == s.length()) {
            return " ";
        }

        String s1 = ReverseStr(s, ind + 1) + s.charAt(ind);
        return s1;

    }

    static Boolean Palindrome(String s, int low, int high) {

        if (low >= high) {
            return true;
        }
        return (s.charAt(low) == s.charAt(high) && Palindrome(s, low + 1, high - 1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :- ");
        String s = sc.nextLine();

        // Removeoccur(s, 0);

        // Reverse the string
        // System.out.println(ReverseStr(s, 0));

        // Palindrome code
        System.out.println(Palindrome(s, 0, s.length() - 1));
    }
}