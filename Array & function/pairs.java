import java.util.*;

public class pairs {

    public static void Pairsprint(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            // elements of pairs
            int curr = arr[i];
            for (int j = 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void subarray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int low = i;
            for (int j = i; j < arr.length; j++) {
                int high = j;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void revarr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - 1 - i] = arr[i];

        }
        // for print the reverse array
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
    }

    public static void presufix(int arr[]) {

        int n = arr.length;

        int prefix[] = new int[n];
        int sufix[] = new int[n];

        // For prifix
        prefix[0] = arr[0];
        for (int i = 0; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i];

        }
        for (int i = 0; i < n; i++) {
            System.out.println("" + prefix[i]);
        }

        sufix[n] = arr[n];
        for (int i = n; i < 1; i--) {
            sufix[i] = sufix[i + 1] * arr[i];

        }
        for (int i = 0; i < n; i++) {
            System.out.println("" + sufix[i]);
        }

    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };

        // Pairsprint(arr);
        // subarray(arr);
        // revarr(arr);
        presufix(arr);
    }
}
