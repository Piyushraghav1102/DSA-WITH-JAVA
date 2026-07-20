
import java.util.Arrays;

public class Lc268missingno {
    
    public static int missingNumber(int[] nums) {
        int n = nums.length+1;

        // for (int i = 1; i <= n; i++) {
        //     int flag = 0;
        //     for (int j = 0; j < n - 1; j++) {
        //         if (nums[j] == i) {
        //             flag = i;
        //             break;
        //         }                    brute force
        //     }
        //     if (flag == 0) {
        //         return i;
        //     }
        // }


        // int arr[] = new int[n + 2];
        // Arrays.fill(arr, 0);

        // for (int i = 0; i < n; i++) {
        //     arr[nums[i]]=1;
        // }
        //                                                     //better soltuion
        // for (int idx = 0; idx < arr.length; idx++) {

        //     if (arr[idx] == 0) {
        //         return idx;
        //     }
        // }
        // return -1;


        int sum = n * (n + 1) / 2;
        int currsum = 0;
        for (int i = 0; i < n; i++) {                   //optimal solution
            currsum += nums[i];
        }

        return sum-currsum ;

        

    }
    public static void main(String[] args) {
        int nums[] = { 1, 2, 4, 5 };

        missingNumber(nums);
    }
}
