public class backtrackArr {
    public static void Helper(int arr[], int i, int val) {

            //Base case 
            if (i >= arr.length) {
                Printarr(arr);
                return;
        }
            
            //recursion
            arr[i] = val;
            Helper(arr, i + 1, val + 1);
            arr[i] = arr[i] - 2;



    }

    public static void Printarr(int arr[]) {
        for (Object elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = new int[5];
        Helper(arr, 0, 1);
        Printarr(arr);
    }
}
