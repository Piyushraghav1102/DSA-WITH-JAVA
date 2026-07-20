import java.util.Arrays;

public class Intersectiontwoarray {

    public static int[] intersect(int nums[], int nums2[]) {

        int result[] = new int[Math.min(nums.length, nums2.length)];
        int i = 0, j = 0;
        int k = 0;

        Arrays.sort(nums);
        Arrays.sort(nums2);

        while (i < nums.length && j < nums2.length) {
            if (nums[i] == nums2[j]) {

                result[k] = nums[i];
                k++;
                i++;
                j++;
            } else if (nums[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(result, k);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 2, 1 };
        int arr2[] = { 2, 2 };
        int result[] = new int[3];
        result = intersect(arr, arr2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
