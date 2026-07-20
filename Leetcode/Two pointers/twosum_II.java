public class twosum_II {

    public static int[] twosum(int numbers[], int target) {
        // int n = numbers.length;
        // int firstind = -1;
        // int endind = -1;

        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {

        // if ((numbers[i] + numbers[j]) == target) {
        // return new int[] { i + 1, j + 1 };
        // }
        // }
        // }
        // return new int[] { -1, -1 };

        int n = numbers.length;
        int low = 0;
        int high = n - 1;
        int ans[] = new int[n];

        while (low <high) {
            if ((numbers[low] + numbers[high]) == target) {
                ans[low] = low;
                ans[low + 1] = high;
            }
            low++;
            high--;
        }
        return ans;

    }

    public static void main(String args[]) {

        int arr[] = { 2, 7, 11, 15 };

        int result[] = twosum(arr, 29);

        System.out.print("[" + result[0] + "," + result[1] + "]");
    }
}
