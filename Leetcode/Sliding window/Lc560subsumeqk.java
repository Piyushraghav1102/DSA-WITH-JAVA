import java.util.HashMap;
import java.util.Map;

public class Lc560subsumeqk {

    public static int subarraySum(int[] nums, int k) {
        int n=nums.length;

        Map<Integer, Integer> h = new HashMap<>();
        
        int count = 0, prefixsum = 0;
        
        h.put(0, 1);

        for (int i = 0; i < n; i++) {
            prefixsum += nums[i];
            
            if (h.containsKey(prefixsum - k)) {
                count += h.get(prefixsum - k);
                
            }
            h.put(prefixsum, h.getOrDefault(prefixsum, 0) + 1);

            
        }
        return count;
    }
    
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        System.out.println(subarraySum(nums, 3));
    }
}
