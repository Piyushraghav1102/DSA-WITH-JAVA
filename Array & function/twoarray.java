import java.util.*;

public class twoarray {

    public static boolean Search(int arr[][], int key) {

        for (int i = 0; i < arr.length; i++) {
            // for colums
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found :-");
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int row = matrix.length;
        int col = matrix[0].length;

        System.out.println("Enter the elements in array :-");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the search elemenst :-");
        int key = sc.nextInt();

        Search(matrix, key);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
