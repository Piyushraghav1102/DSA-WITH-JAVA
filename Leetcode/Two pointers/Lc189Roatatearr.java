public class Lc189Roatatearr {
    
    public static int[] reversearr(int arr[], int low, int high) {
        
        while (low <= high) {

            if(low==high){
            break;
            
            }
            else{
             arr[high] = arr[high] + arr[low];
 
             arr[low] = arr[high] - arr[low];
 
             arr[high] = arr[high] - arr[low];
         
             low++;
             high--;
            }
         
         }
 
         return arr;
    }
    public static void rotate(int[] nums, int k) {
        
        int n=nums.length;
      
        

       reversearr(nums,0,n-1);
       reversearr(nums, 0, k - 1);
       reversearr(nums,k,n-1);
    }

    public static void main(String[] args) {
    
        
        int nums[] = { 1, 2, 3, 4, 5 };

        int nums2[] = reversearr(nums, 0, 2);

        for (Object elem : nums2) {
            System.out.print(elem+" ");
        }


    }
}
