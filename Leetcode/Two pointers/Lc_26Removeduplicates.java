

public class Lc_26Removeduplicates {
    
    public static int removeDuplicates(int[] nums) {

    
            if (nums.length == 0) return 0;
        
            int low = 0;
        
            for (int high = 1; high < nums.length; high++) {
                if (nums[high] != nums[low]) {
                    low++;
                    nums[low] = nums[high];
                }
            }
            return low + 1;
        
    }
    
    public static void main(String[] args) {
        
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        System.out.println("Counting of no :- "+removeDuplicates(nums)) ;
    }    
}
