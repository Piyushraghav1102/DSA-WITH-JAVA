
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class reorder {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        Stack<Integer> st = new Stack<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        
        int n = q.size() + 1;

        for (int i = 0; i <n / 2; i++) {
            st.push(q.remove());
        }//for push 1,2,3,4 in Stack
        
        //reverse the remaining queue 
        while (st.size() > 0) {
            q.add(st.pop());
        }//Add 4,3,2,1 in stack 5,6,7,8,4,3,2,1

       //remove 5,6,7,8 in stack 
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }
        
        //Make a reordered Queue
        for (int i = 0; i < n / 2; i++) {
            
            q.add(st.pop());
            q.add(q.remove());
        }
        

        //for the reverse the ans queue 
        while (q.size() > 0) {
            st.push(q.remove());
        }

        //Make a Actual queue
        while (st.size() > 0) {
            q.add(st.pop());
        }
        

        
        System.out.println(q);
      
        
        
    }
}
