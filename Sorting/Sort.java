
public class Sort {

    public static void buble(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            // for compare adjacent elments
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
        }

    }

    public static void selectionsort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int minelement = i;
            for (int j = i + 1; j < arr.length; j++) {
                // for pic a minimum element in the array
                if (arr[j] < arr[minelement]) {
                    minelement = j;
                }
            }
            // swap
            int temp = arr[minelement];
            arr[minelement] = arr[i];
            arr[i] = temp;
        }
        // for the print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void insertsort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int key = i;
            int j = i - 1;
            // dono condition should be true
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 2, 3, 6 };
        // buble(arr);
        // selectionsort(arr);
        insertsort(arr);
    }

}
