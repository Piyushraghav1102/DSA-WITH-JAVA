import java.util.*;

public class Matrixsum {

    public static void Printmatrix(int nums[][]) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int Calsummat(int nums[][], int R1, int C1, int R2, int C2) {
        int sum = 0;

        for (int i = R1; i <= R2; i++) {
            for (int j = C1; j <= C2; j++) {

                sum += nums[i][j];
            }
        }

        return sum;
    }

    public static int[][] CalPref(int nums[][]) {
        int r = nums.length;
        int c = nums[0].length;

        // for the horizonatal
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                nums[i][j] += nums[i][j - 1];
            }
        }

        // for the vertically
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                nums[i][j] += nums[i - 1][j];
            }
        }

        return nums;
    }

    public static int Calsummat2(int nums[][], int R1, int C1, int R2, int C2) {

        int sum = 0;

        for (int i = R1; i <= R2; i++) {
            sum += nums[i][C2] - nums[i][C1 - 1];
        }

        return sum;

    }

    public static int Calsummat3(int nums[][], int R1, int C1, int R2, int C2) {

        int top = nums[R1 - 1][C2];
        int left = nums[R2][C1 - 1];
        int topleft = nums[R1 - 1][C1 - 1];
        int wholesum = nums[R2][C2];

        int Calsum = wholesum - top - left + topleft;

        return Calsum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row and colums :-");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int nums[][] = new int[r][c];

        System.out.print("Enter the values in matrix :-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the given coordinates :-");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int nums2[][] = CalPref(nums);

        Printmatrix(nums2);

        System.out.println("This is the sum of matrix :- " + Calsummat3(nums2, r1,
                c1, r2, c2));

    }
}
