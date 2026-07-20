public class threesum {

    public static void threesu(int nums[]) {

        int n = nums.length;
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
                            System.out.print("(" + nums[i] + "," + nums[j] + "," + nums[k] + ")");
                        } else {
                            System.out.print("(" + nums[i] + "," + nums[j] + "," + nums[k] + ")");
                        }

                    }

                }
            }
        }

    }

    public static void main(String args[]) {

        int arr[] = { -1, 0, 1, 2, -1, -4 };
        threesu(arr);
    }
}
