public class Lc283movezeros {
    
    public static void moveZeroes(int[] nums) {

        int n = nums.length ;

        int i = 0;

        



        if (nums.length <= 1)
            return;
        
        for (int k = 0; k < n; k++){
            if (nums[k] == 0) {
                i = k;
                break;
            }
        }
        for (int j = i; j < n; j++) {
            
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }

        for (Object elem : nums) {
            System.out.print(elem+" ");
        }
    }
    
    public static void main(String[] args) {
       
        int nums[] = { 1};

        moveZeroes(nums);


    }
}
