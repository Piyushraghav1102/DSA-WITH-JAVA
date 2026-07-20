class LLrecusion {
    public static void main(String agrs[]) {
        System.out.println(Numberofsteps(144));
    }
//1342
    static int Numberofsteps(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        if (n % 2 == 0) {
            return helper(n / 2, c + 1);
        }
        return helper(n - 1, c + 1);

    }
}