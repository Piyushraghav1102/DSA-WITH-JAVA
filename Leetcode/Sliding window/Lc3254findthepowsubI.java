import java.util.HashSet;
import java.util.Set;

public class Lc3254findthepowsubI {
    
    public static int[] resultsArray(int[] nums, int k) {
     
       
        // int n = nums.length;
        // int[] res = new int[n - k + 1];

        // for (int i = 0; i <= n - k; i++) {

        //     HashSet<Integer> set = new HashSet<>();
        //     boolean valid = true;

        //     for (int j = i; j < i + k; j++) {
        //         set.add(nums[j]);

        //         if (j > i && nums[j] != nums[j - 1] + 1) {
        //             valid = false;
        //         }
        //     }

        //     if (valid && set.size() == k) {
        //         res[i] = nums[i + k - 1];
        //     } else {
        //         res[i] = -1;
        //     }
        // }

//        return res;



        int n=nums.length;
    int arr[]=new int[n-k+1];
    Set<Integer> hs=new HashSet<>();
    
    int low=0;

    for(int high=0 ; high<=n-k ; high++){
        
        while (nums[high] + 1 != nums[high + 1]) {
            if (hs.size() < k) {
                        hs.remove(nums[low]);
                        arr[low]=nums[low+k-1];
                        low++;
                    }else{
                    arr[low]=-1;
                    low++;
                    }
        }
        hs.add(nums[high]);
    }
return arr;

}
    public static void main(String[] args) {
        

        int arr[]={1,2,3,4,3,2,5};

        System.out.println(resultsArray(arr, 3));

    }
}
