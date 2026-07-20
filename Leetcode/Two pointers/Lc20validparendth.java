import java.util.Stack;

public class Lc20validparendth{
   
    public static boolean isValid(String s) {
        Stack<Character> s1 = new Stack();
    
        for (int i = 0; i < s.length(); i++) {
            char st = s.charAt(i);
            if (st == '(' || st == '{' || st == '[')
                s1.push(st);
            else {
                if (s1.isEmpty())
                    return false;
                
                char st1=s1.pop();
                if ( st == ')'&& st1 != '(')return false;
                else if(st == '}'&& st1 != '{')return false;
                else {
                    if (st == '[' && st1 != ']')
                        return false;
                }
            }
        }
        
        return s1.empty();

    }
   
    public static void main(String[] args) {
 
        String s = "({})[]";
        System.out.println("Thi String is valid ? = "+isValid(s));
    
    }
}