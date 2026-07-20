public class Getithbit {

    public static int getbit(int i, int n) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String args[]) {

        System.out.print(getbit(3, 11));
    }
}
