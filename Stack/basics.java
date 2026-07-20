import java.util.*;

public class basics {
    


    /*public static void Displayst(Stack<Integer> s) {

        if (s.size() <=0)
            return;

        int top = s.pop();
        
        System.out.print(top+" ");
        
        Displayst(s);

        s.push(top);
} */


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //System.out.println(st);
        
        Displayst(st);
        Stack<Integer> st2 = new Stack<>();

        /* 
        int ind = 2;        //For the Push any index
        int val = 6;
        
        
        while (st.size() >ind) {
            st2.push(st.pop());
        }
        st.push(val);
        
        while (st2.size() > 0) {
            st.push(st2.pop());
        }
        System.out.println(st);
        */
        

        //For the POP any index
        /* 
        System.out.println("Enter the index for pop :- ");
        
        int ind = sc.nextInt();
        
        while (st.size() >ind+1) {
            st2.push(st.pop());
        }
        st.pop();
        
        while (st2.size() > 0) {
            st.push(st2.pop());
        }
        System.out.println(st);
        */


        //Display the reverse stack
        

    }
}
