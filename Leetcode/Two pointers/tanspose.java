import java.util.*;

public class tanspose {

    public static void printmatrix(int matrix[][], int r, int c) {

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static int[][] transpose(int matrix[][], int r, int c) {

        int matrix1[][] = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                matrix1[i][j] = matrix[j][i];
            }
        }
        return matrix;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row and colums:-");
        int r = sc.nextInt();

        System.out.println("Enter the columns :- ");
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];

        System.out.println("Enter the matrix :-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printmatrix(matrix, r, c);
        System.out.println(transpose(matrix, r, c));

    }
}
