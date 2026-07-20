public class mergesor {
    static void printarr(int arr22[]) {

        for (int i = 0; i < arr22.length - 1; i++) {
            System.out.print(arr22[i] + " ");
        }

    }

    static void mergesubarr(int arr[], int low, int mid, int high) {

        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];

        // for the Adding element in left Subarray
        for (int i = 0; i < mid - low + 1; i++)
            left[i] = arr[low + i];

        for (int j = 0; j < high - mid; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0;
        int j = 0;
        int k = low;

        while (i <= mid - low + 1 && j <= high - mid) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];

            } else {
                arr[k++] = right[j++];
            }
        }

        // for the first half
        while (i <= mid) {
            arr[k++] = left[i++];
        }

        // for the Second half
        while (j <= high) {
            arr[k++] = right[j++];
        }

        printarr(arr);
    }

    static void Mergesort(int nums[], int low, int high) {

        if (low >= high)
            return;

        int mid = (low + high) / 2;

        // First half
        Mergesort(nums, low, mid);

        // Second half
        Mergesort(nums, mid + 1, high);

        mergesubarr(nums, low, mid, high);

    }

    public static void main(String[] args) {

        int nums[] = { 7, 20, 4, 11, 8, 2 };
        System.out.println("This is before sorting");
        printarr(nums);
        System.out.println();
        System.out.println("This is after sorting");
        Mergesort(nums, 0, nums.length - 1);
    }
}
