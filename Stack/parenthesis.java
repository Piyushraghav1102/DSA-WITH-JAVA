import java.util.*;


public class parenthesis {
    
    public static Boolean checkparenthis(String st) {
        
        Stack<Character> s = new Stack<>();

        int n = st.length();

        for (int i = 0; i < n; i++) {

            char ch = st.charAt(i);

            if (ch == '(' || ch == '{' || ch=='[') {
                s.push(ch);
            } else {
                if (s.peek() == '(' || s.peek()=='{'||s.peek()=='[') {
                    s.pop();
                }
                else if(s.size() == 0)
                    return false;
            }
        }
        

        if (s.size() > 0)
            return false;

        return true;
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String :- ");
        String c = sc.next();
        

        System.out.println("Is parenthesis is balanced ? :- "+checkparenthis(c));
    }
}
