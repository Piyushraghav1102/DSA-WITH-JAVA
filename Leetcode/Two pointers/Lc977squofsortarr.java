

public class Lc977squofsortarr {
    
    public static int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int low = 0, high = n - 1;
        int res[]=new int[n];

        for (int i = n-1; i >=0; i--) {
            if (Math.abs(nums[low]) <=Math.abs(nums[high])) {
                res[i] = nums[high] * nums[high];
                high--;
            }else {
                res[i] = nums[low] * nums[low];
                low++;   
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        
        int arr[] = { -7, -3, 2, 3, 11 };

    int nums[]=sortedSquares(arr);

    for (int i : nums) {
    System.out.print(i);    
    }

    }
}
