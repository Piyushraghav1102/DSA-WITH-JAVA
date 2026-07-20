import java.util.HashMap;
import java.util.Map;

public class Lc930binarysubwithsum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return calnumSubarraysWithSum(nums, goal) - calnumSubarraysWithSum(nums, goal - 1);

    }
 
    public static int calnumSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        
        int low = 0, high = 0, count = 0, sum = 0;

        if (goal < 0)
            return 0;

        while (high != n ) {
            sum += nums[high];

            while (sum >goal) {
                sum -= nums[low];
                low++;
            }
            count += high - low + 1;
            
            high++;
        }
        return count;
    }

    public static int calnumSubarraysWithSum2nd(int[] nums, int goal) {
    
        int n = nums.length;

        Map<Integer, Integer> hm = new HashMap<>();

        int count = 0, prefix = 0;

        hm.put(0, 1);

        for (int i = 0; i < n; i++) {
            prefix += nums[i];

            if (hm.containsKey(prefix - goal)) {
                count += hm.get(prefix - goal);
            }

            hm.put(prefix, hm.getOrDefault(prefix, 0) + 1);
        }
    
        return count;
    
    }
    

    public static void main(String[] args) {
        
        
        int nums[] = { 1, 0, 1, 0, 1 };
        System.out.println(calnumSubarraysWithSum2nd(nums, 2));
    }
}