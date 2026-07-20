public class mergesort {
    
    public static void mergesort(int arr[], int low, int high) {
        if (low >= high)
            return;

        int mid=low+(high-low)/2;
        
        mergesort(arr, low, mid );
    
        mergesort(arr, mid + 1, high);
        
        mergebothhalf(arr, low, mid, high);
        
    }
    
    private static void mergebothhalf(int[] arr, int low, int mid, int high) {
        
        int temp[] = new int[high-low+1];

        int left = low, right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
                k++;
            } else {
                temp[k] = arr[right];
                k++;
                right++;
            }
        }
        while (left <= mid) {
            temp[k] = arr[left];
            k++;
            left++;
        }
        while (right <= high) {
            temp[k] = arr[right];
            k++;
            right++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[low+i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };

        mergesort(nums, 0, nums.length - 1);
        
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
