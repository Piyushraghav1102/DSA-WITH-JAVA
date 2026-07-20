public class Kmul {

    public static void Kmul(int n, int k) {
        if (k == 1) {
            System.out.println(n * k);
            return;
        }
        Kmul(n, k - 1);
        System.out.println(k * n);

    }

    public static void main(String[] args) {

        int n = 5, k = 5;

        Kmul(n, k);

    }
}
