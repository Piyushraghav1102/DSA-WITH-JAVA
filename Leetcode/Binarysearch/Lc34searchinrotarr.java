public class Lc34searchinrotarr {
    
    public static int search(int[] nums, int target) {
        int n = nums.length;

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[low] <= nums[mid]) {

                if (target >= nums[low] && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target >= nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    

    
    public static void main(String[] args) {
        int nums[] = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };

        System.out.print(search(nums, 1));

    }
}
