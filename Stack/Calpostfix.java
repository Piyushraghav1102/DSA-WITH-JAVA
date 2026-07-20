
import java.util.Stack;

public class Calpostfix {
    public static void main(String[] args) {
    
        String str = "953+4*6/-";

        Stack<Integer> Num = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {// 0 to 9

                Num.push(ascii - 48);
            } else {
                int val2 = Num.pop();
                int val1 = Num.pop();

                if (ch == '+') {
                    int dat = val1 + val2;
                    Num.push(dat);
                  
                }
                

                if (ch == '-')
                    Num.push(val1 - val2);
                if (ch == '*')
                    Num.push(val1 + val2);
                if (ch == '/')
                    Num.push(val1 / val2);

            }
        }
       System.out.println(Num.peek());
    }
}
