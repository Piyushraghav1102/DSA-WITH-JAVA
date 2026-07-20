public class sumofdigit {
    public static void main(String args[]) {

        System.out.println(Sumdigit(1234));
        // Reverse(1234);

    }

    static int Sumdigit(int n) {
        if (n == 0) {
            return 0;

        }
        int sum = (n % 10) + Sumdigit(n / 10);
        return sum;
    }

    public static void Reverse(int n) {
        if (n == 0) {
            return;
        }
        Reverse(n / 10);
        System.out.println(n);
    }

}
