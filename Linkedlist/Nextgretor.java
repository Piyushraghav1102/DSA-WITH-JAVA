import java.util.*;

public class Nextgretor {
    
    
    
    public static int[] findnextgretor(int arr[]) {
        
//1st approach         
        
        /*int n = arr.length;
        
        int res[] = new int[arr.length];
        
        for (int i = 0; i < n; i++) {
            res[i]=-1;
            for (int j = i+1; j < n; j++) {
        
                if (arr[i] < arr[j]) {
                    res[i] = arr[j];
                    break;
                }
                if (j == n - 1 && arr[i] > arr[j]) {
                    res[i] = -1;
                }
            }
        }*/
        
        //2nd approach
    
        int n = arr.length;
        
        Stack<Integer> s = new Stack<>();

        int res[] = new int[n];

        res[n - 1] = -1;
        s.push(arr[n - 1]);


        for (int i = n - 2; i >= 0; i--) {
            
            while (s.peek() < arr[i] || s.size() > 0) {
                s.pop();
            }
            if (s.size() == 0) {
                res[i] = -1;
            }
            else{
                res[i] = s.peek();
                s.push(arr[i]);
            }
        }
            
    
        return res;
    }
    public static void main(String[] args) {
     
        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };

        int retarr[] = findnextgretor(arr);

        for (int i = 0; i < retarr.length; i++) {
         System.out.print(retarr[i]+" ");   
        }
    }
}
