public class Lc540singleelemsortarr {
    
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        int low = 0, high = n - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (mid % 2 == 0 && nums[mid] == nums[mid + 1]) {
                low = mid + 1;
            } 
            else if (mid % 2 == 1 && nums[mid] == nums[mid - 1]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return nums[low];
    }
    
    public static void main(String[] args) {
        int nums[] = { 3, 3, 7, 7, 10, 11, 11 };
        
        System.out.print("This is the single element :- "+singleNonDuplicate(nums));

    }
}