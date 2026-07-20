
import java.util.HashSet;
import java.util.Set;

class MAXSUM {
    
    public static long Findmaxsub(int arr[],int k) {
        
        Set<Integer> s = new HashSet<>();
        long currsum = 0, maxsum = 0;
        int left=0;


        for (int right = 0; right <arr.length; right++) {
            while (s.contains(arr[right]) || s.size() == k) {
                s.remove(arr[(int) left]);
                currsum -= arr[left];
                left++;
            }
            currsum += arr[right];
            s.add(arr[right]);
            
            if (s.size() == k) {

                maxsum = Math.max(currsum, maxsum);
            }
    
        }
        return maxsum;
    }
    
    
    public static void main(String[] args) {
        
        int nums[] = { 1, 5, 4, 2, 9, 9, 9 };


        System.out.println(Findmaxsub(nums, 3));
    }
}