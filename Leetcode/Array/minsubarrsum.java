public class minsubarrsum {
    
    public static int minSubArrayLen(int target, int[] nums) {
        
        int minlen = Integer.MAX_VALUE;

        int left = 0, currsum = 0;
        
        for (int right = 0; right < nums.length; right++) {
            currsum += nums[right];
            
            while (currsum >= target) {
                minlen = Math.min(right - left + 1, minlen);
                currsum -= nums[left];
                left++;
            }
        }
        return minlen!=Integer.MAX_VALUE ? minlen:0;
    }
    
    public static void main(String[] args) {
        

        int nums[] = { 2, 3, 1, 2, 4, 3 };

        System.out.println("Minimum array length :- "+minSubArrayLen(7, nums));
    }
}
