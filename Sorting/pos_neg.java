public class pos_neg {

    static void printarr(int arr2[]) {

        for (int i = 0; i < arr2.length - 1; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    public static void sortelem(int arr[], int low, int high) {

        int n = arr.length;

        while (low < high) {
            if (arr[low] < 0)
                low++;
            if (arr[high] > 0)
                high--;

            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }

        }
        printarr(arr);
    }

    public static void main(String[] args) {
        int nums[] = { 19, -20, 7, -4, -13, 11, -5, 3 };
        sortelem(nums, 0, nums.length - 1);

    }
}
