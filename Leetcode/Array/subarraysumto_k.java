public class subarraysumto_k {

    public static int subarraysum(int nums[], int target) {

        int n = nums.length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {

                sum += nums[j];
                if (sum == target) {
                    count++;
                }

            }
        }
        return count;
    }

    public static void main(String arg[]) {

        int arr[] = { 1, 1, 1 };
        System.out.println(subarraysum(arr, 2));
    }
}
