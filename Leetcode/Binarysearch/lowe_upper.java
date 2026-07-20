public class lowe_upper {
    
    public static int findlower(int nums[], int tar) {
        int n = nums.length;

        int ans = n;

        int low = 0, high = n - 1;
        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] >= tar) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }
    
    public static int findupper(int nums[],int tar){
        int n = nums.length;

        int ans = n;

        int low = 0, high = n - 1;
        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] > tar) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        
        int nums[] = { 1, 2, 3, 3, 5, 8, 8, 10, 10, 11 };
         
        System.out.println("lower bound of this ind :-" + findlower(nums, 6));
    
        System.out.print("Upper bound of this ind :-" + findlower(nums, 6));
    
    }
}
