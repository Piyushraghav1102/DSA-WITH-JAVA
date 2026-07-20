import java.util.*;

public class merge2sorted {

    public static void merge(int nums1[], int m, int nums2[], int n) {
        // int num3[] = new int[m + n];
        int a = m - 1; // pointer for nums1
        int b = n - 1; // pointer for nums2
        int c = m + n - 1;

        /*
         * int c = 0; // pointer for num3
         * 
         * // Corrected loop condition: use < instead of <=
         * while (a < m && b < n) {
         * if (nums1[a] < nums2[b]) {
         * num3[c++] = nums1[a++];
         * } else {
         * num3[c++] = nums2[b++];
         * }
         * }
         * 
         * // Copy remaining elements from nums1
         * while (a < m) {
         * num3[c++] = nums1[a++];
         * }
         * 
         * // Copy remaining elements from nums2
         * while (b < n) {
         * num3[c++] = nums2[b++];
         * }
         * 
         */

        while (a >= 0 && b >= 0) {

            if (nums1[a] > nums2[b]) {
                nums1[c] = nums1[a];
                a--; // full optimised code
                c--;
            } else {
                nums1[c] = nums2[b];
                c--;
                b--;
            }
        }
        while (a >= 0) {
            nums1[c] = nums1[a];
            a--;
            c--;
        }
        while (b >= 0) {
            nums1[c] = nums2[b];
            b--;
            c--;
        }
        // Print the merged array
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 0, 0, 0 };
        int arr2[] = { 2, 5, 6 };

        merge(arr, 3, arr2, 3);

    }
}
