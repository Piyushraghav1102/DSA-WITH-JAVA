public class Searchrotated {

    public static int Searchrotate(int nums[], int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[low] <= nums[mid]) {

                if (target <= nums[mid] && target >= nums[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target < nums[mid] && target >= nums[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 1, 3 };
        int n = Searchrotate(arr, 5);
        System.out.println("this is the index " + n);
    }
}
