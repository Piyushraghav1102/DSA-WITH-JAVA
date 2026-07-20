public class Quickrev {

    static void printarr(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int SortArr(int arr[], int low, int high) {

        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {

            if (i <= high && arr[i] <= pivot)
                i++;

            if (j > low && arr[j] >= pivot)
                j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    static void Quicksort(int arr[], int i, int j) {

        if (i < j) {
            int pivot = SortArr(arr, i, j);
            Quicksort(arr, i, pivot - 1);
            Quicksort(arr, pivot + 1, j);
        }

    }

    public static void main(String[] args) {
        int nums[] = { 7, 13, 8, 5, 10, 2, 4 };

        Quicksort(nums, 0, nums.length - 1);

        printarr(nums);
    }
}
