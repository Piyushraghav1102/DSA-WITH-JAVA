import java.util.List;

public class Lc3364maxsum {

    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();

        int low=0, minpossum=Integer.MAX_VALUE ;
        int sum=0;
        
        for(int high=0;high<n;high++){
            
            sum+=nums.get(high);
            
            int size=high-low+1;

            while(size>r && low<=high){
                
                sum-=nums.get(low);
                low++;
                size=high-low+1;
            }
            if(size>1){
                minpossum=Math.min(minpossum, sum);
                if(sum==0)
                    return -1;
            }
        
        }
        return minpossum==Integer.MAX_VALUE ? 0 :minpossum;

        
    }
    public static void main(String[] args) {
        
        List<Integer> list = List.of(1, 2, 3, 4);
        int minsubarrsum = minimumSumSubarray(list, 2, 4);
    System.out.println(minsubarrsum);
    }

}