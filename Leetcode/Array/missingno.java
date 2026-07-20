public class missingno {

    public static int findmissno(int nums[]) {
        int n = nums.length;
        int missno = nums.length;

        for (int i = 0; i < n; i++) {
            missno ^= nums[i];
            missno ^= i;
        }
        return missno;
    }

    public static int removveelem(int nums[], int val) {
        int k = 0, j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            } else {
                k++;
                nums[j] = nums[i];
                j++;
            }
        }
        return k;   
    }

    public static void main(String args[]) {

        int arr1[] = { 0, 1, 2, 2, 3, 0, 4, 2 };

        // System.out.print(findmissno(arr1));
        System.out.print(removveelem(arr1, 2));
    }
}
