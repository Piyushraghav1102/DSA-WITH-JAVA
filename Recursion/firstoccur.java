public class firstoccur {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(Firstocc(arr, 5, 0));
    }
    
    // Problem is you are searching element
    public static int Firstocc(int arr[], int key, int i) {

        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return Firstocc(arr, key, i + 1);
    }
}
