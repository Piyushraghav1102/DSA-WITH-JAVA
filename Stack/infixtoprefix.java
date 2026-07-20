import java.awt.font.NumericShaper;
import java.util.Stack;

public class infixtoprefix {
    public static void main(String[] args) {
        
        String infix = "4-3+2*4/6";
        System.out.println(infix);

        Stack<String> num = new Stack<String>();

        Stack<Character> op = new Stack<Character>();
    
        for (int i = 0; i < infix.length(); i++) {

            char ch = infix.charAt(i);

            int ascii = (int) ch;

                if (ascii >= 48 && ascii <= 57) {// 0 to 9
                    String st = "" + ch;
                    num.push(st);
                } 
                else if (op.size()==0 || ch=='(' || op.peek()=='(')
                    op.push(ch);
                
                else if (ch == ')') {
                    while (op.peek() != '(') {

                        String val2 = num.pop();
                        String val1 = num.pop();
                        char o = op.pop();
                        //
                        String st = o + val1 + val2;
                        num.push(st);

                    }
                    op.pop(); //'('hata diya
                }
                
                else {
                    if(ch=='+' || ch=='-'){
                        String val2 = num.pop();
                        String val1 = num.pop();
                        char o = op.pop();
                        //
                        String st = o + val1 + val2;
                        num.push(st);
 
                        op.push(ch);
                    }

                    if (ch == '*' && ch == '/') {

                        if (op.peek() == '/' || op.peek() == '*') {

                            String val2 = num.pop();
                            String val1 = num.pop();
                            char o = op.pop();
                            //
                            String st = o + val1 + val2;
                            num.push(st);

                            //push the character
                            op.push(ch);

                        } 
                        else
                            op.push(ch);
                    }
                    
                }
            }
                
            while (num.size() > 1) {

                String val2 = num.pop();
                String val1 = num.pop();
                char o = op.pop();
                //
                String st = o + val1 + val2;
                num.push(st);
            }
        
            String Prefix = num.pop();

        System.out.println(Prefix);

    }
}
