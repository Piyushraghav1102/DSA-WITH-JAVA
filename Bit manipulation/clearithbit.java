public class clearithbit {

    public static int clearbit(int i, int n) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static void main(String agrs[]) {
        System.out.print(clearbit(1, 11));
    }
}
