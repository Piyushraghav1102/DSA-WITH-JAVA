public class movezero {

    public static int[] zeros(int[] nums) {

        int n = nums.length;
        int insert = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] != 0) {
                nums[insert] = nums[i];
                insert++;
            }

        }
        while (insert < n) {
            nums[insert] = 0;
            insert++;
        }
        return nums;

    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 0, 3, 12 };
        int res[] = zeros(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
