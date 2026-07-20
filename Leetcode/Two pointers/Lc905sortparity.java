public class Lc905sortparity {
    public static void swap(int []nums,int low,int high){

        int temp=nums[high];
        nums[high]=nums[low];
        nums[low]=temp;
    }
    
    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;

        int low = 0, high = n - 1;

        while (low < high) {
            if (nums[low] % 2 > nums[high] % 2 ) {
                swap(nums, low, high);
            } else if (nums[low] % 2 == 0 && nums[high] % 2 == 1) {
                low++;
                high--;
            } else {
                high--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4 };
        int nums[] = sortArrayByParity(arr);

        for (int elem : nums) {
            System.out.print(elem);
        }
        System.out.println();
    }
}
