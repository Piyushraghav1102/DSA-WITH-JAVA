public class FindMax {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.print(FindMax(arr, 0));
    }

    public static int FindMax(int arr[], int i) {

        if (i == arr.length - 1) {
            return arr[i];
        }

        int Cmaxno = arr[i];
        int nmaxno = FindMax(arr, i + 1);
        return Math.max(Cmaxno, nmaxno);

    }
}
