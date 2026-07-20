

public class Lc35searchinspos {
    
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == nums[mid]) {
                
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;

    }

    //For the recursion
    public static int searchInsertwithrecur(int[] nums, int low, int high, int target) {
        if (low > high) {
            return low;
        }
        int mid = (low + high) / 2;

        if (nums[mid] == target)
            return mid;
        else if (target > nums[mid])
            return searchInsertwithrecur(nums, mid + 1, high, target);
        else 
            return searchInsertwithrecur(nums, low, mid - 1, target);

    }
    public static int calsearchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        
        return searchInsertwithrecur(nums, low, high, target);        
    }
    
    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        
        System.out.println("Insert position is :- "+calsearchInsert(nums, 5));
    }
}
