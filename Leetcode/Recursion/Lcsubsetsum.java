import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lcsubsetsum {
    
        public static void calsubsetsum(int[] arr, int i, List<Integer> ans,int sum) {
            if (i==arr.length) {
                ans.add(sum);
                return;
            }

            //pick
            calsubsetsum(arr, i + 1, ans, sum + arr[i]);
            
            //not pick
            calsubsetsum(arr, i + 1, ans, sum);
            
        }
    
        public static List<Integer> subset(int arr[]) {
            List<Integer> ans = new ArrayList<>();

            Arrays.sort(arr);
            calsubsetsum(arr, 0, ans, 0);
            Collections.sort(ans);
            return ans;
        }
        
    public static void main(String[] args) {
        int nums[] = { 3, 1, 2 };
       
        List<Integer> ans = subset(nums);

        for (Integer list : ans) {
            System.out.print(list);
        }

    }
}
