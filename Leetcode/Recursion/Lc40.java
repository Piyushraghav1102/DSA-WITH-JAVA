import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc40 {
    
    private static void calcombinationsum2(int[] candidates, int i, List<Integer> curr, List<List<Integer>> ans,
            int target) {
                if( target<0)return;
                if (target == 0) {
                     ans.add(new ArrayList<>(curr)); 
                     return;
                 }
                 for (int j = i; j < candidates.length; j++) {
                     if (j > i && candidates[j] == candidates[j - 1]) {
                         continue;
                     }
                 
                     //do (pick it)
                     curr.add(candidates[j]);
                     calcombinationsum2(candidates, j + 1, curr, ans, target - candidates[j]);
                     
                     //exclusive 
                     curr.remove(curr.size()-1);
        }
    }
   
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Arrays.sort(candidates);

        calcombinationsum2(candidates, 0, curr, ans, target);
        
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 2, 1, 2 };
        List<List<Integer>> ans = combinationSum2(arr, 5);

        System.out.println(ans);
        
    }
}
