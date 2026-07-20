import java.util.Arrays;

public class Lc875 {

    public static int findhours(int piles[], int cap) {
        int n = piles.length;

        int totalhrs = 0;

        for (int i = 0; i < n; i++) {
            totalhrs += (piles[i] + cap - 1) / cap;
        }
        return totalhrs;
 }
 
 
    public static int minEatingSpeed(int[] piles, int h) {
        
        int low = 1, high = Arrays.stream(piles).max().getAsInt();
        int minhours = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            int totalhrs = findhours(piles, mid);


            if (totalhrs <= h) {
               minhours=mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return minhours;
 
    }
    public static void main(String[] args) {
        
        int piles[] = { 30,11,23,4,20 };
        
        System.out.println("This is the minimum time of eat all bananas :- "+minEatingSpeed(piles, 6));
    }
}
