public class count {

    static void printarr(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int findmax(int arr[]) {
        int max = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    static void Countsort(int arr[]) {
        int max = findmax(arr);

        int[] freqarr = new int[max + 1];
        int k = 0;

        for (int i = 0; i < freqarr.length - 1; i++) {
            freqarr[arr[i]]++;
        }

        for (int i = 0; i < freqarr.length - 1; i++) {
            for (int j = 0; j < freqarr[i]; j++) {
                arr[k++] = i;
            }
        }

        printarr(arr);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 6, 2, 7, 9, 3, 4, 6, 8, 3, 1, };

        System.out.print("This is original array :- ");
        printarr(arr);
        System.out.println();
        System.out.print("This is count array :- ");
        Countsort(arr);
    }
}
