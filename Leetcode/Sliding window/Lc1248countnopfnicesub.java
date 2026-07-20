import java.util.HashMap;
import java.util.Map;

public class Lc1248countnopfnicesub {
    
    public static int calnumberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        
        int low = 0, count = 0, sum = 0;

        if (k < 0)
            return 0;

        for(int high=0;high<n;high++) {
            sum += nums[high] % 2;
            
            while (sum >k) {
                sum -= nums[low] % 2;
                
                low++;
            }
            count += high - low + 1;
            
        }
        return count;
    }
    
    public static int numberOfSubarrays(int[] nums, int k) {
        return calnumberOfSubarrays(nums, k) - calnumberOfSubarrays(nums, k - 1);
    }
    

    public static int calnumberOfSubarrayshash(int[] nums, int k) {
        int n = nums.length;

        int count = 0, prefix = 0;
        Map<Integer, Integer> hm = new HashMap<>();

        hm.put(0, 1);

        for (int i = 0; i < n; i++) {
            prefix += nums[i] % 2;

            if (hm.containsKey(prefix - k)) {
                count += hm.get(prefix - k);
            }
            hm.put(prefix, hm.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
    
        int nums[] = { 1, 1, 2, 1, 1 };
        
        System.out.println(calnumberOfSubarrayshash(nums, 3));    


    }
}
