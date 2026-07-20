import java.util.Arrays;

public class kthlaregest {

    public static int kth(int nums[], int k) {
        int n = nums.length;

        int count = 0;

        Arrays.sort(nums);
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            if (nums[k - 1] == nums[i]) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 3, 2, 1, 5, 6, 4 };
        System.out.print(kth(arr, 2));

    }
}
