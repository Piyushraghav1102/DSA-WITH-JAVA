
import java.util.Stack;

public class pretopost {
    public static void main(String[] args) {
        
        String str = "-9/*+5346";
        
        Stack<String> st = new Stack<String>();

        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);

            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {//0to 9
                String s = "" + ch;
                st.push(s);
            } 
            else {
                String val1 = st.pop();
                String val2 = st.pop();

                if (ch == '+') {
                    String dat = val1 + val2 + "+";
                    st.push(dat);
                }
                if (ch == '-')
                    st.push(val1 + val2 + "-");
                if (ch == '*')
                    st.push(val1 + val2 + "*");
                if (ch == '/')
                    st.push(val1 + val2 + "/");
            }
        }
        
        String st2 = st.peek();
        System.out.println(st2);
    }
}
