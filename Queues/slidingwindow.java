
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class slidingwindow {
    
    
    public static int[] firstnegativewin(int arr[], int k) {
        int n = arr.length;

        Queue<Integer> q1 = new LinkedList<>();

        long res[] = new long[n-k+1];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) //adding -ve element
                q1.add(i);
                
        }
        
        for (int i = 0; i < n - k + 1; i++) {
            for (int j = i; j < j + k - 1; j++) {


            }
        }
        
        

    }

    
    public static void main(String[] args) {
    
        int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };


    }
}
