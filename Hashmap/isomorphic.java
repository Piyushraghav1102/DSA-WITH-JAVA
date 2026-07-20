
import java.util.HashMap;

public class isomorphic {
        
    public boolean Findisomorphic(String S, String T) {

        HashMap<Character, Character> h1 = new HashMap<>();

        if (S.length() != T.length())
            return false;
        else {

            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                char ch2 = T.charAt(i);

                if (h1.containsKey(ch)) {

                    if (h1.get(ch) != ch2)
                        return false;
                  
                }
                else if (h1.containsValue(ch2))
                    return false;
               else
                    h1.put(ch, ch2);
                }
            }
        return true;

    }

    public static void main(String[] args) {

        isomorphic h1 = new isomorphic();

        String s1 = "abc";
        String s2 = "xyz";
        
        System.out.println("Is these String are isomorphic :- "+h1.Findisomorphic(s1, s2));

    }
}
