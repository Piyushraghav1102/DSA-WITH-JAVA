public class Lc1493longestsubstring {
    
    
    public static int longestSubarray(int[] nums) {
        int n = nums.length;

        int low = 0, maxlen = 0,zero=0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                zero++;
            }
            while (zero > 1) {
                if (nums[low] == 0)
                    zero--;
                low++;
            }
            maxlen = Math.max(maxlen, i - low);
        }
        return maxlen;
    }
    
    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 0, 1 };
    
        System.out.println(longestSubarray(nums));
    }
}
