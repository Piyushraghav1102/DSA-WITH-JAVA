public class singleappear {

    public static void singleapp(int nums[]) {

        boolean key = false;
        int key1 = 0;

        for (int i = 1; i < nums.length; i++) {
            int key2 = i;
            int j = i - 1;
            // dono condition should be true
            while (j >= 0 && nums[j] > key2) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = key2;

        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                key = false;
            } else {
                key1 = nums[i + 1];
            }
        }

        System.out.println(+key1);
    }

    public static void main(String args[]) {
        int nums[] = { 4, 1, 2, 1, 2 };

        singleapp(nums);
    }
}
