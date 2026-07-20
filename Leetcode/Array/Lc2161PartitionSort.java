

public class Lc2161PartitionSort {
    
    public static void printarr(int nums[]) {
        
        for (Object elem : nums) {
            System.out.print(elem+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int nums[] = { 9, 12, 5, 10, 14, 3, 10 };
        
        printarr(nums);

        int arr[] = pivotArray(nums, 10);

        printarr(arr);
    
    }
    
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int n = nums.length;
        int ans[] = new int[n];
    

        int curr=0;

        for (int i = 0; i < n; i++) {

            if (nums[i] < pivot) {
                ans[curr++] = nums[i];
            }
        }
        for (int elem : nums) {
            if (elem == pivot)
                ans[curr++] = elem;
        }
        for (int elem : nums) {
            if (curr == n)
                break;

            if (elem > pivot) {
                ans[curr++] = elem;
            }
        }
        return ans;
    }
}
