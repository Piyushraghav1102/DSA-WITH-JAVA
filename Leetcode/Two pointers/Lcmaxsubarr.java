public class Lcmaxsubarr {
    public static int calmaxsubarr(int arr[], int k) {
        int n = arr.length;
        int low = 0,currsum=0,maxlen=Integer.MIN_VALUE;

        for (int high = 0; high < n; high++) {
            currsum += arr[high];
           if (currsum > k) {
               currsum-= arr[low];
               low++;
            }
           maxlen = Math.max(maxlen, high - low+1);
                
        }
        return maxlen;
    }
    
    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };
          
        System.out.print("This is the maximum length of masxsumsubarr :- "+calmaxsubarr(arr, 15));
    }
}
