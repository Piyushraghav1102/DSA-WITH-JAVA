import java.util.ArrayList;
import java.util.List;

public class Lc216 {
    
    public static void calcombsum3(int[] arr, int i, List<Integer> curr, List<List<Integer>> ans, int k,int n) {
        if (n == 0 && curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        if (n < 0 || i == arr.length || curr.size() > k) return;

        //inlcuisve 
        curr.add(arr[i]);
        calcombsum3(arr, i + 1, curr, ans, k ,n-arr[i]);
        
        //exclusive
        curr.remove(curr.size()-1);
        calcombsum3(arr, i+1, curr, ans, k,n);
    }
    
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int arr[] = new int[9];
        
        for (int i = 0; i < 9; i++) {
            arr[i] = i + 1;
        }
        calcombsum3(arr, 0, curr, ans, k,n);
        return ans;

    }

    public static void main(String[] args) {
        List<List<Integer>> ans = combinationSum3(3, 7);

        for (List<Integer> list : ans) {
            System.out.print(list);
        }
    }
}
