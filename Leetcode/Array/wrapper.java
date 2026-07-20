public class wrapper {
    public static void Printnatural(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        Printnatural(n-1);
        System.out.println(n);
    }



    public static void main(String[] args) {

        Printnatural(5);
    }
}
