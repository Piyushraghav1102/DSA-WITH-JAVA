class Fibo{

    public static int Fiboprint(int n){
        //Base Class
        if(n<2){
            return n;
        }

        return Fiboprint(n-1) + Fiboprint(n-2);

    }

    public static void main(String[] args) {
        System.out.println(Fiboprint(6));
    }
}