class Binarysearch {

    static int Searchele(int arr[], int low, int high, int tar) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == tar) {
            return mid;
        }
        if (arr[mid] > tar) {
            return Searchele(arr, low, mid - 1, tar);
        }
        if (arr[mid] < tar) {
            return Searchele(arr, mid + 1, high, tar);
        }

        return -1;

    }

    static int Firstoccur(int arr[], int tar) {

        int n = arr.length - 1;
        int low = 0, high = n - 1;

        int FO = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == tar) {
                FO = mid;
                high = mid - 1;
            } else if (arr[mid] > tar) {

                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return FO;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };

        int nums2[] = { 1, 2, 2, 3, 4, 5, 8 };

        // System.out.println(Searchele(nums, 0, nums.length - 1, 4));

        System.out.println(Firstoccur(nums2, 3));

    }
}