public class revselection {

    static void printarr(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void Selectionrev(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int min = i;
            for (int j = i + 1; j < n - 1; j++) {

                if (arr[min] > arr[j])
                    min = j;

            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        printarr(arr);
    }

    public static void main(String[] args) {

        int arr[] = { 7, 3, 0, 9, 3, 4, 1 };

        Selectionrev(arr);
    }
}
