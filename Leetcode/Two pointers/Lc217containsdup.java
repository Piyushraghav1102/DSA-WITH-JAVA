
import java.util.Arrays;

public class Lc217containsdup {
    
    public static boolean ContainsDuplicate(int nums[]) {
    
        int n = nums.length;

        Arrays.sort(nums);
        
        if (nums.length == 0)
            return false;
        
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    
    public static void main(String args[]) {
        int arr1[] = { 1, 1};

        System.out.println(ContainsDuplicate(arr1));
    }
}
