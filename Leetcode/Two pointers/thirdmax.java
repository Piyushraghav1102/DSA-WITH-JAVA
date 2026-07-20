import java.util.Arrays;

class thirdmax {

    public static int findthirdmax(int nums[]) {
        int n = nums.length;
        int k = 0, count = 1;

        Arrays.sort(nums);

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
            if (count == 3) {
                k = nums[i - 1];
            }
        }
        return k;
    }

    public static void main(String args[]) {

        int arr[] = { 2, 2, 3, 1 };
        System.out.println(findthirdmax(arr));
    }
}