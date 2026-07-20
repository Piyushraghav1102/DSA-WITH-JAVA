import java.util.Scanner.*;
import java.util.*;

public class Arrray2 {

    public static int linearsearch(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            } else {
                return -1;
            }
        }
        return key;

    }

    public static int largno(int arr[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
                return i = i;
            }
        }

        return largest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 23, 67, 45, 89, 98 };

        // System.out.print("Enter the element to search :-");
        // int n = sc.nextInt();
        // int key = n;

        // int index = linearsearch(arr, key);

        // if (index == -1) {
        // System.out.println("Element " + key + "is not found in array");
        // } else {
        // System.out.println("Element found at :-" + index);
        // }

        // System.out.println("Enter the size of Array :- ");
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {

        // arr[i] = sc.nextInt();
        // }

        // for (int i = 1; i <= n; i++) {

        // System.out.println(arr[i]);
        // }

        System.out.println("Largest element is " + largno(arr));
    }
}
