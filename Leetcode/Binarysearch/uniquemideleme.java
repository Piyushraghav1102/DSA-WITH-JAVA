import java.util.HashMap;
import java.util.Map;

class uniquemideleme{

    public boolean isMiddleElementUnique(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        int low=0,high=nums.length-1;
        int mid=low+(high-low)/2;

return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};


    }
}