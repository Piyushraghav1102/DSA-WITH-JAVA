import java.util.HashSet;
import java.util.Set;

public class Lc2461maxsumdistarrjava{
    
    public static long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int low=0,high=0;
        int currsum=0,maxsum=0;

        Set<Integer> s = new HashSet<>();
        
        while (high < n) {
            while (s.contains(nums[high]) || s.size() > k) {
                currsum -= nums[low];
                low++;
                s.remove(nums[low]);
            }
            currsum += nums[high];
            s.add(nums[high++]);
            if(s.size()==k)
                maxsum = Math.max(currsum, maxsum);
            
        }
        return maxsum;
    }
    public static void main(String args[]){
        int nums[] = { 1, 5, 4, 2, 9, 9, 9 };
        
        System.out.println(maximumSubarraySum(nums, 3));
    }    
}