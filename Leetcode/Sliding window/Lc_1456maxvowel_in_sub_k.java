public class Lc_1456maxvowel_in_sub_k {
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static int maxVowels(String s, int k) {
        
        int n = s.length();
        int maxvowels = 0, currvowel = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currvowel++;
            }
        }
        maxvowels = currvowel;

        for (int i = k; i < n; i++) {
            
            if (isVowel(s.charAt(i))) {
                currvowel++;
            }
        
            if (isVowel(s.charAt(i - k))) {
                currvowel--;
            }
        
            maxvowels = Math.max(currvowel, maxvowels);
        }
        return maxvowels;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println("Maximum vowel in substring is :-"+maxVowels(s, 3));

    }
}
