public class Lc_209minsizesubarr {
    public static int minSubArrayLen(int target, int[] nums) {
    int n=nums.length;

    int minlen = Integer.MAX_VALUE, low = 0, sum = 0;
    

    for (int high = 0; high < n; high++) {
        sum += nums[high];

        while (sum >= target) {
            int currlen = 0;
            if (sum == target) {
                currlen = high - low + 1;
                minlen = Math.min(currlen, minlen);
            }
            sum -= nums[low++];
        }

    }
    return minlen;
    
    }
    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 2, 4, 3 };
        System.out.println("Minimum subarray length :- "+minSubArrayLen(7, nums));

    }
}
