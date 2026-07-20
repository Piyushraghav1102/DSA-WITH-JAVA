
import java.util.HashSet;

public class Lc349 {
    
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for (int n : nums1) set.add(n);
        for (int n : nums2)
            if (set.contains(n))
             res.add(n);

        int[] ans = new int[res.size()];
        int i = 0;
        for (int n : res) 
        ans[i++] = n;

        return ans;
        }
    
    
    public static void main(String[] args) {
         int nums1[] = {1,2,2,1};
         int nums2[] = { 2, 2 };

         int num[] = intersection(nums1, nums2);

         for (Object elem : num) {
             System.out.print(elem+" ");
         }
    }
}
