import java.util.HashSet;
import java.util.Set;

public class Lc209minsubarrsum {
    
    public static int minSubArrayLen(int target, int[] nums) {

        int n = nums.length ;
        int min = Integer.MAX_VALUE;
        int left = 0,sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            while (sum >= target) {
                min = Math.min(min, i - left + 1);
                sum -= nums[left++];
            }
            
        }
        return min == Integer.MAX_VALUE ? 0 : min;

       

    }
    
    
    public static void main(String[] args) {
        
        int arr[] = { 2, 3, 1, 2, 4, 3 };

        System.out.println(minSubArrayLen(7, arr));
    }
}
