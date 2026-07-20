public class Lc153_154_findmininsortarrI_II {
    
    public static int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[low] <= nums[high]) {
                return nums[low];
            }
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];

    }
    
    public static int findMin1(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[low] <= nums[high]) {
                return nums[low];
            }
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
            
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 1, 2 };
       // System.out.println("This is the min elem in arr :- "+findMin(nums));
    
        //for the Lc 154
        int nums1[] = { 2, 2, 2, 0, 1 };
        System.out.println("This is the min elem in arr :- "+findMin1(nums1));        
        
    
    }
}