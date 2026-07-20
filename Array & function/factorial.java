
public class factorial {

    public static int Factorialprint(int n) {

        if (n == 0) {
            return 1;
        } // Factorial print

        int fact = n * Factorialprint(n - 1);
        return fact;

    }

    public static int sumofn(int n) {

        if (n == 0) {
            return 0; // Sum of n
        }
        return n + sumofn(n - 1);

    }

    public static int Fibo(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int fibn = Fibo(n - 1) + Fibo(n - 2);

        return fibn;
    }

    public static boolean issorted(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);

    }

    public static void main(String args[]) {

        // System.out.println(Factorialprint(5));
        // System.out.println(sumofn(5));
        // System.out.println(Fibo(6));

        int arr[] = { 1, 2, 9, 4, 5 };
        System.out.println(issorted(arr, 0));
        ;
    }
}