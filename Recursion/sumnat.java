public class sumnat {

    public static int sumnatu(int n) {
        if (n == 0) {
            return n;
        }
        if (n % 2 == 0) {
            return sumnatu(n - 1) - n;
        } else {
            return sumnatu(n - 1) + n;
        }

    }

    public static void main(String[] args) {
        System.out.println(sumnatu(5));
    }
}
