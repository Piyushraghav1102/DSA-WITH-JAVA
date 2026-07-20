
public class maximumsubsum {

    public static void maximumsubsum(int arr[]) {
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {

                    currsum = currsum + arr[k];

                }
                System.out.println(currsum);
                maxsum = Math.max(maxsum, currsum);

            }
        }
        System.out.println("Maxsum :- " + maxsum);
    }

    public static int maxsubopti(int nums[]) {

        int n = nums.length;
        int arr2[] = new int[n];
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        // calculating subarray sum
        arr2[0] = nums[0];
        for (int i = 1; i < n; i++) {
            arr2[i] = arr2[i - 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (i == 0) {
                    currsum = arr2[j];
                } else {
                    currsum = arr2[j] - arr2[i - 1];
                }

                maxsum = Math.max(maxsum, currsum);
            }
        }
        return maxsum;
    }

    public static void main(String args[]) {

        int arr[] = { 1, -3, 2, -4, 2 };
        // maximumsubsum(arr);
        System.out.println(maxsubopti(arr));
    }
}
