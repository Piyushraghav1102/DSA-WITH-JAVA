import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc18_4sum {
   
   
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> l = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        
        for (int i = 0; i < n-3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            
            for (int j = i + 1; j < n-2; j++) {
                
                int low = j + 1, high = n - 1;

                if (j > i && nums[j] == nums[j - 1])
                    continue;
                
                while (low < high) {

                    long currsum = (long)nums[i] + nums[j] + nums[low] + nums[high];
                    
                    if (currsum < target)
                        low++;
                    else if (currsum > target)
                        high--;
                    else {
                        l.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        low++;
                        high--;
                        while(low < high && nums[low]==nums[low-1])
                            low++;
                        while (low < high && nums[high] == nums[high + 1])
                            high--;
                    }
                }
        
            }
        }
        
        return l;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 0, -1, 0, -2, 2 };
        
        List<List<Integer>> l1 = fourSum(arr, 0);
    
        System.out.println(l1);
    }
}
