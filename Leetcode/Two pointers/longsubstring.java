
import java.util.HashSet;

public class longsubstring {
    
    public static int lengthOfLongestSubstring(String s) {
       
        int n = s.length();
        int size = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            size = Math.max(size, right - left + 1);
        }
        
        return size;
     }
    
     public static void main(String[] args) {
        
         String s = "abcnnsasbcb";

         System.out.println("This is the maximum length :-"+lengthOfLongestSubstring(s));



    }
}
