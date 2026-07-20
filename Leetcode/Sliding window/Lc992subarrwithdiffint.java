import java.util.HashMap;
import java.util.Map;

public class Lc992subarrwithdiffint {
    
    public static int calsubarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;

        int count=0;
        Map<Integer, Integer> hm = new HashMap<>();
        int low = 0;

        for (int high = 0; high < n; high++) {
            
            hm.put(nums[high], hm.getOrDefault(nums[high], 0) + 1);
            
            while (hm.size() > k) {
                hm.put(nums[low], hm.get(nums[low]) - 1);
                
                if (hm.get(nums[low]) == 0) {
                    hm.remove(nums[low]);
                }
                low++;
            }
            count += high - low + 1;
    
        }
        return count;
    
    }

    
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return calsubarraysWithKDistinct(nums, k) - calsubarraysWithKDistinct(nums, k - 1);
    }
    
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 3 };
        System.out.println(subarraysWithKDistinct(arr, 2));
    }
}