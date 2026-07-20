public class dupliacteno {

    public static boolean duplicatescontain(int nums[], int k) {

        boolean flag = false;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == k && count <= k) {
                flag = true;
                count++;
            } else {
                flag = false;
            }
        }
        
        return flag;

    }

    public static void main(String args[]) {
        int arr[] = { 1 };

        System.out.print(duplicatescontain(arr, 2));

    }
}
