class countzeros {
    public static void main(String[] args) {

        System.out.println(help(13000));
    }

    static int help(int n) {
        return countzero(n, 0);
    }

    public static int countzero(int n, int c) {
        if (n == 0) {
            return c;
        }
        int cz = (n % 10);

        if (cz == 0) {
            return countzero(n / 10, c + 1);
        }
        return countzero(n / 10, c);
    }

}