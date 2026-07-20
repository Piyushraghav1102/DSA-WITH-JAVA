import java.util.*;

public class spiral {

    public static void PrintSprial(int nums[][]) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Sprialmat(int nums[][], int r, int c) {
        int Toprow = 0, Bottomrow = r - 1;
        int Leftcol = 0, Rightcol = c - 1;

        int totalele = 0;

        while (totalele < (r * c)) {

            // for the top row
            for (int j = Leftcol; j <= Rightcol && totalele < r * c; j++) {
                System.out.print(nums[Toprow][j] + " ");
                totalele++;
            }
            Toprow++;
            // for the rightcol
            for (int i = Toprow; i <= Bottomrow && totalele < r * c; i++) {
                System.out.print(nums[i][Rightcol] + " ");
                totalele++;
            }
            Rightcol--;
            // for the bottom row
            for (int j = Rightcol; j >= Leftcol && totalele < r * c; j--) {
                System.out.print(nums[Bottomrow][j] + " ");
                totalele++;
            }
            Bottomrow--;
            // for the left col
            for (int i = Bottomrow; i >= Toprow && totalele < r * c; i--) {
                System.out.print(nums[i][Leftcol] + " ");
                totalele++;
            }
            Leftcol++;
        }
    }

    public static int[][] Spiralgenerate(int n) {

        int curr = 1;
        int ans[][] = new int[n][n];

        int Toprow = 0, Bottomrow = n - 1;
        int Leftcol = 0, Rightcol = n - 1;

        int totalele = 0;

        while (totalele < (n * n)) {

            // for the top row
            for (int j = Leftcol; j <= Rightcol && totalele < n * n; j++) {
                ans[Toprow][j] = curr;
                totalele++;
                curr++;
            }
            Toprow++;
            // for the rightcol
            for (int i = Toprow; i <= Bottomrow && totalele < n * n; i++) {
                ans[i][Rightcol] = curr;
                totalele++;
                curr++;
            }
            Rightcol--;
            // for the bottom row
            for (int j = Rightcol; j >= Leftcol && totalele < n * n; j--) {

                ans[Bottomrow][j] = curr;
                totalele++;
                curr++;
            }
            Bottomrow--;
            // for the left col
            for (int i = Bottomrow; i >= Toprow && totalele < n * n; i--) {
                ans[i][Leftcol] = curr;
                totalele++;
                curr++;
            }
            Leftcol++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * System.out.println("Enter the rows :-");
         * int r = sc.nextInt();
         * 
         * System.out.println("Enter the colums");
         * int c = sc.nextInt();
         * 
         * int nums[][] = new int[r][c];
         * 
         * 
         * for (int i = 0; i < r; i++) {
         * for (int j = 0; j < c; j++) {
         * nums[i][j] = sc.nextInt();
         * }
         * }
         * 
         * PrintSprial(nums);
         * Sprialmat(nums, r, c);
         * 
         */

        // for generation of matrix input
        System.out.println("Enter the rows and colums :-");
        int n = sc.nextInt();

        int nums[][] = Spiralgenerate(n);
        PrintSprial(nums);

    }
}
