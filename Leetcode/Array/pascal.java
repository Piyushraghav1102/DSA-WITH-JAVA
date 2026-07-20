import java.util.*;

class pascal {

    public static void Print2d(int nums[][]) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pascals(int n) {
        int ans[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            // this is for the dynamically alloted row
            ans[i] = new int[i + 1];

            // this is for the initialize first & last Row =1
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                // for pascals
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows :-");
        int n = sc.nextInt();

        int nums[][] = pascals(n);

        Print2d(nums);
    }
}