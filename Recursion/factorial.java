public class factorial {

    public static int Fact(int n) {
        if (n == 1) {
            return 1;
        }
        int fibn = n * Fact(n - 1);
        return fibn;
    }

    public static void main(String[] args) {

        System.out.println(Fact(5));
    }
}
