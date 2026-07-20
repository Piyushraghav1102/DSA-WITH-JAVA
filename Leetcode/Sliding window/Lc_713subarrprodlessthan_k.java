public class Lc_713subarrprodlessthan_k {
    
    
    
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        
        // int n = nums.length;
        // int count = 0;

        // for (int i = 0; i < n; i++) {
        //     int currprod = 1;
        //     for (int j = i; j < n; j++) {

        //         currprod *= nums[j];
                                                //brute force 
        //   if (currprod < k)
        //       count++;
                

        //     }
        // }
        // return count;

        int n = nums.length,count=0;

        int low = 0, product = 1;

        if (k <=1) {
            return 0;
        }
        for (int high = 0; high < n; high++) {
            product *= nums[high];

            while (product >= k) {
                product /= nums[low++];
            }
            count += high - low + 1;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int nums[] = { 10, 5, 2, 6 };
    
        System.out.println("This is total subarrya less than k :- "+numSubarrayProductLessThanK(nums, 100));
    }
}
