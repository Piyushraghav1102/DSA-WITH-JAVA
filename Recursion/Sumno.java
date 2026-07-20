public class Sumno {
    public static void main(String args[]) {
        System.out.println(Sum(5));
    }

    public static int Sum(int n) {
        if (n == 0) {
            return 0;
        }

        int sum = Sum(n - 1) + n;
        return sum;
    }
}
