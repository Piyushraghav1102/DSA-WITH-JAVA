public class SOD {

    public static int Sod(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        // n/10 is for the give the questiont
        // n%10 is give the last digit if n
        return Sod(n / 10) + n % 10;
    }

    public static int Cod(int n) {
        int count = 0;
        if (n >= 0 && n <= 9) {

            return count = 1;
        }

        count = Cod(n / 10);
        count++;

        return count;

    }

    public static void main(String[] args) {

        System.out.println(Cod(1234));

    }
}
