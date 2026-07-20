public class howmanytimearrsorted {
    

    public static int findhowarrsort(int nums[]) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[low] <= nums[high]) {
                return n-low;
            }
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return n-low;
        

    }
    
    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 1, 2 };
        System.out.println("how many time arr is rotate :- "+findhowarrsort(nums));
    }
}
