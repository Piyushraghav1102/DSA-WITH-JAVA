public class rotate {
    public static void rotate1(int nums[], int k) {
        int n = nums.length;
        int i = 0;
        int j = n - k;
        int temp = 0;
        while (i < n - k && j < n) {
            
            temp = nums[j];
            nums[(i + k) % n] = nums[i];
            nums[(j + k) % n] = temp;
            i++;
            j++;
        }

        for (int m = 0; m < n; m++) {
            System.out.print(nums[m]);
        }
    }

    public static void main(String args[]) {

        int arr2[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate1(arr2, 3);
    }
}
