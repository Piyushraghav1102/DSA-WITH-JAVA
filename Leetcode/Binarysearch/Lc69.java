public class Lc69 {
    
    public static int mySqrt(int x) {
        
        int low = 1, high = x;

        while (low <= high) {
            int mid = (low + high) / 2;

            long val = (long) mid * mid;

            if (val <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    
    public static void main(String[] args) {
        int x = 28;

        System.out.println(mySqrt(x));
    }
}
