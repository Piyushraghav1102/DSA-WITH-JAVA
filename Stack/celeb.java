import java.util.Stack;

public class celeb {

    public static int Findceleb(int arr[][]) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int v1 = st.pop();
            int v2 = st.pop();

            if (arr[v1][v2] == 0)
                st.push(1);

            else if (arr[v2][v1] == 0)
                st.push(v2);

        }

        if (st.size() == 0)
            return -1;

       
            int potential = st.pop();

            for (int j = 0; j < arr.length; j++) {
                if (arr[potential][j] == 1)
                    return -1;
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i][potential] == 0)
                    return -1;
            }
        
        return potential;
    }
    public static void main (String args[]){
        int[][] arr = {
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}
        };

        System.out.println(Findceleb(arr));

    }
}
