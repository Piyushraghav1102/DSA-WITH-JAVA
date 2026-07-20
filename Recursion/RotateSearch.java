public class RotateSearch {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 1, 2, 3 };
        System.out.println(searchindex(arr, 4, 0, arr.length - 1));
    }

    public static int searchindex(int arr[], int tar, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        if (arr[low] <= arr[mid]) { // array is sorted

            if (tar < arr[mid] && tar > arr[low]) {
                return searchindex(arr, tar, low, mid - 1);
            } else {
                return searchindex(arr, tar, mid + 1, high);
            }
        }
        if (tar >= arr[mid] && tar <= arr[high]) {
            return searchindex(arr, tar, mid + 1, high);
        }
        return searchindex(arr, tar, low, mid - 1);

    }
}
