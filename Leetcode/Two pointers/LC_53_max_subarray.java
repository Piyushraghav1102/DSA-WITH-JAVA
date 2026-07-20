public class LC_53_max_subarray {
    
    public static int maxSubArray(int[] nums) {
     
     
        int n=nums.length;
/* 
int maxsum=Integer.MIN_VALUE;
for (int i = 0; i < n; i++) {
    int currsum = 0;
    for (int j = i + 1; j < n; j++) {

        currsum += nums[j];                                 //This is good approach but not for all testcases

        if (currsum > maxsum && currsum >= 0) {
            maxsum = currsum;
        }

    }
}
*/

        int currsum = 0, maxsum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            currsum += nums[i];
            maxsum = Math.max(currsum, maxsum);
            
            if (currsum < 0)
                currsum = 0;

        }
        return maxsum;
    }
    
    public static void main(String[] args) {
        
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        
        System.out.println("This is the max sum of the array :- "+maxSubArray(arr));

    }
}
