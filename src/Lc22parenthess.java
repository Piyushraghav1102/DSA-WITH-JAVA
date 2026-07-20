

import java.util.ArrayList;
import java.util.List;

public class Lc22parenthess {


    public static void Helper(List<String> l1, int OP, int CP,int n,String curr) {

        if ((OP + CP) == 2 * n) {
            l1.add(curr);
            return;
        }

        //For the open parensthesis
        if(OP<n)
            Helper(l1, OP + 1, CP, n,curr+'(');

        //For the close parenthesis
        if(OP>CP)
            Helper(l1, OP, CP+1, n,curr+')');
    }


    public static List<String> generateParenthesis(int n) {
        List<String> l1 = new ArrayList<>();
        Helper(l1, 0, 0, n, "");
        return l1;
    }


    public static void main(String[] args) {

        List<String> l2   = new ArrayList<>();

        l2= generateParenthesis(3);

        System.out.println(l2);

    }
}
