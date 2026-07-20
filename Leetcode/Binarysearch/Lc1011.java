import java.util.Arrays;

public class Lc1011 {
   


    public static int findnodays(int weights[], int cap) {
        int n = weights.length;
        int day = 1, load = 0;

        for (int i = 0; i < n; i++) {

            if (load + weights[i] > cap) {
                day++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return day;
    }
    
    public static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;

        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while (low <= high) {
            int mid = (low + high) / 2;

            int Noofdays = findnodays(weights, mid);

            if (Noofdays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static void main(String[] args) {
        int weights[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
       
        System.out.println(shipWithinDays(weights, 5));
    }
}
