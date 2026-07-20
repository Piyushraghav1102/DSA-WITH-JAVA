class HCF {

    public static int calhcf(int n, int n2) {

        while (n % n2 != 0) {
            int rem = n % n2;
            n = n2;
            n2 = rem;
        }
        return n2;

    }

    public static int optimizedgcd(int n, int n2) {
        if (n2 == 0) {
            return n;
        }
        return optimizedgcd(n2, n % n2);
    }

    public static void main(String[] args) {

        // bruteforce
        System.out.println(calhcf(4, 9));

        // optimized
        System.out.println(optimizedgcd(4, 9));

    }

}
