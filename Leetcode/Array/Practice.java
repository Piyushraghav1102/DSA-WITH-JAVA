public class Practice {

    public static int removeduplicates(int nums[]) {

        int n = nums.length;

        int j = 0;
        for (int i = 0; i < n - 1; i++) {

            if (nums[i] != nums[i + 1]) {

                nums[j] = nums[i];
                j++;
            }

        }
        return j + 1;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 1, 2 };

        System.out.print(removeduplicates(arr));

    }
}
