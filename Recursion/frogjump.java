public class frogjump {

    static int calminjump(int arr[], int ind) {

        if (ind == arr.length - 1)
            return 0;

        // calculate 0 tof 1st min and after 1 to n-1 cost

        int mincost1 = Math.abs(arr[ind] - arr[ind + 1]) + calminjump(arr, ind + 1);

        if (ind == arr.length - 2)
            return mincost1;

        // calculate 0 tof 2st min and after 2 to n-1 cost

        int mincost2 = Math.abs(arr[ind] - arr[ind + 2]) + calminjump(arr, ind + 2);

        return Math.min(mincost1, mincost2);

    }

    public static void main(String[] args) {

        int arr[] = { 10, 30, 40, 20 };

        System.out.println("Minimum jump of frog :-" + calminjump(arr, 0));
    }
}
