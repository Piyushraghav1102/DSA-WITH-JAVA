import java.util.*;


public class consequetive {
    
    
    public static int[] Removesubsequen(int arr[]) {
    
        Stack<Integer> s = new Stack<>();

        int n=arr.length;
        for (int i = 0; i < n; i++) {

            if (s.size() == 0 || s.peek() != arr[i]) {
                s.push(arr[i]);
            }

           else if (s.peek() == arr[i]) {
                if (i != n - 1 && arr[i] != arr[i + 1]) {
                    s.pop();
                }
              if(i==n-1&&arr[i]==s.peek())s.pop();
            }

        }
        
        int[] res = new int[s.size()];
        
        int m = res.length;

        for (int i = m-1; i >= 0; i--) {
            res[i] = s.pop();
        }
        return res;
        
}

    public static void main(String[] args) {
        
        int arr[] = { 1, 1, 1, 2, 3, 4, 4, 5, 6, 10, 10 };
        
        int result []= Removesubsequen(arr);

        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i]+" ");
        }

    }
}
