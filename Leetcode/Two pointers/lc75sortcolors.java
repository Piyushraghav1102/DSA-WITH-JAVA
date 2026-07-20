public class lc75sortcolors {
 
    
    public static void sortColors(int[] nums) {
        
        int n = nums.length - 1;

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j <=n; j++) {
                if (nums[j] < nums[min])
                    min = j;
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }

        for (Object elem : nums) {
            System.out.print(elem+" ");
        }
    
    }
    public static void main (String args[])
    {
   
        int arr[] = { 2, 0, 2, 1, 1, 0 };

        sortColors(arr);
        
    }
}