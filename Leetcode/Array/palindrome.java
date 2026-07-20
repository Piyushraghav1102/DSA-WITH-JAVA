public class palindrome {

    public static Boolean Validatepalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if (s.charAt(low) == s.charAt(high)) {
                return true;
                // System.out.println("String is palindrome");
            }
        }
        return false;
    }

    public static void main(String args[]) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(Validatepalindrome(s));

    }
}
