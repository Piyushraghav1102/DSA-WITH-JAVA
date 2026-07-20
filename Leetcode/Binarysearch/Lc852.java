public class Lc852 {
    
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;

        int low = 0, high = n - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        if (low == high)
            return low;
        
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = { 0, 2, 1, 0 };

        System.out.println(peakIndexInMountainArray(nums));
    }
}
