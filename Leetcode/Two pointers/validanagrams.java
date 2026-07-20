import java.util.Arrays;

public class validanagrams {
    public static boolean anagram(String s, String t) {

        char str1[] = s.toCharArray();
        char str2[] = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);

    }

    public static void main(String args[]) {
        String str = "car";
        String str2 = "rac";

        System.out.println(anagram(str, str2));
    }
}
