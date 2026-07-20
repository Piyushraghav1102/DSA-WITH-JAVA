import java.util.Arrays;

public class Lc410 {
    
    public static int countsubarr(int arr[], int area) {
        int n = arr.length;

        int count = 1;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum + arr[i] <= area) {
                sum += arr[i];
            } else {
                count++;
                sum = arr[i];
            }
        }
        return count;

    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (countsubarr(nums, mid) <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        
    }
}