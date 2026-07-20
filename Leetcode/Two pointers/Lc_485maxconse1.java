public class Lc_485maxconse1 {
    
    
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        
        // if (n == 0 && nums[0] == 0)
        //     return 0;
        
        // int max = 1, count = 1;

        // for (int i = 1; i < n; i++) {

        //     if(nums[0]==0)
        //         return 0;
        //     else if (nums[i] == 1) {
        //         count++;
        //         max = Math.max(count, max);
        //     } else {
        //         count = 1;
        //     }
        // }
        // return max;

        int low = 0, maxlen = Integer.MIN_VALUE;
        for (int high = 0; high < n; high++) {
            if (nums[high] == 1) {
                low++;
            }
            else {
                low = 0;
            }
            maxlen = Math.max(maxlen, low);
        }
        return maxlen;
        
     }
    
    public static void main(String[] args) {
        
        int arr[] = { 1,1,0,1,1,1,1};
        System.out.println("Max no of consecutive one :- "+findMaxConsecutiveOnes(arr));
    }
}
