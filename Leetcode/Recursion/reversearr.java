
public class reversearr {
    
    
    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }

    public static void revfun(int arr[], int i,int n) {
      
        if (i >= n / 2)
            return;

        swap(arr, i, n - i - 1);
        revfun(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        
        revfun(arr, 0, arr.length);
    }
}
