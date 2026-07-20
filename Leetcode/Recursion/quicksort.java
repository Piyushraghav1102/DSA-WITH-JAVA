public class quicksort {
    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int partionind = calquicksort(arr, low, high);

            quicksort(arr, low, partionind - 1);
            quicksort(arr, partionind + 1, high);

        }
    }
    private static int calquicksort(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            
            while (i <= high && arr[i] <= arr[pivot] ) {
                i++;
            }
            while (j >= low && arr[j] > arr[pivot]  ) {
                j--;
            }
            if(i<j)swap(arr, i, j);
        }
        swap(arr, j, pivot);
        return j;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 6, 2, 5, 7, 9, 1, 3 };
        
        quicksort(nums, 0, nums.length-1);

        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
