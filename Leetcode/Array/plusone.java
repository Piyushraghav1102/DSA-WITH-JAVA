public class plusone {

    public static int[] plusone1(int digits[]) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String args[]) {

        int arr1[] = { 1, 2, 3 };
        plusone1(arr1);
    }
}
