import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lc90 {

    // private static void calsubsetwithdup(int[] nums, int i, List<Integer> curr, Set<List<Integer>> ans) {

    //     if (i == nums.length) {
    //         ans.add(new ArrayList<>(curr));
    //         return;
    //     }

    //     //pick                                  //brute force using set

    //     curr.add(nums[i]);
    //     calsubsetwithdup(nums, i + 1, curr, ans);

    //     //not pick
    //     curr.remove(curr.size() - 1);
    //     calsubsetwithdup(nums, i+1, curr, ans);      
    // }
    private static void calsubsetwithdup(int[] nums, int i, List<Integer> curr, List<List<Integer>> ans) {
       
        if (ans.contains(curr))
            return;

        ans.add(new ArrayList<>(curr));
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) continue;
        
            curr.add(nums[j]);
            calsubsetwithdup(nums,j+1,curr,ans);
            curr.remove(curr.size() - 1);
        }
             

    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        //Set<List<Integer>> ans = new HashSet<>(); //for the brute force
        List<List<Integer>> ans = new ArrayList<>();    //for the optimal

        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        calsubsetwithdup(nums, 0, curr, ans);
        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {
        int sums[] = { 1, 2, 2 };
        List<List<Integer>> ans = subsetsWithDup(sums);

        for (List<Integer> list : ans) {
            System.out.print(list);
        }
    }
}
