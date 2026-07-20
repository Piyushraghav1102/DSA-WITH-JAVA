public class LC_724_findpivot {
    
    public static int pivotIndex(int[] nums) {
        int total=0;
        for (int num : nums) {
            total += num;
        }

        int leftsum = 0;

        for(int i=0;i<nums.length;i++){
            total-=nums[i];

            if(total==leftsum){
                return i;
            }
            leftsum += nums[i];

        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = { 1, 7, 3, 6, 5, 6 };

        
        System.out.println("This is the pivot :- " + pivotIndex(nums));
        
    }
}
