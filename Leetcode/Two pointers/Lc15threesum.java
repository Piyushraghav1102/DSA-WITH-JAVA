import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc15threesum {
    
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> l = new ArrayList<>();

        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            int low = i + 1, high = n - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (low < high) {
                int currsum = nums[i] + nums[low] + nums[high];

                if (currsum < 0)
                    low++;
                else if (currsum > 0) {
                    high--;
                } else {
                    l.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    
                    //These both while loop is for the skipping s
                    while (low < high && nums[low] == nums[low - 1])
                        low++;
                    while (low < high && nums[high] == nums[high + 1])
                        high--;
                }
            }
        }
        return l;

    }

    
    public static void main(String[] args) {
        

        int arr[] = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> l1=threeSum(arr);
    
        System.out.println(l1);
    
    }
}