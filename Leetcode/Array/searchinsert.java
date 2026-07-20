public class searchinsert {

    public static int ins_search_pos(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == nums[mid]) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 3, 5, 6, 9 };
        System.out.println(ins_search_pos(arr, 10));
    }
}
