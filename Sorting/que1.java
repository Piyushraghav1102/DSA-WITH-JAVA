public class que1 {
    static void printarr(int arr2[]) {

        for (int i = 0; i < arr2.length - 1; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    static void Ques(int arr[]) {

        int[] countarr = new int[3];

        for (int i = 0; i < countarr.length - 1; i++) {
            countarr[arr[i]]++;
        }
        int k = 0;

        for (int i = 0; i < countarr.length - 1; i++) {
            for (int j = 0; j < countarr[i]; j++) {
                arr[k++] = i;
            }
        }
        printarr(arr);
    }

    public static void main(String[] args) {
        int nums1[] = { 0, 2, 1, 2, 0, 0 };
        Ques(nums1);

    }
}
