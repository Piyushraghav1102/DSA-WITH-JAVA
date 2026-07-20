import java.util.HashMap;
import java.util.Map;

public class Lc_424longrepstring {
    
    public static int characterReplacement(String s, int k) {

        Map<Character, Integer> h = new HashMap<>();

        int n = s.length(), maxlen = 0, maxelem = 0;
        int low = 0;

        for (int high = 0; high < n; high++) {
            char ch = s.charAt(high);

            h.put(ch, h.getOrDefault(ch, 0) + 1);
            maxelem = Math.max(maxelem, h.get(ch));

            while ((high - low + 1) - maxelem > k) {
                char leftchar = s.charAt(low);
                h.put(leftchar, h.get(leftchar) - 1);
                low++;

            }
            maxlen = Math.max(maxlen, high - low + 1);

        }
        return maxlen;

    }
   
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(characterReplacement(s, 2));
    }
}
