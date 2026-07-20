import java.util.HashSet;
import java.util.Set;

public class practice {
    
    public static boolean search(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 5, 6, 0, 0, 1, 2 };

        System.out.println(search(nums, 7));
    }
}
