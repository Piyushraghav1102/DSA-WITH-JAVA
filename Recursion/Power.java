class Power {
    public static void main(String[] args) {
        System.out.println(Printpower(2, 10));
    }

    static int Printpower(int x, int n) {

        
        if (n == 0) {
            return 1;
        }
        int xn = x * Printpower(x, n - 1);
        
//
        return xn;
    }
}