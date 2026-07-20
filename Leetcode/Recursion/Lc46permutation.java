import java.util.ArrayList;
import java.util.List;

public class Lc46permutation{
    
    public static int[] swap(int nums[], int i, int ind) {

        int temp = nums[i];
        nums[i] = nums[ind];
        nums[ind] = temp;
        return nums;
    }
    
    private static void calpermute(int[] nums, int i, List<List<Integer>> ans) {
        if (i == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
        for (int j = i; j < nums.length; j++) {
        
            swap(nums, i, j);
            calpermute(nums, i+1,ans);
            swap(nums, i, j);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        calpermute(nums, 0, ans);
        return ans;
    }
    

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        List<List<Integer>> ans = permute(nums);

        for (List<Integer> list : ans) {
            System.out.print(list);
        }
    }
}
