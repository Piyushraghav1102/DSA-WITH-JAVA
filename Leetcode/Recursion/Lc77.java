import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc77 {
    

    public static void calcombination(int[] arr, int i, List<Integer> curr, List<List<Integer>> ans, int k) {
        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for (int j = i; j < arr.length; j++) {
            
            //pick one and move forward
            curr.add(arr[j]);
            calcombination(arr, j + 1, curr, ans, k);
            
            //exclusive
            curr.remove(curr.size() - 1);
        }
        
    }

     public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
         calcombination(arr, 0, curr, ans, k);    
        return ans;
    }

    public static void main(String[] args) {
        
        List<List<Integer>> ans = combine(4, 2);

        for (List<Integer> list : ans) {
            System.out.print(list);
        }
    }
}
