
class array {
    public static int[] productExceptSelf(int[] nums) {

        int arr2[] = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {

            arr2[i] = arr2[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int j = nums.length - 2; j >= 0; j--) {
            // suffix = suffix * nums[j + 1];
            // arr2[j] *= suffix;
            // System.out.println(suffix);
            suffix *= nums[j + 1];
            arr2[j] *= suffix;
            System.out.println(arr2[j]);
        }
        return arr2;
    }

    public static int findmax(int nums[]) {

        int major = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] > major) {
                major = nums[i];
                count++;
            } else {
                if (count > nums.length / 2) {
                    major = major;
                }
            }
        }
        return major;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(findmax(arr));
        // System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}