
import java.util.HashMap;
import java.util.Map;

public class Lctwosumhash {
    
    public static int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;

        Map<Integer, Integer> h = new HashMap<>();

        int arr[]=new int[2];
        
        for (int i = 0; i < n; i++) {
            int comp = target - nums[i];

            
            if (h.containsKey(comp)) {
                arr[0] = h.get(comp);
                arr[1] = i;
                break;
            }
            h.put(nums[i], i);
            
        }
        return arr;
    
    }
    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        
        int arr[] = twoSum(nums, 9);

        for (int elem : arr) {
            System.out.println(elem);
        }
    }
}
