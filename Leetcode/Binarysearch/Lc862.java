public class Lc862{
    
    public static int shortestSubarray(int[] nums, int k) {
        int n = nums.length;

        int low = 0, prefixsum = 0, minlen = Integer.MAX_VALUE;

        for (int high = 0; high < n; high++) {
            prefixsum += nums[high];

            while (prefixsum > k) {
                prefixsum -= nums[low];
                low++;
            }
            if(prefixsum==k)
            minlen = Math.min(minlen, high - low + 1);
        }
        return minlen == Integer.MAX_VALUE ? -1 : minlen;
        
    }
    public static void main(String[] args) {
        int nums[] = { 2, -1, 2 };
        
        System.out.print("Minimum length of shortest subarr :- "+shortestSubarray(nums, 3));


    }
}
