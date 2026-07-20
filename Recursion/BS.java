public class BS {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(SBS(arr, 5, 0, arr.length - 1));
    }

    static int SBS(int arr[], int target, int low, int high) {
        if (low > high) {

            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return SBS(arr, target, low, mid - 1);
        }
        return SBS(arr, target, mid + 1, high);
    }

}
