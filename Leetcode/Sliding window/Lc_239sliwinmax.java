
import java.util.ArrayList;
import java.util.Deque;



public class Lc_239sliwinmax {
    
    
    public static int[] maxSlidingWindow(int[] nums, int k) {
    //     int n=nums.length;        
    //     int arr[]=new int[n-k+1];
    //     int low=0,maxwin=Integer.MIN_VALUE;

    //     for(int i=0;i<n-k+1;i++){
    //         maxwin=nums[i];                          brute force solution
    //         for(int j=i;j<=i+k-1;j++){
    //             maxwin=Math.max(maxwin, nums[j]);
    //         }
    //         arr[low++]=maxwin;
    //     }
    // return arr;

    int n=nums.length;
    Deque<Integer> dq = null;
    int arr[] = new int[n-k+1];
    ArrayList<Integer> a = new ArrayList<>();    

    for (int i = 0; i < k; i++) {       //This is for the first window
        
        //firstly we check the element is dq.size>0 and dq.back>=nums[i]
        while (dq.size() > 0 && nums[dq.getLast()] <= nums[i]) {
            dq.removeLast();
        }
        dq.addLast(i);
    }

    for (int i = k; i < nums.length; i++) {
        //this is for biggest element of last win to add in the res arr
        a.addLast(nums[dq.getFirst()]);
        
        //Remove element which is not belong to this window and 
        while (dq.size() > 0 && dq.getFirst()<=i-k) {
            dq.removeFirst();
        }

        //then we are going to remove smaller value 
        while (dq.size() > 0 && nums[dq.getLast()] <= nums[i]) {
            dq.removeLast();
        }
        dq.add(i);
    }
    a.addLast(nums[dq.getFirst()]);
    for (int i = 0; i < a.size(); i++) {

        arr[i] = a.removeFirst();
    }
    
    return arr;

    
    }
    
    public static void main(String[] args) {
    int nums[]={1,3,-1,-3,5,3,6,7}; 

    int res[]=maxSlidingWindow(nums, 3);

    for (Object elem : res){
        System.out.println(elem+" ");
    }
    }
}
