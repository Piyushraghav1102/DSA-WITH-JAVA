import java.util.Arrays;

public class Lc1283{
    
    
    public static int findmindiv(int arr[], int div) {
        int n = arr.length;
        int smalldiv = 0;

        for (int i = 0; i < n; i++) {
            smalldiv += (arr[i] + div - 1) / div;
        }
        return smalldiv;
    }
    
    public static int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = Integer.MAX_VALUE;
        
        while (low <= high) {
            int mid =  low + (high - low) / 2;

            if (findmindiv(nums, mid) <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        

        int nums[] = { 1, 2, 5, 9 };
        System.out.println(smallestDivisor(nums, 6));
    }
}