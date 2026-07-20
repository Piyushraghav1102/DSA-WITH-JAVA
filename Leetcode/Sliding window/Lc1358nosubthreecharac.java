import java.util.HashMap;
import java.util.Map;

public class Lc1358nosubthreecharac {
    
    public static int numberOfSubstrings(String s) {
        
        int n = s.length();

        int low = 0, count = 0;
        Map<Character, Integer> hm = new HashMap<>();

        for (int high = 0; high < n; high++) {
            char ch = s.charAt(high);

            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

            while (hm.size() >= 3) {
                count += n - high;
                hm.put(s.charAt(low), hm.get(s.charAt(low)) - 1);
                if (hm.get(s.charAt(low)) == 0) {
                    hm.remove(s.charAt(low));
                }
                low++;
            }
            
        }
        return count;
        
    }

    public static int numberOfSubstringsoptimal(String s) {

        int[] count = new int[3]; // a, b, c
        int left = 0;
        int n = s.length();
        int ans = 0;

        for (int right = 0; right < n; right++) {

            count[s.charAt(right) - 'a']++;

            // when window is valid
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {

                ans += (n - right);

                count[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return ans;
    }

        public static void main(String[] args) {
        String s = "aaabc";

        System.out.print(numberOfSubstringsoptimal(s));
    }
}
