import java.util.*;


public class infix {
        
    public static void main(String[] args) {
        
        String st = "4-3+2*4/6";
        System.out.println(st);


        Stack<Integer> num = new Stack<Integer>();

        Stack<Character> op = new Stack<Character>();
    
        for (int i = 0; i < st.length(); i++) {

            char ch = st.charAt(i);

            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                num.push(ascii - 48);
            } else if (op.isEmpty())
                op.push(ch);
                
            else {
                if (ch == '+' || ch == '-') {

                    int val2 = num.pop();
                    int val1 = num.pop();

                    if (op.peek() == '+')
                        num.push(val1 + val2);

                    if (op.peek() == '-')
                        num.push(val1 - val2);

                    if (op.peek() == '*')
                        num.push(val1 * val2);

                    if (op.peek() == '/')
                        num.push(val1 / val2);


                    op.pop();

                    //push the character
                    op.push(ch);

                }
                if (ch == '*' && ch == '/') {

                    if (op.peek() == '/' || op.peek() == '*') {

                        int val2 = num.pop();
                        int val1 = num.pop();

                        if (op.peek() == '*')
                            num.push(val1 * val2);

                        if (op.peek() == '/')
                            num.push(val1 / val2);

                        //pop the character
                        op.pop();

                        //push the character
                        op.push(ch);

                    } else {
                        op.push(ch);
                    }

                }
            }
            
        }
                
        while (num.size() > 1) {

            int val2 = num.pop();
            int val1 = num.pop();

            if (op.peek() == '+')
                num.push(val1 + val2);

            if (op.peek() == '-')
                num.push(val1 - val2);

            if (op.peek() == '*')
                num.push(val1 * val2);

            if (op.peek() == '/')
                num.push(val1 / val2);

            op.pop();
        }
        System.out.println(num.peek());
    }
}
