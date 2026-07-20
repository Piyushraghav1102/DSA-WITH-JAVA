public class setithbit {

    public static int sebit(int n, int i) {

        int bitmask = 1 << i;
        return n = n | bitmask;

    }

    public static void main(String[] args) {

        System.out.print(sebit(10, 3));
    }
}
