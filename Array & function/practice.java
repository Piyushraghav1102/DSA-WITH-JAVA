
import java.util.Scanner;

public class practice {

    public static void printarr(int nums[]) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
        }

    }

    public static int findmax(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int secondmax(int arr[]) {
        int max = findmax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = findmax(arr);
        return secondmax;
    }

    public static void swappig(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        // System.out.println(a);
        // System.out.println(b);
    }

    public static void Reverse(int nums[]) {

        int low = 0;
        int high = nums.length - 1;
        int temp = Integer.MIN_VALUE;

        while (low < high) {
            // temp = nums[low];
            // nums[low] = nums[high];
            // nums[high] = temp;
            swappig(low, high);
            low++;
            high--;
        }

        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.print(nums[i]);
        }

    }

    public static void Rotatearray(int nums[], int k) {
        int n = nums.length;
        k = k % n;
        int j = 0;
        int ans[] = new int[n];

        for (int i = n - k; i < n; i++) {
            ans[j++] = nums[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]);
        }
    }

    public static void sortarr(int nums[]) {
        int countzero = 0;
        int n = nums.length;
        // for (int i = 0; i < n; i++) {

        // if (nums[i] == 0) {
        // countzero++; // counting zeros
        // }
        // }

        // for (int i = 0; i < n; i++) {
        // if (i < countzero) {
        // nums[i] = 0;
        // } else {
        // nums[i] = 1;
        // }
        // }

        // with the one traversal
        int low = 0;
        int high = n - 1;

        while (low < high) {
            if (nums[low] == 1 && nums[high] == 0) {
                swappig(low, high);
                low++;
                high--;
            }
            if (nums[low] == 0) {
                low++;
            }
            if (nums[high] == 1) {
                high--;
            }

        }
        printarr(nums);
    }

    public static int prefixsum(int nums[], int low, int high) {

        int n = nums.length;
        nums[0] = 0;
        for (int i = 1; i < n - 1; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        int sum = nums[high] - nums[low - 1];

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = { 1, 2, 3, 4, 5 };
        // System.out.println(secondmax(nums));

        // int a = 3;
        // int b = 9;
        // swappig(a, b);

        // Reverse(num);

        // System.out.println("Enter the rotation of array :-");
        // int k = sc.nextInt();

        // Rotatearray(num, k);

        // sortarr(num);

        System.out.println(prefixsum(num, 2, 3));
    }
}
