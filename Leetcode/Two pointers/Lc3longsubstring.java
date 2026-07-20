
import java.util.HashSet;
import java.util.Set;

public class Lc3longsubstring {
    
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0, low = 0;

        Set<Character> set = new HashSet<>();

        for (int high = 0; high < n; high++) {
            
            while (set.contains(s.charAt(high))) {
                set.remove(s.charAt(low));
                low++;
            }
            set.add(s.charAt(high));
            maxlen = Math.max(maxlen, high - low + 1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String str = "abcabbrkdjf";

        System.out.println("Maximum screen :- "+lengthOfLongestSubstring(str));
    }
}
