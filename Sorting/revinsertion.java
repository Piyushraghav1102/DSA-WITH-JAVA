public class revinsertion {

    static void printarr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    static void Insertionrev(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            // pick first element and assume that its sorted and place it at correct sorted
            // array with swapping

            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }

        printarr(arr);
    }

    public static void main(String[] args) {

        int arr2[] = { 2, 5, 9, 1, 3, 5, 7 };

        Insertionrev(arr2);
    }
}
