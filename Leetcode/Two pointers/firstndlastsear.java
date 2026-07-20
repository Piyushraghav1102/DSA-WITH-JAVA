public class firstndlastsear {

    public static int[] Searchfirstlast(int nums[], int target) {
        // int[] This declaration for the array return

        int n = nums.length;

        int low = 0; // Reset low and high for second binary search for the Startindex
        int high = n - 1;
        int Startind = -1;

        // This Loops is for the first index
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                Startind = mid;
                high = mid - 1;
            } else if (target > nums[mid]) {

                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0; // Reset low and high for second binary search for the Endindex
        high = n - 1;
        int Endind = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                Endind = mid;
                low = mid + 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[] { Startind, Endind };

    }

    public static void main(String args[]) {

        int arr[] = { 5, 7, 7, 8, 8, 10 };
        int result[] = Searchfirstlast(arr, 8);

        System.out.printf("This is the first and Last index :-" + result[0] + " " + result[1]);

    }
}
